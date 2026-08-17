# =============================================================================
# Makefile - clustercontrol-client-sdk / go
#
# Drop this file at:  clustercontrol-client-sdk/go/Makefile
#
# Layout this Makefile understands:
#   go/pkg/openapi                  - the generated SDK library (its own go.mod)
#   go/cmd/clustercontrol-api-example - example CLI consuming the SDK (own go.mod)
#
# Targets are namespaced per-module (sdk-*, example-*) plus convenience
# top-level targets (build, test, etc) that fan out to both.
#
# Tested against: Ubuntu 24.04 LTS, go 1.26.2 (see go/pkg/openapi/go.mod)
# =============================================================================

SHELL := /bin/bash

# --- Layout -------------------------------------------------------------
ROOT_DIR       := $(abspath $(dir $(lastword $(MAKEFILE_LIST))))
REPO_ROOT      := $(abspath $(ROOT_DIR)/..)
SDK_DIR        := $(ROOT_DIR)/pkg/openapi
EXAMPLE_DIR    := $(ROOT_DIR)/cmd/clustercontrol-api-example
BIN_DIR        := $(EXAMPLE_DIR)/bin
EXAMPLE_BINARY := clustercontrol-api-example

# --- Toolchain ------------------------------------------------------------
GO             ?= go
GOOS           ?= $(shell $(GO) env GOOS)
GOARCH         ?= $(shell $(GO) env GOARCH)
GOLANGCI_LINT  ?= golangci-lint
OPENAPI_GEN    ?= openapi-generator

.DEFAULT_GOAL := build

.PHONY: all build sdk-build example-build \
        test sdk-test \
        fmt vet lint tidy sdk-tidy example-tidy \
        generate \
        run-example \
        clean \
        tools-check \
        help

## build: Build the SDK library and the example binary (default)
build: sdk-build example-build

## sdk-build: Compile the openapi SDK package (go/pkg/openapi)
sdk-build:
	@echo "==> Building SDK library ($(SDK_DIR))"
	cd $(SDK_DIR) && $(GO) build ./...

## example-build: Compile the example CLI (go/cmd/clustercontrol-api-example)
example-build:
	@echo "==> Building example binary for $(GOOS)/$(GOARCH)"
	mkdir -p $(BIN_DIR)
	cd $(EXAMPLE_DIR) && CGO_ENABLED=0 $(GO) build -o $(BIN_DIR)/$(EXAMPLE_BINARY) .

## test: Run unit tests for the SDK library
test: sdk-test

sdk-test:
	@echo "==> Testing SDK library"
	cd $(SDK_DIR) && $(GO) test ./... -v -count=1

## fmt: gofmt every module
fmt:
	@echo "==> gofmt"
	$(GO) fmt $(SDK_DIR)/...
	$(GO) fmt $(EXAMPLE_DIR)/...

## vet: go vet every module
vet:
	@echo "==> go vet"
	cd $(SDK_DIR) && $(GO) vet ./...
	cd $(EXAMPLE_DIR) && $(GO) vet ./...

## lint: golangci-lint every module (skips gracefully if not installed)
lint:
	@if command -v $(GOLANGCI_LINT) >/dev/null 2>&1; then \
		echo "==> golangci-lint (sdk)"; cd $(SDK_DIR) && $(GOLANGCI_LINT) run ./...; \
		echo "==> golangci-lint (example)"; cd $(EXAMPLE_DIR) && $(GOLANGCI_LINT) run ./...; \
	else \
		echo "golangci-lint not found; install via: https://golangci-lint.run/welcome/install/"; \
	fi

## tidy: go mod tidy every module
tidy: sdk-tidy example-tidy

sdk-tidy:
	cd $(SDK_DIR) && $(GO) mod tidy

example-tidy:
	cd $(EXAMPLE_DIR) && $(GO) mod tidy

## generate: Regenerate the Go bindings from clustercontrol-v2.yaml
##           (wraps the existing repo-root generate_go.sh)
generate: tools-check
	@echo "==> Regenerating Go bindings from OpenAPI spec"
	cd $(REPO_ROOT) && ./generate_go.sh
	$(MAKE) sdk-tidy

tools-check:
	@command -v $(OPENAPI_GEN) >/dev/null 2>&1 || { \
		echo "openapi-generator not found on PATH."; \
		echo "Install: https://openapi-generator.tech/docs/installation (or 'npm install @openapitools/openapi-generator-cli -g')"; \
		exit 1; \
	}

## run-example: Build and run the example CLI
##              Requires CC_URL / API_USER / API_USER_PW to be exported, e.g.:
##                export CC_URL="https://<cc-host>:9501/v2"
##                export API_USER="admin"
##                export API_USER_PW="secret"
run-example: example-build
	@test -n "$$CC_URL" || (echo "CC_URL is not set (see 'make help')" && exit 1)
	$(BIN_DIR)/$(EXAMPLE_BINARY)

## clean: Remove build artifacts
clean:
	rm -rf $(BIN_DIR)
	cd $(SDK_DIR) && $(GO) clean
	cd $(EXAMPLE_DIR) && $(GO) clean

## help: Show this help
help:
	@echo "clustercontrol-client-sdk/go targets:"
	@grep -E '^## ' $(MAKEFILE_LIST) | sed 's/^## /  /'
	@echo ""
	@echo "Env vars for run-example: CC_URL, API_USER, API_USER_PW"
