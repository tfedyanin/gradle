// tag::use-plugin[]
pluginManagement {
    repositories {
        maven {
// end::use-plugin[]
            val producerName: String? by settings
            val repoLocation = "../$producerName/build/repo"
// tag::use-plugin[]
            url = uri(repoLocation)
        }
    }
// end::use-plugin[]
// tag::use-legacy-plugin[]
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "org.samples") {
                useModule("org.gradle:custom-plugin:${requested.version}")
            }
        }
    }
// end::use-legacy-plugin[]
// tag::use-plugin[]
}
// end::use-plugin[]
rootProject.name = "consumer"
