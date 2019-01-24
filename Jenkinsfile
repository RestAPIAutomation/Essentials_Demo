pipeline {
    agent any

    stages {
        stage ('Clean Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn clean'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn test'
                }
            }
        }
    }
}