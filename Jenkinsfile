pipeline {
  agent any
  tools {
    maven "maven384"
    jdk "jdk11"
  }
    stages {
      stage('Test') {
        steps {
		  echo 'Testing the application...'
          updateGitlabCommitStatus name: 'test', state: 'pending'
          sh 'mvn -e clean test'
          updateGitlabCommitStatus name: 'test', state: 'success'
        }
      }
      stage('SonarQube Analysis') {
        steps {
          withSonarQubeEnv('sonarqube') {
            updateGitlabCommitStatus name: 'test', state: 'pending'
            sh "mvn clean verify sonar:sonar -Dsonar.projectKey=mspr_java"
            updateGitlabCommitStatus name: 'test', state: 'success'
          }
        }
      }
      stage('Build') {
        steps {
		  echo 'Building the application...'
          updateGitlabCommitStatus name: 'build', state: 'pending'
          sh 'mvn -e clean assembly:assembly -DdescriptorId=jar-with-dependencies'
          updateGitlabCommitStatus name: 'build', state: 'success'
        }
      }
      stage('generation') {
        steps {
		  echo 'Generate the application...'
          updateGitlabCommitStatus name: 'generation', state: 'pending'
          sh 'java -jar target/gosecuri-0-jar-with-dependencies.jar'
          updateGitlabCommitStatus name: 'generation', state: 'success'
        }
      }
      stage('send'){
        steps {
		  echo 'Send the application...'
          updateGitlabCommitStatus name: 'send', state: 'pending'
          sh 'scp -o StrictHostKeyChecking=no -r output/* root@webserver.mspr.java.fr:/root/output'
          updateGitlabCommitStatus name: 'send', state: 'success'
        }
      }
    }
  
}
