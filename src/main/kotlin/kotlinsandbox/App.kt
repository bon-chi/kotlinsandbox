/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package kotlinsandbox
import arrow.core.Option

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
    println(App().greeting)
    println(MyCalendar.hello())
}
