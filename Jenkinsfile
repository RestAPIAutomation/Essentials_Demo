pipeline {
    agent any
    
    tools{
    	maven 'LocalMaven'
        jdk 'java1.8'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
             	'''
            }
        }
        stage ('Clean Stage') {

            steps {
                    sh 'mvn clean install'
            }
        }

        stage ('Testing Stage') {

            steps {
                    sh 'mvn test'
                }
        }
}
}