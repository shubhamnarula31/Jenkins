job('Maven_DSL'){
description("First Maven job")
properties {
        githubProjectUrl('https://github.com/shubhamnarula31/Jenkins.git')
    }
triggers{
scm('* * * * *')
}
steps{
maven('clean package','pom.xml')
}

publishers{
archiveArtifacts '**/*.war'
}


}