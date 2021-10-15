def totest(){
    echo "Im here baby"
}

pipeline{
    agent any

    environment {
        buildComponents = 'build-components.json'
    }

    stages{
        stage('debug'){
            steps{
                script{
                    totest()
                    builds = load 'builds.groovy'
                    builds.catJson()
                }
            }
        }
    }
}