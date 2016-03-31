var filename = "readme.txt"
if(filename.isEmpty)
  "default.txt"
else filename

var i = 0
while(i <= 10) {
  println(i)
  i = i + 1
}

do {
  println(i)
  i = i + 1
}
while (i <= 10)

val filesHere = (new java.io.File("/Users/kkalidasan/Documents")).listFiles
for (file <- filesHere)
  println(file)

for (file <- filesHere if file.getName.endsWith(".mov"))
  println(file)

for (
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".mov")
) println(file)

for (i <- 1 until 4)
  println("Iteration "+ i)

val input="salt"
val firstArg = input
firstArg match {
  case "salt" => println("pepper")
  case "chips" => println("salsa")
  case "eggs" => println("bacon")
  case _ => println("huh?")
}

val friend =
  firstArg match {
    case "salt" => "pepper"
    case "chips" => "salsa"
    case "eggs" => "bacon"
    case _ => "huh?"
  }