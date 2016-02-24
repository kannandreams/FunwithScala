package com.kannandreams.scala.examples.Generics

/**
  * Created by kkalidasan on 2/22/16.
  */
object ClasswithGenericsT {

  def displayArray[T](a : Array[T]) ={

    for (my <- a)
      println(my)

  }

  def main(args: Array[String]) {


    val languages = Array("Scala","Java","Python")

    val ranking = Array(2,3,1)

    displayArray(languages)
    displayArray(ranking)




  }

}
