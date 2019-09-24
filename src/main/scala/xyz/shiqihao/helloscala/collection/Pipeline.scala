package xyz.shiqihao.helloscala.collection

object Pipeline extends App {
  val s: Seq[Int] = Seq(1, 2, 3)
  val q: Seq[String] = Seq("a", "b", "c")

  //val collect = s.collect()

  val count: Int = s.count(_ >= 2) // 2
  println(count)

  val diff: Seq[Int] = s.diff(q)  // List(1, 2, 3)
  println(diff)

  val drop: Seq[Int] = s.drop(1) // List(2, 3)
  println(drop)

  val dropWhile = s.dropWhile(_ < 2) // List(2, 3)
  println(dropWhile)

  val filterNot: Seq[Int] = s.filterNot(_ % 2 == 0) // List(1, 3)
  println(filterNot)

  val groupBy: Map[Boolean, Seq[Int]] = s.groupBy(_ % 2 == 0) // Map(false -> List(1, 3), true -> List(2))
  println(groupBy)

  val zip: Seq[(Int, String)] = s.zip(q) // List((1,a), (2,b), (3,c))
  println(zip)

  val zipWithIndex: Seq[(String, Int)] = q.zipWithIndex // List((a,0), (b,1), (c,2))
  println(zipWithIndex)
}
