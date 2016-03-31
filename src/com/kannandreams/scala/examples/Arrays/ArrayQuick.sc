//import com.kannandreams.scala.examples.Generics.StartupOptions
//import com.kannandreams.scala.examples.Arrays._

//val names = Array(Array(1,2,3),Array(2,3),Array(3,1))

//names(1)

//println("Hi")

var greetStrings: Array[String] = new Array[String](3)
println(greetStrings)
greetStrings = new Array[String](5)
println(greetStrings)
greetStrings(0) = "Hello"
for ( i <- 0 to greetStrings.length-1 )
  println(greetStrings(i))

println("Val array")

val greetStrings1: Array[String] = new Array[String](3)
println(greetStrings1)
greetStrings1(0) = "Hello"
//greetStrings1(0) = "Hello1"

for ( i <- 0 to greetStrings1.length-1 )
  println(greetStrings1(i))

greetStrings1(0) = "Hello1"
for ( i <- 0 to greetStrings1.length-1 )
  println(greetStrings1(i))













