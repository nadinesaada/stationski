stage('SonarQube Analysis') {
steps{
script { 
def scannerHome = tool 'scanner'
withSonarQubeEnv {
sh "${scannerHome}/bin/sonar-scanner"
}
} 
} 
}
