pipeline {
    agent any

    stages {
        stage('checkout') {
            steps {
            checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '1023d971-efb5-4f27-a44e-ed8dd4c67f1a', url: 'https://github.com/Suresh1925/Trail-repo.git']])
            }
        }
         stage('Build') {
            steps {
            bat 'javac Task.java'
            bat 'java Task'
            }
        }
    }
}
