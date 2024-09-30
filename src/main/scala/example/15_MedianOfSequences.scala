// implicit class SeqMedian[T: Numeric](seq: Seq[T]) {
//   def median(implicit ev: Ordering[T]): Option[T] = {
//     val sortedSeq = seq.sorted
//     if (sortedSeq.isEmpty) None
//     else Some(sortedSeq(sortedSeq.length / 2))
//   }
// }


import scala.math.Ordering.Implicits._

object SeqExtensions {
  
  // Implicit class to add median method for Seq[Int]
  implicit class IntSeqOps(val seq: Seq[Int]) extends AnyVal {
    def median: Double = {
      val sorted = seq.sorted
      val len = sorted.length
      if (len % 2 == 1) {
        sorted(len / 2).toDouble
      } else {
        (sorted(len / 2 - 1) + sorted(len / 2)) / 2.0
      }
    }
  }

  // Implicit class to add median method for Seq[Double]
  implicit class DoubleSeqOps(val seq: Seq[Double]) extends AnyVal {
    def median: Double = {
      val sorted = seq.sorted
      val len = sorted.length
      if (len % 2 == 1) {
        sorted(len / 2)
      } else {
        (sorted(len / 2 - 1) + sorted(len / 2)) / 2.0
      }
    }
  }
}