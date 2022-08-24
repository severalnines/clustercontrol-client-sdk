package main

import (
	"crypto/tls"
	"github.com/severalnines/clustercontrol-client-sdk/go/cmd/cctest/opertest"
	"net/http"
)

func main() {
	http.DefaultTransport.(*http.Transport).TLSClientConfig = &tls.Config{InsecureSkipVerify: true}

	opertest.RunTest()
}
