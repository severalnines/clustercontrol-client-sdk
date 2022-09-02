package opertest

import (
	"fmt"
	"github.com/severalnines/clustercontrol-client-sdk/go/pkg/openapi"
	"os"
)

func listTemplates() {
	config := *openapi.NewConfig("listTemplates")
	resp, err := gApiClient.ConfigApi.ConfigPost(gNewCtx).Config(config).Execute()
	if err != nil {
		printError(err, resp)
		return
	}
	fmt.Fprintf(os.Stderr, "Resp `ConfigPost.listTemplates`: %v\n", resp)
}
