pipeline {
    agent any

    stages {
        stage('Build WAR File') {
            steps {
                // Compile and package the app into a .war file
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Deploy to Local Tomcat') {
            steps {
                // Copy the WAR file to Tomcat 10 webapps folder as ROOT.war
                bat 'copy target\\*.war C:\\tomcat10\\webapps\\ROOT.war /Y'
            }
        }
    }
}