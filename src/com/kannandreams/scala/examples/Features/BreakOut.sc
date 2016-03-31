import scala.collection.breakOut

val list = List("Bangalore","Paris")

//list.map(x => (x.length,x))

val list_val : List[(Int, String)] = list.map(x => (x.length,x))

val map_val : Map[Int, String] = list.map(x => (x.length,x))(breakOut)

val array_val : Array[Int] = list.map(x => (x.length))(breakOut)

var map:Map[Int,String] = Map(1001 -> "Geetha")
map  += (1002 -> "Kannan ")
println(map)


def hello(name:String):String = {
  name+" is my name"
}

hello("kannan")

def greet() = println("Hello")
greet()
