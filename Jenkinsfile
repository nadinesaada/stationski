stage('SonarQube Analysis') {
            def scannerHome = tool 'scanner'
            withSonarQubeEnv {
                sh "${scannerHome}/bin/sonar-scanner"
            }
}
