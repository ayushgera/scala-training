import munit.FunSuite

class IntSetTest extends FunSuite {
  val set1 = new NonEmptySet(5, new EmptySet, new EmptySet).incl(3).incl(7)
  val set2 = new NonEmptySet(5, new EmptySet, new EmptySet).incl(4).incl(6)

  test("union should return the union of two sets") {
    assert(set1.union(set2).contains(3))
    assert(set1.union(set2).contains(6))
  }

  test("intersect should return the intersection of two sets") {
    assert(set1.intersect(set2).contains(5))
    assert(!set1.intersect(set2).contains(3))
  }

  test("excl should return a set without the given element") {
    assert(!set1.excl(3).contains(3))
  }
}
