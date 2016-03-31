var fruit = Set("apple", "orange", "peach", "banana")
fruit += "grapes"
fruit

fruit.foreach(s => println(s))
fruit("peach")
fruit.contains("banana")


// Scala Collection Heirarchy

scala.collection.Set
  scala.collection.immutable.Set
    scala.collection.immutable.HashSet
  scala.collection.mutable.Set
    scala.collection.mutable.HashSet


val lang = collection.mutable.Set("python","java")
lang += "Go"