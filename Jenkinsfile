pipeline {

    agent any

    tools{
    	maven 'LocalMaven'
        jdk 'java1.8'
    }

    stages {
         
        stage ('Clean Stage') {
        
            steps {
            		sh 'mvn --version'	
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
