

pipeline{
    agent any
    parameters{
        choice(name: 'apicomp',choices: ['AlertsAPI','CommonAPI'])
    }

    environment {
        apiComponents = 'api.json'
    }

    stages{
        stage('debug'){
            steps{
                script{
                    builds = load 'builds.groovy'
                    builds.totest()
                    def api = "${params.apicomp}"
                    def configPath = builds.getconfigPath(api)
                }
            }
        }
    }
}