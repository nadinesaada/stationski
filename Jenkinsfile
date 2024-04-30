stage('SonarQube Analysis') {
    steps {
        // Define the SonarQube scanner tool
        def scannerHome = tool 'scanner'

        // Execute SonarQube scanner within SonarQube environment
        withSonarQubeEnv {
            // Execute the SonarQube scanner command
            sh "${scannerHome}/bin/sonar-scanner"
        }
    }
}
