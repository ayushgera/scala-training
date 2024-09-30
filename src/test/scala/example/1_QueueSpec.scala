import munit.FunSuite

class StringQueueTest extends FunSuite {
  test("put, peek and remove should work correctly") {
    val q = new StringQueue().put("apple").put("banana")
    assert(q.peek.contains("apple"))
    val removedQ = q.remove
    assert(removedQ.peek.contains("banana"))
  }
}
