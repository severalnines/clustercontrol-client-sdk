package opertest

import (
	"encoding/json"
	"fmt"
	"github.com/severalnines/clustercontrol-client-sdk/go/pkg/openapi"
	"io"
	"os"
)

func getAllClusterInfo() {
	clusters := *openapi.NewClusters("getallclusterinfo")
	// resp, err = apiClient.AuthApi.ClustersPost(newCtx).Clusters(clusters).Execute()
	resp, err := gApiClient.ClustersApi.ClustersPost(gNewCtx).Clusters(clusters).Execute()
	if err != nil {
		printError(err, resp)
		return
	}
	fmt.Fprintf(os.Stderr, "Resp `ClustersPost.getallclusterinfo`: %v\n", resp)
}

func getClusterInfo(cn *string, ci *int32) {
	clusters := *openapi.NewClusters("getclusterinfo")
	if cn != nil {
		// clusters.SetClusterName("PG-Streaming-Replication")
		clusters.SetClusterName(*cn)
	}
	if ci != nil {
		clusters.SetClusterId(*ci)

	}
	// resp, err = apiClient.AuthApi.ClustersPost(newCtx).Clusters(clusters).Execute()
	resp, err := gApiClient.ClustersApi.ClustersPost(gNewCtx).Clusters(clusters).Execute()
	if err != nil {
		printError(err, resp)
		return
	}
	fmt.Fprintf(os.Stderr, "Resp `ClustersPost.getallclusterinfo`: %v\n", resp)

	respBytes, err := io.ReadAll(resp.Body)
	if err != nil {
		// log.Fatal(err)
		printError(err, resp)
		return
	}

	var clusterInfo ClusterInfoRespJson
	err = json.Unmarshal(respBytes, &clusterInfo)
	if err != nil {
		// log.Fatal(err)
		printError(err, resp)
		return
	}

	fmt.Fprintf(os.Stderr, "Resp `Job`: %v\n", clusterInfo)
}

func isClusterNameAcceptable(cn *string) bool {
	ret := false

	discovery := *openapi.NewDiscovery("checkClusterName")
	if cn != nil {
		// clusters.SetClusterName("PG-Streaming-Replication")
		discovery.SetNewClusterName(*cn)
	}
	// resp, err = apiClient.AuthApi.ClustersPost(newCtx).Clusters(clusters).Execute()
	// resp, err := gApiClient.DiscoveryApi.DiscoveryPost(gNewCtx).Execute()
	resp, err := gApiClient.DiscoveryApi.DiscoveryPost(gNewCtx).Discovery(discovery).Execute()
	if err != nil {
		printError(err, resp)
		return ret
	}
	fmt.Fprintf(os.Stderr, "Resp `DiscoveryPost.checkClusterName`: %v\n", resp)

	respBytes, err := io.ReadAll(resp.Body)
	if err != nil {
		// log.Fatal(err)
		printError(err, resp)
		return ret
	}

	var chkClusterNameResp ResponseCheckClusterName
	err = json.Unmarshal(respBytes, &chkClusterNameResp)
	if err != nil {
		// log.Fatal(err)
		printError(err, resp)
		return ret
	}

	fmt.Fprintf(os.Stderr, "Resp `CheckClusterName`: %v\n", chkClusterNameResp)

	return chkClusterNameResp.Is_Acceptable
}

func getClusterTypes() {
	clusTypes := *openapi.NewDiscovery("getSupportedClusterTypes")
	// resp, err = apiClient.AuthApi.ClustersPost(newCtx).Clusters(clusters).Execute()
	resp, err := gApiClient.DiscoveryApi.DiscoveryPost(gNewCtx).Discovery(clusTypes).Execute()
	if err != nil {
		printError(err, resp)
		return
	}
	fmt.Fprintf(os.Stderr, "Resp `DiscoveryPost.getSupportedClusterTypes`: %v\n", resp)
}
