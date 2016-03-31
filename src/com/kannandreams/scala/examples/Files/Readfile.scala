package com.kannandreams.scala.examples.Files
import scala.io.Source

/**
  * Created by kkalidasan on 3/30/16.
  */
object Readfile {

  def widthOfLength(s: String) = s.length.toString.length

  def main(args: Array[String]): Unit = {


    val PATH = "/Users/kkalidasan/github_personal/ScalaLearn/FunwithScala/src/com/kannandreams/scala/examples/Files"
    //var maxWidth = 0

    val lines = Source.fromFile(PATH + "/" + "Readfile.scala").getLines().toList
    //toList will help to iterate multiple times by keeping in memory


    /*for(line <- Source.fromFile(PATH+"/"+"Readfile.scala").getLines())
    {
      println(line.length + " | "  + line )
    }

    }*/

    val longestLine = lines.reduceLeft((a,b) => if(a.length > b.length) a else b)
    println(longestLine)

    val maxWidth = widthOfLength(longestLine)

    for (line <- lines) {

      val numSpaces = maxWidth - widthOfLength(line)
      //println(numSpaces)
      val padding = " " * numSpaces
      println(padding + line.length + " | " + line)
    }

  }


}