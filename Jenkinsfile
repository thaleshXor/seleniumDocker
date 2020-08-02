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
						environment {
							TESTNG_FILENAME = 'testng1.xml'
						}
					
					steps{
						//bat 'mvn clean install -U -DtestngXmlFileName=${TESTNG_FILENAME}'
						bat 'mvn test -DtestngXmlFileName=${TESTNG_FILENAME}'
					}//End-Steps

				}//End-testng1
				
				stage('testng2'){
					environment {
							TESTNG_FILENAME = 'testng2.xml'
					}				
					steps{
						//bat 'mvn clean install -U -DtestngXmlFileName=${TESTNG_FILENAME}'
						bat 'mvn test -DtestngXmlFileName=${TESTNG_FILENAME}'
					}//End-Steps

				}//End-testng1
				
				
			
			}//End-Parallel
		
		}//End-stage('Execution')
		
        
    }
}