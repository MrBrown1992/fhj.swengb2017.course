package at.fhj.swengb.apps.helloworld

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "Hello Thomas"
    Hello.greeting shouldEqual "hallo wie gehts?"
  }
}


