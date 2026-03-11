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
                // We use double backslashes for Windows paths in Groovy
                bat 'copy target\\*.war "C:\\tomcat10\\webapps\\ROOT.war" /Y'
            }
        }
    }
}