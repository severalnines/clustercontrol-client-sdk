# Makefile targets — `clustercontrol-client-sdk/java`

Location: `java/Makefile`

Run `make help` at any time to print this list from the Makefile itself.

This is a thin wrapper around the repo's existing Gradle multi-module build
(`clustercontrol-api`, `clustercontrol-api-abstraction`,
`clustercontrol-api-example`), which is the preferred build path. Maven
fallback targets are included because each module also ships a `pom.xml`.

| Target | Description |
|---|---|
| `build` *(default)* | `./gradlew build` — builds and tests every subproject. |
| `test` | `./gradlew test` — unit tests only, all subprojects. |
| `clean` | `./gradlew clean`. |
| `javadoc` | `./gradlew javadoc` for all subprojects. |
| `install` | `./gradlew installAll` — publishes `clustercontrol-api` and `clustercontrol-api-abstraction` to the local Maven cache (`~/.m2`), matching the root `build.gradle`'s `installAll` task. |
| `run-example` | Builds the example module's jar (`:clustercontrol-api-example:jar`) and runs it with `java -jar`. Requires `CC_URL` (checked) and `API_USER`/`API_USER_PW` per the example's auth logic. |
| `wrapper-check` | Internal guard; fails with a clear message if `./gradlew` isn't present/executable. |
| `build-mvn` | Maven equivalent of `build`, skipping tests: `mvn -DskipTests clean package`. |
| `package-mvn` | Alias for `build-mvn` (packages the example's jar-with-dependencies via Maven's assembly plugin). |
| `install-mvn` | Maven equivalent of `install`: `mvn -DskipTests clean install`. |
| `help` | Prints all `##`-annotated targets plus the expected env vars. |

## Variables you can override

| Variable | Default | Purpose |
|---|---|---|
| `MVN` | `mvn` | Path to the Maven binary, used only by the `*-mvn` targets. |

## Typical workflows

```sh
# Gradle path (preferred)
make build          # build + test everything
make install         # publish clustercontrol-api(+abstraction) to ~/.m2

export CC_URL="https://<cc-host>:9501/v2"
export API_USER="admin"
export API_USER_PW="secret"
make run-example

# Maven path (fallback, e.g. CI without Gradle wrapper network access)
make build-mvn
make install-mvn
```

Note: the built example jar path is
`clustercontrol-api-example/build/libs/clustercontrol-api-example-1.0.0-all.jar`
(Gradle) — this matches the shadow/fat-jar task already defined in
`clustercontrol-api-example/build.gradle`.
