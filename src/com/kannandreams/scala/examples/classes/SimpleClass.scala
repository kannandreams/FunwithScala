package com.kannandreams.scala.examples.classes

/**
  * Created by kkalidasan on 2/21/16.
  */
class SimpleClass {

  println("Constructor starts")
  def greet(): Unit = {
    println("Hi , Good Morning ")
  }

}

object SimpleClass{

  def main(args: Array[String]) {
    val s = new SimpleClass
    s.greet()

  }

}
