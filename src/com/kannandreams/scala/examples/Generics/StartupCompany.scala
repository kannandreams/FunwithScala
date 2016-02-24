package com.kannandreams.scala.examples.Generics

/**
  * Created by kkalidasan on 2/23/16.
  */
object StartupCompany extends RegisterCompany[DreamCompanyOptions] {

  def main(args: Array[String]) {

    println(" Company Creation Starts in StartupCompany Object  \n =========================")

    val options:DreamCompanyOptions = new DreamCompanyOptions
    sayCongrats(options)

  }

  override def sayCongrats(options:DreamCompanyOptions):Unit = {

    println("StartupCompany Object - sayCongrats Method")
    println(" Congrats " + options.companyOwner + " For starting new Company " + options.companyName)
    val fundMessage = fundRaise(options)
    println("test")
    println(fundMessage)

  }

  override def fundRaise(options:DreamCompanyOptions): String = {
    if(options.companyType=="Software")
      " Your Fund Raise is " + options.startupFunding + " Dollars "
    else
      " Your Fund Raise is " + options.Funding + " Dollars "
  }



}
