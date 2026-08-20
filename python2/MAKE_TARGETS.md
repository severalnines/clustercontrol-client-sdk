# Makefile targets — `clustercontrol-client-sdk/python2`

Location: `python2/Makefile`

Run `make help` at any time to print this list from the Makefile itself.

> Despite the directory name, this is a modern Python package
> (`setup.py` declares `PYTHON_REQUIRES = ">= 3.9"`) — "python2" just
> distinguishes it from the older `./python` generator output in this repo.

Build tooling is venv + pip (there's no Poetry/`pyproject.toml` here), which
matches the workflow already documented in the top-level README.

| Target | Description |
|---|---|
| `venv` | Creates `.venv` (if missing) and upgrades `pip` inside it. |
| `install` | Runs `venv`, installs `requirements.txt`, then installs the SDK package (`cc-api`, from `openapi_cc_client`) editable (`pip install -e .`). |
| `install-example` | Runs `install`, then installs `clustercontrol_api_example` editable (depends on `cc-api`). |
| `install-dev` | Installs dev/test tooling into the venv: `pytest`, `build`, `flake8`. |
| `build` *(default)* | Runs `install` + `install-example` — the full local dev setup. |
| `test` | Runs the SDK's pytest suite: `cd openapi_cc_client && pytest -q`. |
| `lint` | Runs `flake8` (max line length 120) over the SDK and example sources. Non-fatal — generated OpenAPI code often trips style rules, so failures don't break the build. |
| `run-example` | Runs the installed `cc-api-example` console script. Requires `CC_URL` (checked) and `API_USER`/`API_USER_PW` per the example's auth logic. |
| `sdist` | Builds a source distribution for the SDK package (`python -m build --sdist`). |
| `wheel` | Builds a wheel for the SDK package (`python -m build --wheel`). |
| `freeze` | Prints `pip freeze` output from the venv — useful for pinning/debugging. |
| `clean` | Removes `__pycache__`, `*.egg-info`, `build/`, `dist/`. |
| `distclean` | `clean` + deletes `.venv` entirely. |
| `help` | Prints all `##`-annotated targets plus the expected env vars. |

## Variables you can override

| Variable | Default | Purpose |
|---|---|---|
| `PYTHON` | `python3` | Interpreter used to create the venv. |
| `VENV_DIR` | `./.venv` | Location of the virtualenv. |

## Typical workflows

```sh
# First-time setup
make build            # creates .venv, installs cc-api + example, editable

# Run tests
make test

export CC_URL="https://<cc-host>:9501/v2"
export API_USER="admin"
export API_USER_PW="secret"
make run-example

# Build distributable artifacts
make sdist wheel

# Start over
make distclean
```
