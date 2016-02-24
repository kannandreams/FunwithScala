package com.kannandreams.scala.examples.Generics

/**
  * Created by kkalidasan on 2/23/16.
  */
object StartupCompany extends RegisterCompany[DreamCompanyOptions] {


  override def sayCongrats(options:DreamCompanyOptions):Unit = {

    println("StartupCompany Object - sayCongrats Method")
    println(" Congrats " + options.companyOwner + " For starting new Company " + options.companyName)
    fundRaise(options)


  }

  override def fundRaise(options:DreamCompanyOptions): String = {
    if(options.companyType=="Startup")
      " Your Fund Raise is " + options.startupFunding + " Dollars "
    else
      " Your Fund Raise is " + options.Funding + " Dollars "
  }



}
