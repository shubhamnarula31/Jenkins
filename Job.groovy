job('Maven_DSL'){
description("First Maven job")
scm{
git("https://github.com/shubhamnarula31/Jenkins.git",master)
}
triggers{
scm(* * * * *)
}
steps{
maven('clean package','pom.xml')
}

publishers{
archiveArtifacts '**/*.war'
}


}