pipeline {
    agent any

    // Tell Jenkins to use the Maven tool we just configured
    tools {
        maven 'M3' // This MUST match the exact name you typed in Step 1
    }

    stages {
        stage('Build WAR File') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Deploy to Local Tomcat') {
            steps {
                bat 'copy target\\*.war "C:\\Users\\APU\\Downloads\\apache-tomcat-10.1.52-windows-x64\\apache-tomcat-10.1.52\\webapps\\ROOT.war" /Y'
            }
        }
    }
}