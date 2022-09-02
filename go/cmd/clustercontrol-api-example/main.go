package main

import (
	"crypto/tls"
	"github.com/severalnines/clustercontrol-client-sdk/go/cmd/clustercontrol-api-example/opertest"
	"net/http"
)

func main() {
	http.DefaultTransport.(*http.Transport).TLSClientConfig = &tls.Config{InsecureSkipVerify: true}

	opertest.AuthenticateWithCmon()

	opertest.Discovery()
}
