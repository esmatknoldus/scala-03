class Person(val name: String, val age: Int) extends Ordered[Person] {
  def compare(o: Person): Int =
    if (name == o.name)
      if (age < o.age) - 1
      else 1
    else if (name.length >= o.name.length) 1
    else
      -1
}