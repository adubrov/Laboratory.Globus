package com.adform.globus.model

/**
 * @author Alexey Dubrov
 *
 *         All roles
 */

sealed trait Role

case object PodLead extends Role
case object PodKeeper extends Role
case object Admin extends Role

case class CustomRole(name: String) extends Role
