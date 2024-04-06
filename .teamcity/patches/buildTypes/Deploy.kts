package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.BuildType
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.triggers.vcs
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with id = 'Deploy'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, BuildType({
    id("Deploy")
    name = "Deploy"

    vcs {
        root(RelativeId("HttpsGithubComThainguyensunyaHelloWorldJavaRefsHeadsMaster1"))
    }

    steps {
        script {
            name = "Deploy jar file to S3"
            id = "Deploy_jar_file_to_S3"
            scriptContent = "aws s3 copy *.jar s3://teamcity-demo-hello-world-app"
        }
    }

    triggers {
        vcs {
        }
    }

    features {
        perfmon {
        }
    }

    dependencies {
        snapshot(RelativeId("Package")) {
        }
    }
}))

