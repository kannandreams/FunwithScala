package com.kannandreams.scala.examples.CompanionObject

/**
  * Created by kkalidasan on 2/20/16.
  */
class Point (xc: Int, yc: Int) {

  var x: Int = xc
  var y: Int = yc

  //the implicit return type Unit corresponds to void in Java-like languages
  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
  //toString overrides the pre-defined toString method, it has to be tagged with the override flag.
  override def toString(): String = "(" + x + ", " + y + ")";

}

object Point {
  def main(args: Array[String]) {
    val pt = new Point(1, 2)
    println(pt)
    pt.move(10, 10)
    println(pt)
  }
}
