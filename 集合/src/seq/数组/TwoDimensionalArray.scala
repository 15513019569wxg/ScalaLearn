package seq.数组

/*
    @author wxg
    @date 2021/7/26-7:53
    */
object TwoDimensionalArray {
	/*
	1）多维数组定义
		val arr = Array.ofDim[Double](3,4)
		说明：二维数组中有三个一维数组，每个一维数组中有四个元素
	 */
	def main(args: Array[String]): Unit = {
		//（ 1）创建了一个二维数组, 有三个元素，每个元素是，含有 4 个元素一维数组()
		val arr = Array.ofDim[Int](3, 4)
		arr(1)(2) = 88
		println(arr.mkString(","))

		//（ 2.1）遍历二维数组
		for (i <- arr) { //i 就是一维数组
			for (j <- i) print(j + " ")
			println()
		}
		// （ 2.2）遍历二维数组
		arr.foreach((line: Array[Int]) => line.foreach(println))
		arr.foreach((_.foreach(println)))
		//	（ 2.3）遍历二维数组
		for (i <- arr.indices; j <- arr(i).indices) {
			println(arr(i)(j) + "\t")
			if (j == arr(i).length - 1) println
		}
	}

}
