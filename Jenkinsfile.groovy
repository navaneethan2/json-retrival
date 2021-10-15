

pipeline{
    agent any

    environment {
        buildComponents = 'build-components.json'
    }

    stages{
        stage('debug'){
            steps{
                script{
                    builds = load 'builds.groovy'
                    builds.totest()

                    builds.catJson()
                }
            }
        }
    }
}