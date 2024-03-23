package opertest

import (
	"fmt"
	"github.com/severalnines/clustercontrol-client-sdk/go/pkg/openapi"
	"os"
)

func Discovery() {
	discov := *openapi.NewDiscovery("checkClusterName")
	discov.SetNewClusterName("foo")
	resp, err := gApiClient.DiscoveryAPI.DiscoveryPost(gNewCtx).Discovery(discov).Execute()
	if err != nil {
		printError(err, resp)
		return
	}
	fmt.Fprintf(os.Stderr, "Resp `AuthApi.Discovery.CheckClusterName`: %v\n", resp)

	discov2 := *openapi.NewDiscovery("getSupportedClusterTypes")
	resp, err = gApiClient.DiscoveryAPI.DiscoveryPost(gNewCtx).Discovery(discov2).Execute()
	if err != nil {
		printError(err, resp)
		return
	}
	fmt.Fprintf(os.Stderr, "Resp `AuthApi.Discovery.GetSupportedClusterTypes`: %v\n", resp)

	discov3 := *openapi.NewDiscovery("checkHosts")
	discov3.SetCheckSshSudo(true)
	hostname := "10.0.0.254"
	var port int32 = 5432
	classname := "CmonHost"
	nodes := []openapi.DiscoveryNodesInner{
		{
			HostName:  &hostname,
			ClassName: &classname,
			Port:      &port,
		},
	}
	discov3.SetNodes(nodes)
	resp, err = gApiClient.DiscoveryAPI.DiscoveryPost(gNewCtx).Discovery(discov3).Execute()
	if err != nil {
		printError(err, resp)
		return
	}
	fmt.Fprintf(os.Stderr, "Resp `AuthApi.Discovery.CheckHosts`: %v\n", resp)
}
