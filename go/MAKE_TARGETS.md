# Makefile targets — `clustercontrol-client-sdk/go`

Location: `go/Makefile`

Run `make help` at any time to print this list from the Makefile itself.

This Makefile is aware that `go/pkg/openapi` (the SDK library) and
`go/cmd/clustercontrol-api-example` (the demo CLI) are **separate Go
modules**, each with its own `go.mod`. Targets are split into per-module
(`sdk-*`, `example-*`) and top-level ones that fan out to both.

`go/proxy` and `go/cmd/myapp-1` have no `go.mod` of their own and look
unfinished/orphaned, so they are intentionally not wired into any target.

| Target | Description |
|---|---|
| `build` *(default)* | Runs `sdk-build` then `example-build`. |
| `sdk-build` | Compiles the SDK library: `cd pkg/openapi && go build ./...`. |
| `example-build` | Compiles the example CLI into `cmd/clustercontrol-api-example/bin/clustercontrol-api-example` (`CGO_ENABLED=0`). |
| `test` | Alias for `sdk-test`. |
| `sdk-test` | Runs `go test ./... -v -count=1` inside `pkg/openapi`. |
| `fmt` | `go fmt` on both modules. |
| `vet` | `go vet ./...` on both modules. |
| `lint` | `golangci-lint run ./...` on both modules if installed; otherwise prints an install hint (non-fatal). |
| `tidy` | Runs `sdk-tidy` + `example-tidy`. |
| `sdk-tidy` | `go mod tidy` inside `pkg/openapi`. |
| `example-tidy` | `go mod tidy` inside `cmd/clustercontrol-api-example`. |
| `generate` | Regenerates the Go bindings from `clustercontrol-v2.yaml` by calling the existing repo-root `./generate_go.sh`, then runs `sdk-tidy`. Requires `openapi-generator` on `PATH` (checked by `tools-check`; fails fast with an install link if missing). |
| `tools-check` | Internal guard used by `generate`; verifies `openapi-generator` is installed. |
| `run-example` | Builds (`example-build`) and runs the example CLI. Requires `CC_URL` to be exported (checked); also expects `API_USER`/`API_USER_PW` per the example's own auth logic. |
| `clean` | Removes `cmd/clustercontrol-api-example/bin` and runs `go clean` in both modules. |
| `help` | Prints all `##`-annotated targets plus the expected env vars. |

## Variables you can override

| Variable | Default | Purpose |
|---|---|---|
| `GO` | `go` | Path to the Go toolchain. |
| `GOLANGCI_LINT` | `golangci-lint` | Path to the linter binary. |
| `OPENAPI_GEN` | `openapi-generator` | Path to the OpenAPI Generator CLI, used by `generate`. |

## Typical workflows

```sh
# Build the library + example binary
make build

# Run SDK unit tests
make test

# After editing clustercontrol-v2.yaml at the repo root:
make generate        # regenerate go/pkg/openapi from the spec
make sdk-build        # confirm it still compiles

# Try the example against a live ClusterControl instance
export CC_URL="https://<cc-host>:9501/v2"
export API_USER="admin"
export API_USER_PW="secret"
make run-example
```
