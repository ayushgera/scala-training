import munit.FunSuite

class StringAnalysisTest extends FunSuite {
  val text = "scala is great and scala is fun"
  
  test("longestWord should return the longest word") {
    assert(StringWordAnalysis.longestWord(text) == "great")
  }

  test("mostCommonWord should return the most common word") {
    assert(StringWordAnalysis.mostCommonWord(text) == "scala")
  }

  test("mostCommonLetter should return the most common letter") {
    assert(StringWordAnalysis.mostCommonLetter(text) == 'a')
  }

  test("letterToWordsMap should map letters to words") {
    val map = StringWordAnalysis.letterToWordsMap(text)
    assert(map('a') == Set("scala", "great", "and"))
  }
}
