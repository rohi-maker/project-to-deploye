pipeline{
    agent any
    stages{
        stage('Testing'){
            steps{
                echo "TESTING THE PORJECT"
            }
        }
        stage('Building'){
            steps{
                echo "BUILDING THE PORJECT"
            }
        }
        stage('Deploying'){
            input{
                message "WANT TO DEPLOYE PROJECT"
                ok "YES"
            }
            steps{
                echo "DEPLOYING THE PORJECT"
            }
        }
    }
}