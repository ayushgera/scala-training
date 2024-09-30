import munit.FunSuite

class MultiplyListWithMapTest extends FunSuite {
  test("multiplyListWithMap should multiply and filter values based on map") {
    val list = List(1, 2, 3, 4)
    val map = Map(1 -> 3.0, 3 -> 5.0)
    assert(MultipleListMap.multiplyListWithMap(list, map) == List(3.0, 15.0))
  }
}
