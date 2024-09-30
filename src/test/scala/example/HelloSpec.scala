package example
import munit.FunSuite

class HelloSpec extends FunSuite {
  test("say hello") {
    assertEquals(Hello.greeting, "hello")
  }
}
