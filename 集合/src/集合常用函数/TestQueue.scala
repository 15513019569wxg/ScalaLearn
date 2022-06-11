package 集合常用函数

/*
    @author wxg
    @date 2021/7/27-11:07
    */
object TestQueue {
	/**
	 * Scala 也提供了队列（ Queue）的数据结构，队列的特点就是先进先出。进队和出队的方法分别为 enqueue 和 dequeue。
	 * @param args
	 */
	def main(args: Array[String]): Unit = {
		import scala.collection.immutable.Queue
		import scala.collection.mutable
		val que = new mutable.Queue[String]()
		que.enqueue("a", "b", "c")
		println(que.dequeue())
		println(que.dequeue())
		println(que.dequeue())

		//	不可变队列
		val que1: Queue[String] = Queue("a", "b", "c")
		val que2:Queue[String]= que1.enqueue("d")
		val que3: (String, Queue[String]) = que2.dequeue
		println(que3)
	}

}
