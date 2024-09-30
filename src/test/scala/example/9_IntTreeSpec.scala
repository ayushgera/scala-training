import munit.FunSuite

class IntTreeTest extends FunSuite {
  test("insert should insert a value correctly") {
    val tree = EmptyTree.insert(5).insert(3).insert(7)
    assert(tree.contains(5))
    assert(tree.contains(3))
    assert(tree.contains(7))
    assert(!tree.contains(4))
  }
}
