pipline {
  agent any

  stages {
    stage('build') {
      steps {
        echo 'build app'
      }
    }
  }
  post
  {
    always
    {
      emailext body: 'summary', subject: 'pipeline status', to:'shreejr419@gmail.com'
    }
  }
}      
