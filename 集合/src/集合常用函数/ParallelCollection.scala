package 集合常用函数

/*
    @author wxg
    @date 2021/7/27-11:20
    */
object ParallelCollection {
	def main(args: Array[String]): Unit = {
		import scala.collection.parallel.immutable.ParSeq
		//Scala 为了充分使用多核 CPU，提供了并行集合（有别于前面的串行集合），用于多核环境的并行计算。
		val result1: Seq[String] = (0 to 100).map { case _ => Thread.currentThread.getName }
		val result2: ParSeq[String] = (0 to 100).par.map { case _ => Thread.currentThread.getName }
		println(result1)
		println(result2)
	}
}
