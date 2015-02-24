package com.adform.globus.services

import com.adform.globus.model.Pod

/**
 * @author Alexey Dubrov
 *
 *         Class for POD manipulation
 */

object PodService {

  /**
   * Creates POD.
   * @param name POD name
   * @param location POD location
   * @param parent parent POD
   * @param description POD description
   */
  def createPod(name: String, location: String, description: String, parent: Option[Pod] = None): Pod = {
    new Pod(name, location, description, parent)
  }

  /**
   * Updates list of linked pods.
   * @param pod POD to be changed
   * @param links list of linked PODs
   */
  def addLinks(pod: Pod, links: List[Pod]): Pod = {
    pod.copy(linked = pod.linked ::: links)
  }


}
