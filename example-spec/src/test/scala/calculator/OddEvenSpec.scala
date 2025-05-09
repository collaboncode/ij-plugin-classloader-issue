package calculator

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class OddEvenSpec extends AnyFreeSpec with Matchers:
  val oddEven = new OddEven()

  "calculator.OddEven" - {
    "when checking a number" - {
      "should return 'Even' for even numbers" in {
        oddEven.check(2) shouldBe "Even"
        oddEven.check(4) shouldBe "Even"
        oddEven.check(0) shouldBe "Even"
      }

      "should return 'Odd' for odd numbers" in {
        oddEven.check(1) shouldBe "Odd"
        oddEven.check(3) shouldBe "Odd"
        oddEven.check(5) shouldBe "Odd"
      }
    }
  }
