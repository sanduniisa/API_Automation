pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                // Clone the GitHub repository
                git branch: 'main', url: 'https://github.com/sanduniisa/API_Automation.git'
            }
        }
        stage('Start JSON Server') {
            steps {
                script {
                    // Start the JSON server in the background
                    sh 'json-server --watch "/Users/sanduniisa/Desktop/apibatch.json" &'
                }
            }
        }
        stage('Build with Maven') {
            steps {
                // Use Maven to build the project
                sh 'mvn clean install'
            }
        }
        stage('Run Tests') {
            steps {
                script {
                    // Execute tests (e.g., using TestNG)
                    sh 'mvn test'
                }
            }
        }
    }
    post {
        always {
            // Stop the JSON server after tests
            script {
                sh 'kill $(lsof -t -i:3000)'
            }
        }
    }
}
