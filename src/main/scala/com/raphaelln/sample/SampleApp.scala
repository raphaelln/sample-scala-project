package com.raphaelln.sample

import com.raphaelln.sample.component.SampleComponentImpl

object SampleApp extends App {
  
  val component = new SampleComponentImpl
  println(component.average(List(1,2,3,4,5)))
   
}