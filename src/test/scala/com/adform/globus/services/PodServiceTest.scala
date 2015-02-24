package com.adform.globus.services

import junit.framework.TestCase
import junit.framework.Assert._

/**
 * @author Alexey Dubrov
 *
 *         Testing of POD service.
 */

class PodServiceTest extends TestCase {

  /**
   * Checks POD creation.
   */
  def testCreatePod(): Unit = {
    val newPod = PodService.createPod("testPod", "Minsk", "test description")

    assertNotNull(newPod)
    assertEquals(newPod.name, "testPod")
    assertEquals(newPod.location, "Minsk")
  }

  /**
   * Checks adding linked PODs to POD.
   */
  def testAddLinks(): Unit = {
    var newPod = PodService.createPod("testPod", "Minsk", "test description")
    val pod1 = PodService.createPod("testPod1", "Minsk", "test description")
    val pod2 = PodService.createPod("testPod2", "Minsk", "test description")
    val pod3 = PodService.createPod("testPod2", "Minsk", "test description")

    assertNotNull(newPod);
    assertEquals(newPod.linked, Nil);

    val newLinked1 = List(pod1, pod2);
    val newLinked2 = List(pod3);

    newPod = PodService.addLinks(newPod, newLinked1);
    assertEquals(newPod.linked, newLinked1);

    newPod = PodService.addLinks(newPod, newLinked2);
    assertEquals(newPod.linked, List(pod1, pod2, pod3));
  }
}
