import munit.FunSuite

class SquareListTest extends FunSuite {
  test("squareList should square all elements in the list") {
    val list = List(1, 2, 3)
    assert(ListSquare.squareList(list) == List(1, 4, 9))
    assert(ListSquare.squareListMap(list) == List(1, 4, 9))
  }
}
