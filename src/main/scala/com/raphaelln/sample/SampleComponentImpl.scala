package com.raphaelln.sample

import org.slf4j.LoggerFactory

class SampleComponentImpl extends SampleComponent {
  
  val logger = LoggerFactory.getLogger(this.getClass)

  def average(nums: List[Int]): Double = {
    if (nums == null) return 0
    nums.sum / nums.length
  }
  
}