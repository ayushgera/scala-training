import munit.FunSuite

class OptionTest extends FunSuite {
  test("firstNonNone should return the first non-None value") {
    assert(OptionalValues.firstNonNone(Some(1), None, Some(2)) == Some(1))
  }

  test("productOfAll should return product if all are Some") {
    assert(OptionalValues.productOfAll(Some(2), Some(3), Some(4)) == Some(24))
  }

  test("firstNonNoneSeq should return the first non-None from a sequence") {
    assert(OptionalValues.firstNonNoneSeq(Seq(None, Some(2), Some(3))) == Some(2))
  }
}
