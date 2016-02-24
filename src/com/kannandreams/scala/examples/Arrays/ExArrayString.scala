package com.kannandreams.scala.examples.Arrays

/**
  * Created by kkalidasan on 2/20/16.
  */
object ExArrayString {

  def main(args:Array[String]) {

    val a = 1
    println (a)

    var b = 2
    println(b)

    val stringArray:Array[String] = new Array(10)

    stringArray(1) = "Kannan"

    println(stringArray(1))

    //The stringArray can be modified, but the reference cannot be modified to point to another Array
    stringArray(1) = "Geetha"
    println(stringArray(1))

    //stringArray = new Array(30)

  }

}
