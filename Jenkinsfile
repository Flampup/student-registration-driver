pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                bat './gradlew clean'
            }
        }
        stage('Build') {
            steps {
                bat './gradlew build'
            }
        }
        stage('Run') {
            steps {
                bat './gradlew bootRun'

            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'build/libs/*.war', fingerprint: true
        }
    }
}