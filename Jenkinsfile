pipeline {
    agent any
    options {
        timeout(time:1, unit: 'HOURS')
        skipStagesAfterUnstable()
    }
    stages {
        stage('Checkout'){
            steps {
                git branch: 'master', url: 'https://github.com/Saptadeep7/bootcamp3.git'
            }
        }
        
        stage('Build & Test'){
            steps {
                script {
                    withMaven(maven : 'apache-maven-3.6.3') {
                        bat "mvn clean package"
                    }
                }
            }           
        }
        
        stage('Build Docker Image'){
            steps {
                script {
                    bat 'docker build -t saptadeep7/bootcamp3:1.0.1 .'
                }
            }
        }

        stage('Push to Docker Hub') {
            steps {
                script {
                    withCredentials([file(credentialsId: 'DockerHub', variable: 'dockerHubPwd')]) {
                        bat 'docker login -u saptadeep7 -p ${dockerHubPwd}'
                    }
                    bat 'docker push saptadeep7/bootcamp3:1.0.0'
                }
            }
        }
    }

    post {
        always {
            script {
                cleanWs()
            }
        }
    }
}