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
        stage("Consolidate Results") {
            steps {
                input("Do you want to capture results?")
                junit '**/target/surefure-reports/TEST-*.xml'
                archive 'target/*.jar'
            }
        }
    }
}