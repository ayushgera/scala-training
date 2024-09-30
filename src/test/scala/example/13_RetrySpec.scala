import munit.FunSuite

class RetryTest extends FunSuite {
  test("retry should retry a block n times") {
    var count = 0
    def faultyMethod(): Int = {
      count += 1
      if (count < 3) throw new RuntimeException("Failed")
      else 42
    }
    assert(Retry.retry(5)(faultyMethod()) == 42)
  }
}
