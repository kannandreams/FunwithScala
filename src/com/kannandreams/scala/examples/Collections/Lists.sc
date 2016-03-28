val techs:List[String] = List("scala","kafka","spark")

val language = "python" :: ("scala" :: ("java" :: Nil))

techs.head
techs.tail
techs.isEmpty

var skillsets = techs:::language

var skillsets1 = techs.:::(language)

var skillsets2 = List.concat(techs,language)






