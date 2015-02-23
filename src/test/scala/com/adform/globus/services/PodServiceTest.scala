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
    val newPod = PodService.createPod("testPod", "Minsk", null, "test description")

    assertNotNull(newPod)
    assertEquals(newPod.name, "testPod")
    assertEquals(newPod.location, "Minsk")
  }

  /**
   * Checks adding linked PODs to POD.
   */
  def testAddLinks(): Unit = {
    val newPod = PodService.createPod("testPod", "Minsk", null, "test description")
    val pod1 = PodService.createPod("testPod1", "Minsk", null, "test description")
    val pod2 = PodService.createPod("testPod2", "Minsk", null, "test description")
    val pod3 = PodService.createPod("testPod2", "Minsk", null, "test description")

    assertNotNull(newPod);
    assertEquals(newPod.linked, Nil);

    val newLinked1 = List(pod1, pod2);
    val newLinked2 = List(pod3);

    PodService.addLinks(newPod, newLinked1);
    assertEquals(newPod.linked, newLinked1);

    PodService.addLinks(newPod, newLinked2);
    assertEquals(newPod.linked, List(pod1, pod2, pod3));
  }
}
