trait IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
  def intersect(other: IntSet): IntSet
  def excl(x: Int): IntSet
  def isEmpty: Boolean
}

class EmptySet extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)
  def union(other: IntSet): IntSet = other
  def intersect(other: IntSet): IntSet = new EmptySet
  def excl(x: Int): IntSet = this
  def isEmpty: Boolean = true
}

class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left.contains(x)
    else if (x > elem) right.contains(x)
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmptySet(elem, left.incl(x), right)
    else if (x > elem) new NonEmptySet(elem, left, right.incl(x))
    else this

  def union(other: IntSet): IntSet =
    left.union(right.union(other.incl(elem)))

  def intersect(other: IntSet): IntSet = {
    val l = left.intersect(other)
    val r = right.intersect(other)
    if (other.contains(elem)) new NonEmptySet(elem, l, r)
    else l.union(r)
  }

  def excl(x: Int): IntSet =
    if (x < elem) new NonEmptySet(elem, left.excl(x), right)
    else if (x > elem) new NonEmptySet(elem, left, right.excl(x))
    else left.union(right)

  def isEmpty: Boolean = false
}
