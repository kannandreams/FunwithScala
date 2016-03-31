//Scala shell always prints integer values in base 10,
// no mat- ter what literal form you may have used to initialize it.
val hex = 0x5
val bigger = 1.2345e1
val c = '\101'
val d = '\u0041'
val hello = "hello"
val escapes = "\\\"\'"
println("""Welcome to Ultamix 3000.
           Type "HELP" for help.""")
println("""|Welcome to Ultamix 3000.
                |Type "HELP" for help.""".stripMargin)

val s = 'aSymbol

def updateRecordByName(r: Symbol, value: Any): Unit = {
  println("Update the record with " + r + " for the column $2")
}

//updateRecordByName(itinerary,100) - compile error
updateRecordByName('itinerary,100)

//Operators and methods

val sumMore = (1).+(2)

val p = "Hello, world!"

p.indexOf('o')
p.indexOf('o',5)

