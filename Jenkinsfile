pipeline {
    agent any
    stages {
        stage("init") 
             {
            steps{
                echo 'building the application'
                 }

             }
          }
        stage("build jar") {
            steps {
                  echo 'building jar'
                }
            }
        }
        stage("build image") {
            steps {
                
                    echo 'building image'
                    //gv.buildImage()
                }
            }
        }
        stage("deploy") {
            steps {
                
                    echo 'deploying'
                       }
            }
        }
    } 
