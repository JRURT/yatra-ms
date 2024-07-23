pipeline {
    agent { label  'teamsA-jenkinsslave'}

    options{
        buildDiscarder(logRotator(numToKeepStr:'5', artifactNumToKeepStr:'5'))
    }
    tools {
            maven 'maven_3.9.4'
            //sonarqubeScanner 'sonarqubeScanner'
        }

    stages {
        stage('Code Compilation') {
            steps {
               echo 'code compilation is in progress'
               sh 'mvn clean test'
               echo 'JUnit Test Case Check Completed!'
            }
        }
        stage('Code Package') {
                    steps {
                       echo 'Creating WAR Artifact'
                       sh 'mvn clean Package'
                       echo 'Artifact Creation Completed !'
                    }
                }
      }

}