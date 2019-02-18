pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh './gradlew app:testDebugUnitTest'
            }
        }
    }
}