package seq.列表

/*
    @author wxg
    @date 2021/7/26-8:39
    */
object VariableList {
	def main(args: Array[String]): Unit = {
		import scala.collection.mutable.ListBuffer
		//（ 1）创建一个可变集合
		val list1:ListBuffer[Int] = new ListBuffer[Int]()
		val buffer: ListBuffer[Int] = ListBuffer(1,2,3,4)
		//（ 2）向集合中添加数据
		buffer.+=(5)
		buffer.append(6)
		buffer.insert(1,2)
		list1.prepend(20, 30, 40)
		31 +=: 96 +=: buffer += 25 += 26
		//（ 3）打印集合数据
		buffer.foreach(println)
		println("===" * 30)

		//	合并list
		var list: ListBuffer[Int] = buffer ++ list1
		println(list.mkString(","))
		list1 ++= buffer
		println(list1.mkString(","))
		println("===" * 30)

		//（ 4）修改数据
		buffer(1) = 6
		buffer.update(1,7)
		//（ 5）删除数据
		buffer.-(5)
		buffer.-=(5)
		buffer.remove(5)
	}

}
