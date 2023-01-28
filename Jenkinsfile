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
                deploy adapters: [tomcat9(credentialsId: 'f2603a18-09bf-4455-9bbe-49e670ffc553', path: '', url: 'http://localhost:8006')], contextPath: '/myapp', war: '**/*.war'
            }
        }
    }
}