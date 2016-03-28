package com.kannandreams.scala.examples.Generics


/**
  * Created by kkalidasan on 2/22/16.
  */
object ClasswithoutGenerics {

  def displayArray(languages:Array[String]){

    for (my <- languages)
      println(my)

  }

  def displayArray(ranking:Array[Int]){

    for (my <- ranking)
      println(my)

  }

  def main(args: Array[String]) {

    val languages = Array("Scala","Java","Python")

    val ranking = Array(2,3,1)

    displayArray(languages)
    displayArray(ranking)



  }

}
