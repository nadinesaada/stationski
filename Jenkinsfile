node {

    stage('Git checkout') {
        git url: 'https://github.com/nadinesaada/stationski.git'                
    }

    stage('sonar-scanner') {
      def sonarqubeScannerHome = tool name: 'scanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
      withCredentials {
        sh "${sonarqubeScannerHome}/bin/sonar-scanner
      }
    }

}
