// "Change parameter 't' type of function 'foo' to 'T'" "true"
trait T

fun Int.foo(t: Int) {

}

fun foo() {
    1.foo(<caret>object: T{})
}