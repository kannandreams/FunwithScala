// Scala collection for Map

scala.collection.Map
  scala.collection.mutable.Map
    scala.collection.mutable.HashMap
  scala.collection.immutable.Map
    scala.collection.immutable.HashMap

var currency = Map[(Int,String),String]()
currency += ((1,"YEN") -> "Japan Yen")
currency += ((2,"RS") -> "Indian Rupees")
currency += ((3,"USD") -> "US Dollars")
currency += ((4,"EURO") -> "Europe Euro")

currency(1,"YEN")
currency.keys
currency.values


var words = Map("A" -> "Apple")








