package 方法和函数

/*
    @author wxg
    @date 2021/7/24-21:04
    */
object mapFunc {
	val array: Array[Int] = Array(1, 2, 3, 4)
	def op(n: Int): Int ={
		n + 1
	}
	/**
	 * 执行函数 + 数据
	 * @param args
	 */
	def main(args: Array[String]): Unit ={
		def map(array: Array[Int], op: Int=>Int): Array[Int] ={
			for(elem <- array) yield op(elem)
		}

		val ints: Array[Int] = map(array, op)
		println(ints.mkString(","))

		//	直接传入匿名函数
		println(map(array, (_: Int)*2).mkString(","))
	}

	
}
