object Retry {
  def retry[T](n: Int, sleep: Long = 0)(block: => T): T = {
    var attempts = 0
    var result: Option[T] = None
    while (attempts < n && result.isEmpty) {
      try {
        result = Some(block)
      } catch {
        case _: Throwable =>
          attempts += 1
          Thread.sleep(sleep)
      }
    }
    result.get
  }
}

