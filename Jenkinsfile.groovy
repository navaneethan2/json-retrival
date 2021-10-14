def totest(){
    echo "Im here baby"
}

pipeline{
    agent any

    stages{
        stage('debug'){
            steps{
                script{
                    totest()
                }
            }
        }
    }
}