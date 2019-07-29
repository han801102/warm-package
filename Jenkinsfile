pipeline {
    agent any
    triggers {
        pollSCM('H/5 * * * *')
    }
    environment {
        JAVA_HOME = "/Applications/Android Studio.app/Contents/jre/jdk/Contents/Home"
    }
    stages {
        stage('Clean') {
            steps {
                sh './gradlew clean'

            }
        }
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