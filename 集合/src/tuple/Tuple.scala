package tuple

/*
    @author wxg
    @date 2021/7/26-10:50
    */
object Tuple {
	/*
	说明：元组也是可以理解为一个容器，可以存放各种相同或不同类型的数据。说的简单点，就是将多个无关的数据封装为一个整体，称为元组。
	注意：元组中最大只能有 22 个元素。
	 */
	def main(args: Array[String]): Unit = {
		//（ 1）声明元组的方式： (元素 1，元素 2，元素 3)
		val tuple: (Int, String, Boolean) = (40, "bobo", true)
		println(tuple)
		//（ 2）访问元组
		//（ 2.1）通过元素的顺序进行访问，调用方式： _顺序号
		println(tuple._1)
		println(tuple._2)
		println(tuple._3)
		println("===" * 10)
		//（ 2.2）通过索引访问数据
		println(tuple.productElement(0))
		//（ 2.3）通过迭代器访问数据
		for (elem <- tuple.productIterator) {
			println(elem)
		}
		println("===" * 10)
		
		//（ 3） Map 中的键值对其实就是元组,只不过元组的元素个数为 2，称之为对偶
		val map = Map("a" -> 1, "b" -> 2, "c" -> 3)
		val map1 = Map(("a", 1), ("b", 2), ("c", 3))
		map.foreach((tuple: (String, Int)) => println(tuple._1 + "=" + tuple._2))
		println("===" * 10)
		//（4）嵌套元组
		val mulTuple: (Int, Double, Int, (Int, Int)) = (12, 0.3, 35, (29, 20))
		println(mulTuple._4._2)
	}

}
