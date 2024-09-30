import munit.FunSuite

class StringToCharsTest extends FunSuite {
  test("stringsToChars should convert a list of strings to a list of characters") {
    val strings = List("hello", "world")
    assert(StringToChar.stringsToChars(strings) == List('h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'))
  }
}
