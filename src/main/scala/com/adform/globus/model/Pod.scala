package com.adform.globus.model

/**
 * @author Alexey Dubrov
 *
 *
 */

case class Pod (name: String,
                location: String,
                 parent: Pod,
                 var children: List[Pod],
                 var linked: List[Pod],
                 var description: String) {
}
