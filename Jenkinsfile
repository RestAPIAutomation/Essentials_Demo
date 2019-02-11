pipeline {

    agent any

    tools{
    	maven 'LocalMaven'
        jdk 'java1.8'
    }

    stages {
         
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
