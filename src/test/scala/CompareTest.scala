import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
class CompareTest  extends AnyFlatSpec with Matchers {

  "It" should "return true as age of first is greater" in {
    val first= new Person("Mike", 25)
    val second = new Person("Mike",22)
    first>second shouldEqual true

  }
  "It" should "return false as age second is greater" in {
    val first= new Person("Mike", 25)
    val second = new Person("Mike",27)
    first>second shouldEqual false

  }

  "It" should "return true as first name length is greater" in {
    val first= new Person("David", 25)
    val second = new Person("Mike",25)
    first>second shouldEqual true

  }

  "It" should "return false as second name length is greater" in {
    val first= new Person("Mike", 25)
    val second = new Person("David",25)
    first>second shouldEqual false

  }
}