job('First Maven Project'){
    descrition("First Maven job generated by DSL on ${new Date()} project hosted on Github")
    scm{
        git("git@github.com:ashishbattise24/jenkins123.git",master)
    }
    triggers {
        scm('* * * * *')
    }
    steps {
       maven('clean package', 'pom.xml')
    }

}
