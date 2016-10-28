package com.raphaelln.sample

import com.raphaelln.sample.component.SampleComponentImpl

/**
 * Sample scala project
 * @author rnascimento
 *
 */
object SampleApp extends App {
  
  val component = new SampleComponentImpl
  println(component.average(List(1,2,3,4,5)))
   
}