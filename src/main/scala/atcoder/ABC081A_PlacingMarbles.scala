object Main extends App {
  val line = io.StdIn.readLine()
  println(line.split("").count(_ == "1"))
}
