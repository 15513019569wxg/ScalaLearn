package 变量和数据结构

//noinspection SourceNotClosed
/*
    @author wxg
    @date 2021/7/23-19:49
    */
object Stdin {
	def main(args: Array[String]): Unit = {
		import java.io.{File, PrintWriter}
		import scala.io.{Source, StdIn}
		println("请输入你的姓名")
		val name = StdIn readLine()
		println("请输入你的年龄")
		val age: Int = StdIn.readInt()
		//	打印
		println(s"$name, $age")

		//	读文件
		Source.fromFile("变量和数据结构/src/变量和数据结构/data.txt").foreach(print)
		//	写文件
		val printWriter = new PrintWriter(new File("变量和数据结构/src/变量和数据结构/output.txt"))
		printWriter.write("I am a boy")
		printWriter.close()

	}

}
