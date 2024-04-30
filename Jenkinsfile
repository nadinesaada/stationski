pipeline {
    agent any // Specify where to run the pipeline stage

    stages {
        stage('SonarQube Analysis') {
            steps {
                // Define where to run the steps inside the node block
                node {
                    // Define the SonarQube scanner tool
                    def scannerHome = tool name: 'scanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'

                    // Execute SonarQube scanner within SonarQube environment
                    withSonarQubeEnv('SonarQube') {
                        // Execute the SonarQube scanner command
                        sh "${scannerHome}/bin/sonar-scanner"
                    }
                }
            }
        }
    }
}
