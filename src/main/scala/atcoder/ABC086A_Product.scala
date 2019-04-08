object Main extends App {
  val line = io.StdIn.readLine()
  if (line.split(" ").map(_.toInt).reduce(_ * _) % 2 == 0 ) println("Even") else println("Odd")
}
