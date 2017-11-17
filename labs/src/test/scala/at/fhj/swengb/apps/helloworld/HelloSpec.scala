package at.fhj.swengb.apps.helloworld

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
<<<<<<< HEAD
    Hello.greeting shouldEqual "Hello Thomas"
=======
    Hello.greeting shouldEqual "hello Mali"
>>>>>>> TOCourse/master
    Hello.greeting shouldEqual "hallo wie gehts?"
  }
}


