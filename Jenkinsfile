pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.0' , '2.0' , '3.0' ], description : ' ')
        booleanParam(name: 'executeTest', defaultValue: true, description: ' ')
    
    }
    
    stages {
        stage("init") 
             {
            steps{
                echo 'building the application'
                 }
             }
         stage("build jar") {
            when {
                expression {
                params.executeTest == True
             steps {
                  echo 'building jar'
                 }
             }  
  
        stage("build image") {
            steps {
                echo 'building image'
                   }
            }
       
        stage("deploy") {
            steps {
                  echo 'deploying'
                       }
            }
        }
    }
