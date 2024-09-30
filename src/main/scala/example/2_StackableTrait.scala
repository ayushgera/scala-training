trait ReversingQueue extends Queue[String] {
  abstract override def put(item: String): StringQueue = super.put(item.reverse).asInstanceOf[StringQueue]
}

class ReversedStringQueue(queue: List[String] = List()) extends StringQueue(queue) with ReversingQueue
