package com.kannandreams.scala.examples.Classes

/**
  * Created by kkalidasan on 3/30/16.
  */
class ChecksumAccumulator {

  //var sum = 10
  private var sum =10

  def add(b:Byte) = { sum += b }
  def checkSum():Int = ~(sum & 0xFF) + 1

}

//
object ChecksumAccumulator1{

  def main(args:Array[String]):Unit = {

    val acc = new ChecksumAccumulator
    //println("Current value " + acc.sum)
    //acc.sum=20
    //print("New Value " + acc.sum)
    println(acc.add(11))
    print("New Value " + acc.sum)

  }

}