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
    }
    post {
        always {
            archiveArtifacts artifacts: 'build/libs/*.war', fingerprint: true
        }
    }
}