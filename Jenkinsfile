pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh './gradlew app:testDebugUnitTest'
            }
        }
    }
    post {
        always {
            junit '**/TEST-*.xml'
        }
    }
}