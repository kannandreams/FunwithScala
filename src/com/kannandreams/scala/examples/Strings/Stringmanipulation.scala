package com.kannandreams.scala.examples.Strings

/**
  * Created by kkalidasan on 2/20/16.
  */
object StringManipulation {

  def main(args: Array[String]) {

    val name:String = "Kannan"
    val name1:String = "kannan"
    val sentence = " Scala Learning is fun "

    println("name:" + name)

    println("name.getClass.getName : " + name.getClass.getName)

    println("String Length : " + name.length)

    println("String Concatenate :" + name + "How are you")

    println("String Looping Type1 :" + name.foreach(println))

    println("String Looping Type2 :")
    for(c <- name) println(c)

    println("String Filtering :" + name.filter(_ != 'k'))

    println("String Char Drop :" + name.drop(2))

    println("String Char take :" + name.take(2))

    println("String Char capitalize :" + name.capitalize)


    // String Comparison

    println("String Compare :" + name == name1)

    println("String Compare UpperCase:" + name.toUpperCase() == name1.toUpperCase())

    println("String Compare IgnoreCase:" + name.equalsIgnoreCase(name1))

    //String Multiple Line

    println(
            """Four score and
              |seven years ago""".stripMargin)

    //Splitting the Strings

    println("String Split :" + sentence.split(" ").foreach(println))

    // Map Function on strings

    val s = "eggs, milk, butter, Coco Puffs"

    println("String Map Function :" + s.split(",").map(_.trim).map(_.toUpperCase()).foreach(println))

    // Substitute variables in string
    println(s"$name is my name.")
    println("%s says %s".format(name, sentence))

    //Finding Patterns in String
    //Create a Regex object by invoking the .r method on a String

    //import scala.util.matching.Regex

    val numPattern = "[0-9]+".r
    val address = "123 Main Street Suite 101"

    println("findFirstIn : " + numPattern.findFirstIn(address))
    val matches = numPattern.findAllIn(address)

    matches.foreach(println)

    val matches_array =  numPattern.findAllIn(address).toArray
    println(matches_array)

    val newAddress = numPattern.replaceAllIn("123 Main Street", "x")
    println(newAddress)

    //Accessing Char at String
    println(name.charAt(1))
    println(name(2))
    println(name.apply(3))

    //Add Your Own Methods to the String Class
    implicit class StringImprovements(s: String) {
      def increment = s.map(c => (c + 1).toChar)
    }
      println("Kannan".increment)

    //Put the implicit class in an object

   /*   package com.alvinalexander.utils

      object StringUtils {
        implicit class StringImprovements(val s: String) {
          def increment = s.map(c => (c + 1).toChar)
        }
      }*/

    //Put the implicit class in a package object

    /*package com.alvinalexander

    package object utils {

      implicit class StringImprovements(val s: String) {
        def increment = s.map(c => (c + 1).toChar)
      }

    }*/

  }

}
