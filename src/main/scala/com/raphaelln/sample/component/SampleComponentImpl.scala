package com.raphaelln.sample.component

import org.slf4j.LoggerFactory

class SampleComponentImpl extends SampleComponent {
  
  val logger = LoggerFactory.getLogger(classOf[SampleComponent])

  def average(nums: List[Int]): Double = {
    if (nums == null) return 0
    logger.info(s"""Computing average from $nums list""")
    nums.sum / nums.length
  }
  
}