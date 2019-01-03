pipeline {
    agent any
    
    environment {
        PROJECT_NAME = 'corpus_service'
        APPLICATION_ACTIVE = 'dev'
        HOME_DIR = 'home/mingchun'
    } 

    stages{
        stage('Checkout') {
            steps {    
                cleanWs()
                echo " This is pipeline_2 "
                git credentialsId: '28661b99-b4ec-4540-ad3d-9bef5c2e7562', url: 'git@github.com:mingeyes/pipeline_2.git'
            }
        }
        stage('Build') {
            steps {
                echo " build... "                
                sh 'ls'     
            }
        }
        stage('Deploy') {
            steps {
                echo " Deploy... "    
            }
        }
    }
}
