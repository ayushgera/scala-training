import munit.FunSuite

class LazyVectorTest extends FunSuite {
  test("LazyVector should lazily compute x, y, and z") {
    val vec = new LazyVector(Vector(1, 2, 3))
    assert(vec.x == Vector(1, 4, 9))
    assert(vec.y == 14.0)
    assert(vec.z == math.sqrt(14))
  }
}
