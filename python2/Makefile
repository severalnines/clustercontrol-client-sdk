# =============================================================================
# Makefile - clustercontrol-client-sdk / python2
#
# Drop this file at:  clustercontrol-client-sdk/python2/Makefile
#
# NOTE: despite the directory name "python2", this is a modern Python 3
# (>= 3.9) package (see setup.py: PYTHON_REQUIRES = ">= 3.9"). The name just
# distinguishes it from the older ./python generator output.
#
# Layout:
#   python2/openapi_cc_client        - generated SDK (installed as `cc-api`)
#   python2/clustercontrol_api_example - example CLI (`clustercontrol-api-example`)
#
# venv + pip is used here (setup.py-based packages, no Poetry/pyproject.toml
# in this repo), matching the README's documented workflow.
#
# Tested against: Ubuntu 24.04 LTS, system python3 (3.12).
# =============================================================================

SHELL      := /bin/bash
ROOT_DIR   := $(abspath $(dir $(lastword $(MAKEFILE_LIST))))
SDK_DIR    := $(ROOT_DIR)/openapi_cc_client
EXAMPLE_DIR:= $(ROOT_DIR)/clustercontrol_api_example

PYTHON     ?= python3
VENV_DIR   ?= $(ROOT_DIR)/.venv
VENV_BIN   := $(VENV_DIR)/bin
PIP        := $(VENV_BIN)/pip
PY         := $(VENV_BIN)/python

.DEFAULT_GOAL := build

.PHONY: all build venv install install-example install-dev \
        test lint fmt \
        run-example \
        sdist wheel \
        clean distclean \
        freeze help

## venv: Create the virtualenv (.venv) and upgrade pip
venv:
	@test -d $(VENV_DIR) || $(PYTHON) -m venv $(VENV_DIR)
	$(PIP) install --upgrade pip

## install: Install the generated SDK (cc-api) into the venv, editable
install: venv
	@echo "==> Installing SDK requirements"
	$(PIP) install -r $(ROOT_DIR)/requirements.txt
	@echo "==> Installing cc-api (editable)"
	cd $(ROOT_DIR) && $(PY) -m pip install -e .

## install-example: Install the example CLI (depends on cc-api) into the venv
install-example: install
	@echo "==> Installing clustercontrol-api-example (editable)"
	cd $(EXAMPLE_DIR) && $(PY) -m pip install -e .

## install-dev: Install dev/test tooling (pytest, build, flake8) into the venv
install-dev: venv
	$(PIP) install pytest build flake8

## build: Install SDK + example into the venv (default target)
build: install install-example

## test: Run the generated SDK's pytest suite
test: install-dev install
	cd $(SDK_DIR) && $(VENV_BIN)/pytest -q

## lint: flake8 the SDK and example sources (best-effort, non-fatal on generated code)
lint: install-dev
	@$(VENV_BIN)/flake8 $(SDK_DIR) --max-line-length=120 || true
	@$(VENV_BIN)/flake8 $(EXAMPLE_DIR) --max-line-length=120 || true

## run-example: Run the example CLI
##              Requires CC_URL / API_USER / API_USER_PW to be exported, e.g.:
##                export CC_URL="https://<cc-host>:9501/v2"
##                export API_USER="admin"
##                export API_USER_PW="secret"
run-example: install-example
	@test -n "$$CC_URL" || (echo "CC_URL is not set (see 'make help')" && exit 1)
	$(VENV_BIN)/cc-api-example

## sdist: Build a source distribution for the SDK package
sdist: install-dev
	cd $(ROOT_DIR) && $(PY) -m build --sdist

## wheel: Build a wheel for the SDK package
wheel: install-dev
	cd $(ROOT_DIR) && $(PY) -m build --wheel

## freeze: Print the resolved dependency versions in the venv
freeze: venv
	$(PIP) freeze

## clean: Remove build artifacts (dist/, *.egg-info, __pycache__)
clean:
	find $(ROOT_DIR) -type d -name '__pycache__' -exec rm -rf {} +
	find $(ROOT_DIR) -type d -name '*.egg-info' -exec rm -rf {} +
	rm -rf $(ROOT_DIR)/build $(ROOT_DIR)/dist

## distclean: clean + remove the virtualenv entirely
distclean: clean
	rm -rf $(VENV_DIR)

## help: Show this help
help:
	@echo "clustercontrol-client-sdk/python2 targets:"
	@grep -E '^## ' $(MAKEFILE_LIST) | sed 's/^## /  /'
	@echo ""
	@echo "Env vars for run-example: CC_URL, API_USER, API_USER_PW"
