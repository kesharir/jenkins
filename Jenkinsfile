pipeline {
    agent any
    stages {
        stage("Cleaning Stage") {
            steps {
                 bat(/"C:\Program Files\Mvn\apache-maven-3.9.8\bin\mvn" -Dmaven.test.failure.ignore clean/)
            }
        }
        stage("Testing Stage") {
            steps {
                 bat(/"C:\Program Files\Mvn\apache-maven-3.9.8\bin\mvn" -Dmaven.test.failure.ignore test/)
            }
        }
        stage("Packaging Stage") {
            steps {
                 bat(/"C:\Program Files\Mvn\apache-maven-3.9.8\bin\mvn" -Dmaven.test.failure.ignore package/)
            }
        }
        stage("Email Build Status"){
            steps{
                mail body:"${env.JOB_NAME} - Build#${env.BUILD_NUMBER} - ${currentBuild.currentResult} \n\nCheck conole output at ${env.BUILD_URL} to view the results.",from: '', replyTo: '', subject: 'Jenkins Job Update', to:'ritanshu.keshari@gmail.com'
            }
        }
        stage("Consolidate Results") {
            steps {
                input("Do you want to capture results?")
                junit '**/target/surefure-reports/TEST-*.xml'
                archive 'target/*.jar'
            }
        }
    }
}