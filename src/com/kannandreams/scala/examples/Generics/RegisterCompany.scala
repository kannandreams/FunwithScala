package com.kannandreams.scala.examples.Generics

/**
  * Created by kkalidasan on 2/23/16.
  */
trait RegisterCompany[T <: StartupOptions ] {

  def sayCongrats(options: T): Unit = {

    println("RegisterCompany Trait - sayCongrats Method")
    println(" Congrats " + options.companyName)
  }


  def fundRaise(options: T): String



}
