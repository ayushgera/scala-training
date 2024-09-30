abstract class IntTree {
  def contains(v: Int): Boolean
  def insert(v: Int): IntTree
}

case object EmptyTree extends IntTree {
  def contains(v: Int): Boolean = false
  def insert(v: Int): IntTree = Node(v, EmptyTree, EmptyTree)
}

case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree {
  def contains(v: Int): Boolean =
    if (v < elem) left.contains(v)
    else if (v > elem) right.contains(v)
    else true

  def insert(v: Int): IntTree =
    if (v < elem) Node(elem, left.insert(v), right)
    else if (v > elem) Node(elem, left, right.insert(v))
    else this
}
