pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                checkout([$class: 'GitSCM', 
                          branches: [[name: '*/master']], // Update to master branch
                          userRemoteConfigs: [[url: 'https://github.com/sanduniisa/API_Automation.git']]
                ])
            }
        }

        stage('Start JSON Server') {
            steps {
                script {
                    sh 'json-server --watch /Users/sanduniisa/Desktop/apibatch.json &'
                }
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            script {
                sh 'lsof -t -i:3000 | xargs kill -9'
            }
        }
    }
}
