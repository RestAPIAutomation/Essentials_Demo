pipeline {
    agent any
    tools{
    	maven 'LocalMaven'
        jdk 'java1.8'
    }
    stages {
        stage ('Initialize') {
            steps {
                bat '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
             	'''
            }
        }
        stage ('Clean Stage') {

            steps {
                    bat 'mvn clean install'
            }
        }

        stage ('Testing Stage') {

            steps {
                    bat 'mvn test'
                }
        }
}
}
