package com.kannandreams.scala.examples.Generics

/**
  * Created by kkalidasan on 2/22/16.
  */
object BetterCasting {

  def main(args: Array[String]) {

    val fruits = List(1,"apple","orange","grapes")
    val fruit:List[String] = List("a","b")

    val first = fruits(0)
    println(first)

  }

}
