package demo

/* ktlint-disable no-wildcard-imports */
import arrow.*
import arrow.core.*
import arrow.data.*
import arrow.instances.*
import arrow.typeclasses.*
/* ktlint-enable no-wildcard-imports */

fun main(args: Array<String>) {

    val someOne = Some(1)
    val someTwo = Some(2)
    val nope: Option<Int> = None

    println(someOne.map { it + 1 })
    println(nope.map { it + 1 })

    val combined = ForListK extensions {
        listOf(someOne, someTwo, nope).k().foldMap(Option.monoid(Int.monoid()), ::identity)
    }

    println(combined)

    val foo = ForOption extensions {
        listOf(Option(1), Option(2), Option(3)).k().traverse(this, ::identity)
    }
    println(foo)

    val bar = ForOption extensions {
        listOf(Option(1), None, Option(3)).k().traverse(this, ::identity)
    }
    println(bar)
}
