package com.kannandreams.scala.examples.CompanionObject

/**
  * Created by kkalidasan on 2/20/16.
  */

//A companion object stores shared variables and values for every instantiated class to share.

class SecretAgent(val name: String) {
  def shoot(n: Int) {
    SecretAgent.decrementBullets(n)
  }
}

object SecretAgent {
  //This is encapsulated!
  var bullets: Int = 3000

  private def decrementBullets(count: Int) {
    if (bullets - count <= 0) bullets = 0
    else bullets = bullets - count
    println(bullets)
  }

  def main(args: Array[String]) {

    val bond = new SecretAgent("James Bond")
    val felix = new SecretAgent("Felix Leitner")
    val jason = new SecretAgent("Jason Bourne")
    val _99 = new SecretAgent("99")
    val max = new SecretAgent("Max Smart")

    bond.shoot(800)
    felix.shoot(200)
    jason.shoot(150)
    _99.shoot(150)
    max.shoot(200)

  }



}