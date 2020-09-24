import java.net.URLEncoder
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
                    def mavenHome = tool name: 'maven-3', type:'maven'
                    def mavenCMD = "${mavenHome}/bin/mvn"
                    sh "${mavenCMD} clean package" 
                }
            }           
        }
        
        stage('Build Docker Image'){
            steps {
                script {
                    sh 'docker build -t saptadeep7/bootcamp3:1.0.2 .'
                }
            }
        }

        stage('Push to Docker Hub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'DockerHub', variable: 'dockerHubPwd')]) {
                        sh 'docker login -u saptadeep7 -p ${dockerHubPwd}'
                    }
                    sh 'docker push saptadeep7/bootcamp3:1.0.2'
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