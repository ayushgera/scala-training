object MultipleListMap {
  def multiplyListWithMap(list: List[Int], map: Map[Int, Double]): List[Double] =
    list.flatMap(i => map.get(i).map(_ * i))
}

