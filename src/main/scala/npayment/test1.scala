package npayment

object test1 {

  val list1 = List(1, 2)
  val list2 = List("a", "b")

  val pairs = for {
    num <- list1
    char <- list2
  } yield (num, char)

  println(pairs) // Output: List((1, "a"), (1, "b"), (2, "a"), (2, "b"))

}
