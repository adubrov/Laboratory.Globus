package com.adform.globus.model

/**
 * Created by agdubrov on 2/23/15.
 */

case class Employee (name: String,
                      role: Role,
                      pod: Pod,
                      location: String,
                      customAttributes: List[CustomAttribute] = List.empty[CustomAttribute])

case class CustomAttribute(name: String, value: String)
