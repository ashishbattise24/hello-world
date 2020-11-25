job('Second maven project'){
   description('This is second maven project')
   scm{
     git("https://github.com/ashishbattise24/hello-world.git", 'master')
   
   triggers{
             scm('* * * * * *')
   }
   steps{
     maven('clean package', 'pom.xml')
   }
   publishers{
     archiveArtifacts '**/*.jar'
   }
}
