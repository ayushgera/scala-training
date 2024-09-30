object StringToChar{
    def stringsToChars(strings: List[String]): List[Char] = strings.flatMap(_.toList)
}
