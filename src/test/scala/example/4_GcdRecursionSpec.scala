import munit.FunSuite

class GCDTest extends FunSuite {
  test("gcd should return the greatest common divisor") {
    assert(Gcd.gcd(54, 24) == 6)
    assert(Gcd.gcd(10, 0) == 10)
  }
}
