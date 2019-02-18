pipeline {
    agent none
    stages {
        stage('Test') {
            steps {
                sh './gradlew app:testDebugUnitTest'
            }
        }
    }
}