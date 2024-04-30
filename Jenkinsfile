node {

    stage('Git checkout') {
        git credentialsId: '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' , url: 'https://github.com/nadinesaada/stationski.git'                
    }

    stage('sonar-scanner') {
      def sonarqubeScannerHome = tool name: 'scanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
      withSonarQubeEnv {
        sh "${sonarqubeScannerHome}/bin/sonar-scanner"
      }
    }

}
