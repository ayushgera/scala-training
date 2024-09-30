object DoubleComparison {
  implicit val defaultTolerance: Double = 1e-5

  implicit class RichDouble(val d: Double) extends AnyVal {
    def ~=(other: Double)(implicit tolerance: Double): Boolean =
      (d - other).abs <= tolerance
  }
}
