import munit.FunSuite

import DoubleComparison._

class DoubleComparisonTest extends FunSuite {
  test("~= should work with default tolerance") {
    assert(1.00001 ~= 1.00002)
    assert(!(1.1 ~= 1.2))
  }
}
