/*
 *     Copyright 2022 Severalnines Inc. @ https://severalnines.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.severalnines.clustercontrol.api.abstraction.job;

import com.severalnines.clustercontrol.api.abstraction.common.AbstractAuthenticationStrategy;
import com.severalnines.clustercontrol.api.abstraction.common.ClusterControlApiException;
import com.severalnines.clustercontrol.api.abstraction.common.ClusterControlInputException;
import com.severalnines.clustercontrol.api.abstraction.pojo.DbCluster;
import com.severalnines.clustercontrol.api.abstraction.pojo.Host;
import com.severalnines.clustercontrol.api.abstraction.pojo.MongoReplicaset;
import com.severalnines.clustercontrol.api.abstraction.pojo.MongoServer;
import org.openapitools.ccapi.client.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class MongoDbClusterJob extends AbstractDbClusterJob {

    private static final Logger logger = LoggerFactory.getLogger(MongoDbClusterJob.class);

    public MongoDbClusterJob(AbstractAuthenticationStrategy authStrategy, String jsonStr, JobsJobJobSpec.CommandEnum jobType) {
        super(authStrategy, jsonStr, jobType);
    }

    @Override
    protected void setDefaultPort(JobsJobJobSpecJobData jsjD) {
        jsjD.setPort(27017);
    }

    @Override
    protected void setDefaultDataDir(JobsJobJobSpecJobData jsjD) {
        jsjD.setDataDir("/var/lib/mongodb");
    }

    @Override
    protected void setClusterType(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        String clusterType = createDetails.getClusterType();
        if (clusterType != null && clusterType.length() > 0 &&
                clusterType.compareToIgnoreCase("mongodb") == 0) {
            jsjD.setClusterType(JobsJobJobSpecJobData.ClusterTypeEnum.fromValue(clusterType));
        } else {
            throw new ClusterControlInputException("Unsupported or unspecified cluster_type. Valid values are (mongodb)");
        }
    }

    @Override
    protected void setDefaultDbUser(JobsJobJobSpecJobData jsjD) {
        jsjD.setDbUser("mongoadmin");
    }

    @Override
    protected void setConfigServers(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        JobsJobJobSpecJobDataConfigServers jsjdCS = new JobsJobJobSpecJobDataConfigServers();
        MongoServer cs = createDetails.getConfigServers();
        if (cs == null) {
            throw new ClusterControlInputException("Config Server(s) unspecified");
        }
        jsjdCS.setRs(cs.getRs());
        for (Host h : cs.getMembers()) {
            JobsJobJobSpecJobDataConfigServersMembersInner member = new JobsJobJobSpecJobDataConfigServersMembersInner();
            member.setHostname(h.getHostname());
            member.setHostnameData(h.getHostname());
            String port = h.getPort();
            if (port != null && port.length() > 0) {
                member.setPort(h.getPort());
            } else {
                member.setPort("27019");
            }
            jsjdCS.addMembersItem(member);
        }

        jsjD.setConfigServers(jsjdCS);
    }

    @Override
    protected void setMongosServers(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        List<JobsJobJobSpecJobDataConfigServersMembersInner> jsjdCS = new ArrayList();
        for (Host h : createDetails.getMongosServers()) {
            JobsJobJobSpecJobDataConfigServersMembersInner member = new JobsJobJobSpecJobDataConfigServersMembersInner();
            member.setHostname(h.getHostname());
            member.setHostnameData(h.getHostname());
            String port = h.getPort();
            if (port != null && port.length() > 0) {
                member.setPort(h.getPort());
            } else {
                member.setPort("27017");
            }
            jsjdCS.add(member);
        }
        jsjD.setMongosServers(jsjdCS);
    }

    @Override
    protected void setReplicasets(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        for (MongoReplicaset rs : createDetails.getReplicaSets()) {
            JobsJobJobSpecJobDataReplicaSetsInner rsets = new JobsJobJobSpecJobDataReplicaSetsInner();
            rsets.setRs(rs.getRs());
            for (Host h : rs.getMembers()) {
                JobsJobJobSpecJobDataReplicaSetsInnerMembersInner mem = new JobsJobJobSpecJobDataReplicaSetsInnerMembersInner();
                mem.setHostname(h.getHostname());
                String tmp = h.getPort();
                if (tmp != null && tmp.length() > 0) {
                    mem.setPort(tmp);
                } else {
                    mem.setHostname("27018");
                }
                tmp = h.getPriority();
                if (tmp != null && tmp.length() > 0) {
                    mem.setPriority(tmp);
                }
                rsets.addMembersItem(mem);
            }
            jsjD.addReplicaSetsItem(rsets);
        }
    }

}
