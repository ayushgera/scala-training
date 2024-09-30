import munit.FunSuite

class TimeitTest extends FunSuite {
  test("timeit should print execution time and return the result") {
    val result = Timeit.timeit {
      Thread.sleep(100)
      42
    }
    assert(result == 42)
  }
}
