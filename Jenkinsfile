pipeline{
	agent any
	stages{
		stage('validate project')
		{
				steps{
				sh 'mvn validate'
				}
		}
		stage('clean project')
		{
				steps{
				sh 'mvn clean'
				}
		}
		stage('compile main source code')
		{
				steps{
				sh 'mvn compile'
				}
		}
		stage('compile test code')
		{
				steps{
				sh 'mvn test-compile'
				}
		}
		stage('running test cases')
		{
				steps{
				sh 'mvn test'
				}
		}
		stage('creating jar file')
		{
				steps{
				sh 'mvn package'
				}
		}
	}
}

