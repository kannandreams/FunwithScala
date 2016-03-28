package com.kannandreams.scala.examples.CompanionObject

/**
  * Created by kkalidasan on 2/20/16.
  */
//A companion object can also see private values and variables of the instantiated objects
class Person (val name:String,  private val superheroName:String)  //The superhero name is private!

object Person {
  def showMeInnerSecret(x:Person) = x.superheroName

  def main(args: Array[String]) {
    val clark = new Person("Clark Kent", "Superman")
    val peter = new Person("Peter Parker", "Spiderman")
    val bruce = new Person("Bruce Wayne", "Batman")
    val diana = new Person("Diana Prince", "Wonder Woman")

    println(Person.showMeInnerSecret(clark))

  }
}