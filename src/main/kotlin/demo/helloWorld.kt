package demo

/* ktlint-disable no-wildcard-imports */
import arrow.*
import arrow.core.*
import arrow.data.*
import arrow.instances.*
import arrow.typeclasses.*
/* ktlint-enable no-wildcard-imports */

fun main(args: Array<String>) {

    val result = Option.monoid(Int.monoid()).run { listOf<Option<Int>>(Some(1), Some(1)).combineAll() }

    println(result)
}
