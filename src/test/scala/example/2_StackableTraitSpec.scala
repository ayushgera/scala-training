import munit.FunSuite

class ReversedStringQueueTest extends FunSuite {
  test("put should reverse the string before adding") {
    val q = new ReversedStringQueue().put("hello")
    assert(q.peek.contains("olleh"))
  }
}
