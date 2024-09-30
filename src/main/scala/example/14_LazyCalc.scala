class LazyVector(input: Vector[Double]) {
  lazy val x: Vector[Double] = input.map(math.pow(_, 2))
  lazy val y: Double = x.sum
  lazy val z: Double = math.sqrt(y)
}
