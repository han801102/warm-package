pipeline {
    agent any
    triggers {
        pollSCM('H/5 * * * *')
    }
    environment {
        JAVA_HOME = "/Applications/Android Studio.app/Contents/jre/jdk/Contents/Home"
    }
    stages {
        stage('Test') {
            steps {
                sh './gradlew clean'
                sh './gradlew app:testDebugUnitTest'
                junit '**/TEST-*.xml'

            }
        }
        stage('Lint') {
            steps {
                sh './gradlew lintDebug'
                androidLint pattern: '**/lint-results-*.xml'
            }
        }
    }
}