plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "gigglecoin"
include("websocket")
include("infrastructure")
include("infrastructure:kafka")
//findProject(":infrastructure:kafka")?.name = "kafka"
include("consumer")
