object Timeit {
  def timeit[T](block: => T): T = {
    val start = System.nanoTime()
    val result = block
    val end = System.nanoTime()
    println(s"Execution time: ${(end - start) / 1e6} ms")
    result
  }
}


