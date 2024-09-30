trait Queue[T] {
  def put(item: T): Queue[T]
  def peek: Option[T]
  def remove: Queue[T]
}

class StringQueue(queue: List[String] = List()) extends Queue[String] {
  def put(item: String): StringQueue = new StringQueue(queue :+ item)
  def peek: Option[String] = queue.headOption
  def remove: StringQueue = if (queue.isEmpty) this else new StringQueue(queue.tail)
}
