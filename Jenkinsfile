stage('SonarQube Analysis') {
        script {
            def scannerHome = tool 'scanner'
            withSonarQubeEnv {
                sh "${scannerHome}/bin/sonar-scanner"
            }
        }
}
