package com.adform.globus.main

import com.adform.globus.model.Pod

/**
 * @author Alexey Dubrov
 *
 *   Main class.
 *
 */

object Main {
  def main(args: Array[String]) {
    val pod = new Pod("testPod", "Minsk", "description test")
    println(pod)
  }
}
