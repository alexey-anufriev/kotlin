// WITH_RUNTIME

private fun <T> ff(value: T?): Pair<String, T>? {
    // In PSI2IR, the funcref is approximated to Function1<Nothing, Pair<String, T>>
    return value?.let("O"::to)
}

fun box():String {
  val (o, k) = ff("K")!!
  return "$o$k"
}

