package seq.数组

/*
    @author wxg
    @date 2021/7/25-19:52
    */
object ImmutableArray {
	def main(args: Array[String]): Unit = {
		/*1） 第一种方式定义数组
			定义： val arr1 = new Array[Int](10)
			（ 1） new 是关键字
			（ 2） [Int]是指定可以存放的数据类型，如果希望存放任意数据类型，则指定 Any
			（ 3） (10)，表示数组的大小，确定后就不可以变化

		2） 第二种方式定义数组
			val arr1 = Array(1, 2)
			（ 1）在定义数组时，直接赋初始值
			（ 2）使用 apply 方法创建数组对象
		*/

		//（ 1）数组定义
		val arr01 = new Array[Int](4)
		println(arr01.length) // 4
		//（ 2）数组赋值
		//（ 2.1）修改某个元素的值
		arr01(3) = 10
		//（ 2.2）采用方法的形式给数组赋值
		arr01.update(0, 1)
		//（ 3）遍历数组
		//（ 3.1）查看数组
		println(arr01.mkString(","))
		//（ 3.2）普通遍历
		for (i <- arr01) println(i)

		//（ 3.3）简化遍历
		def printx(elem: Int): Unit = println(elem)
		//	(3.4) 普通for循环
		for (i <- 0 until arr01.length) println(i)
		//	（3.5）indices
		for (i <- arr01.indices) println(i)
		arr01.foreach(printx)
		//			 arr01.foreach((x)=>{println(x)})
		// arr01.foreach(println(_))
		//	（3.6）利用lambda表达式
		arr01.foreach(println)
		//	（3.7）利用迭代器
		val iter: Iterator[Int] = arr01.iterator
		while (iter.hasNext) println(iter.next)

		//（ 4）增加元素（由于创建的是不可变数组，增加元素，其实是产生新的数组）
		println(arr01.mkString(","))
		val ints: Array[Int] = (3 +: arr01 :+ 4).+:(5)
		println(ints.mkString(","))

		// 第二种定义
		var arr02 = Array(1, 3, "bobo")
		println(arr02.length)
		for (i <- arr02) {
			println(i)
		}

	}


}
