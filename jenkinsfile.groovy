pipeline {
    agent any 

    stages {
        stage('git clone') {
            steps {
                git 'https://github.com/kishore5632/Ecommerce.git'
            }
        }
        stage('Test') {
            steps {
                echo "im going to test my repo"
            }
        }
        stage('build') {
            steps {
               echo "test is success and build completed"
            }
        }
     
    }
}