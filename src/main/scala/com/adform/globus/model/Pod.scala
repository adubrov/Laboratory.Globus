package com.adform.globus.model

/**
 * @author Alexey Dubrov
 *
 *
 */

case class Pod (name: String,
                location: String,
                description: String,
                 parent: Option[Pod] = None,
                 children: List[Pod] = List.empty[Pod],
                 linked: List[Pod] = List.empty[Pod])
