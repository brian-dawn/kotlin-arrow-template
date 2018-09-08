package demo

import arrow.*
import arrow.core.*
import arrow.data.*
import arrow.instances.*
import arrow.typeclasses.*


fun main(args: Array<String>) {

  val result = Option.monoid(Int.monoid()).run { listOf<Option<Int>>(Some(1), Some(1)).combineAll() }

  println(result)
}
