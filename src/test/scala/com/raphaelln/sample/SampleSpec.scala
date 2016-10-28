package com.raphaelln.sample

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class SampleSpec extends FunSuite with BeforeAndAfter {
  
  
  var component:SampleComponent = _
  
  before {
    component = new SampleComponentImpl
  }
  
  test("average is 3") {
    assert(component.average(List(1,2,3,4,5)) == 3.0)
  }

  test("average must not be 3") {
	  assert(component.average(List(1,2,3,4,5,9)) != 3.0)
  }
  
} 