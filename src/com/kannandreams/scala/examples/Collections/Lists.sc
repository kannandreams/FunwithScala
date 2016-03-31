val techs:List[String] = List("scala","kafka","spark")

val language = "python" :: ("scala" :: ("java" :: Nil))

techs.head
techs.tail
techs.isEmpty

var skillsets = techs:::language

var skillsets1 = techs.:::(language)

var skillsets2 = List.concat(techs,language)

language
language(2)
language.count(s => s.length ==4)
language.count(s => true)
language.drop(1)
language.dropRight(1)
language.exists(s => s == "Go")
language.filter(s=> s.length>4)
language.forall(s => s.endsWith("a"))
language.foreach(s => println(s))

language.foreach(print)
language.head
language.last
language.tail
language.init
language.isEmpty
language.length
language.map(a => a.toUpperCase())
language.mkString(", ")
language.reverse

















