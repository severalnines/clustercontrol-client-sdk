package opertest

import (
	"context"
	"fmt"
	"net/http"
	"os"

	"github.com/severalnines/clustercontrol-client-sdk/go/pkg/openapi"
)

var (
	gNewCtx    context.Context
	gCfg       *openapi.Configuration
	gApiClient *openapi.APIClient
)

type JobJson struct {
	Job_Id      int32
	Status      string
	Status_Text string
}

type ResponseJobJson struct {
	Request_Status string
	// Debug_Messages []string
	Job JobJson
}

type ClusterInfo struct {
	Cluster_Id int32
	Tags       []string
}

type ClusterInfoRespJson struct {
	Request_Status string
	Cluster        ClusterInfo
}

type ResponseCommonJson struct {
	Request_Status string
}

type ResponseCheckClusterName struct {
	Request_Status ResponseCommonJson
	Is_Acceptable  bool
}

func RunTest() {
	authenticateWithCmon()

	listTemplates()

	getAllClusterInfo()

	discovery()
}

func NewConfiguration(url string) *openapi.Configuration {
	cfg := &openapi.Configuration{
		DefaultHeader: make(map[string]string),
		UserAgent:     "OpenAPI-Generator/1.0.0/go",
		Debug:         true,
		Servers: openapi.ServerConfigurations{
			{
				URL:         url,
				Description: "No description provided",
			},
		},
		OperationServers: map[string]openapi.ServerConfigurations{},
	}
	return cfg
}

func printError(err error, resp *http.Response) {
	fmt.Fprintf(os.Stderr, "Error : %v\n", err)
	fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", resp)
}

func authenticateWithCmon() {
	// URL := "https://cchost:9501/v2"
	URL := os.Getenv("CC_URL")

	gCfg = NewConfiguration(URL)
	gApiClient = openapi.NewAPIClient(gCfg)
	authenticate := *openapi.NewAuthenticate("authenticateWithPassword")
	authenticate.SetUserName(os.Getenv("API_USER"))
	authenticate.SetPassword(os.Getenv("API_USER_PW"))
	ctx := context.Background()
	resp, err := gApiClient.AuthApi.AuthPost(ctx).Authenticate(authenticate).Execute()
	if err != nil {
		printError(err, resp)
		return
	}
	// fmt.Fprintf(os.Stderr, "Resp `AuthApi.AuthPost`: %v\n", resp)

	// fmt.Println("#Cookies: ", len(resp.Cookies()))
	for _, cookie := range resp.Cookies() {
		fmt.Fprintf(os.Stderr, "Found cookie %v\n", cookie)
		gNewCtx = context.WithValue(ctx, "cookie", cookie)
		break
	}
}
