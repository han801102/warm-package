pipeline {
    agent any
    triggers {
        cron('H/5 * * * *')
    }
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