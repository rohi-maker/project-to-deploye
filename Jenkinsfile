pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage('Testing'){
            steps{
                echo "PERFORMING TESTS ON PROJECT"
                bat 'mvn test'
            }
        }
        stage('Building'){
            steps{
                echo "PERFORMING TESTS ON PROJECT"
                bat 'mvn install'
            }
        }
        stage('Deploying'){
            steps{
                echo "DEPLOYING THE PORJECT"
            }
        }
    }
}