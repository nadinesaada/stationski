pipeline {
    agent any
    stages {
        stage('SonarQube Analysis') {
            steps {
                // Wrap the tool step with the node step
                node {
                    // Define the SonarQube scanner tool
                    def scannerHome = tool 'scanner'

                    // Execute SonarQube scanner within SonarQube environment
                    withSonarQubeEnv {
                        // Execute the SonarQube scanner command
                        sh "${scannerHome}/bin/sonar-scanner"
                    }
                }
            }
        }
        // Add other stages as needed
    }
}
