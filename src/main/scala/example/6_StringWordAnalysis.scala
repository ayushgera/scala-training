object StringWordAnalysis {
  def longestWord(s: String): String = s.split(" ").maxBy(_.length)

  def mostCommonWord(s: String): String = s.split(" ").groupBy(identity).maxBy(_._2.length)._1

  def mostCommonLetter(s: String): Char = s.replaceAll(" ", "").groupBy(identity).maxBy(_._2.length)._1

  def letterToWordsMap(s: String): Map[Char, Set[String]] = {
    val words = s.split(" ").toSet
    words.flatMap(_.toSet).map(c => c -> words.filter(_.contains(c))).toMap
  }
}

