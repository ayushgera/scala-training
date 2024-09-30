object OptionalValues {
  def firstNonNone(x: Option[Int], y: Option[Int], z: Option[Int]): Option[Int] = x orElse y orElse z

  def productOfAll(x: Option[Int], y: Option[Int], z: Option[Int]): Option[Int] = for {
    a <- x
    b <- y
    c <- z
  } yield a * b * c

  def firstNonNoneSeq(seq: Seq[Option[Int]]): Option[Int] = seq.collectFirst { case Some(v) => v }
}
