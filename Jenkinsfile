pipeline {
    agent any
    triggers {
        pollSCM('H/5 * * * *')
    }
    stages {
        stage('Test') {
            steps {
                sh './gradlew app:testDebugUnitTest'
            }
        }
        stage('Lint') {
            steps {
                sh './gradlew lintDebug'
            }
        }
    }
    post {
        always {
            junit '**/TEST-*.xml'
            androidLint pattern: '**/lint-results-*.xml'
        }
    }
}