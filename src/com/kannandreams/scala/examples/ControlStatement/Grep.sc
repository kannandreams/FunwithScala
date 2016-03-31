val filesHere = (new java.io.File(".")).listFiles


def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList


def grep(pattern: String) =
  for (
    file <- filesHere
    if file.getName.endsWith(".properties");
    line <- fileLines(file)
    if line.trim.matches(pattern)
  ) println(file +": "+ line.trim)

grep(".*idea.*")

//Producing a New Collection

def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

