pipeline {
    agent any
	
	environment {
        TESTNG_FILENAME = ''
    }
    stages {
        stage('Build') {

            steps {
				git(url:'https://github.com/thaleshXor/seleniumDocker',branch:'dev')
            }
        }//End-stage build
		
		stage('Execution'){
		
			parallel{
				stage('testng1'){
					
					TESTNG_FILENAME = 'testng1'
					sh 'mvn test -DtestngXmlFileName=${TESTNG_FILENAME}'

				}//End-testng1
				
				stage('testng2'){
					
					TESTNG_FILENAME = 'testng2'
					sh 'mvn test -DtestngXmlFileName=${TESTNG_FILENAME'

				}//End-testng1
				
				
			
			}//End-Parallel
		
		}//End-stage('Execution')
		
        
    }
}