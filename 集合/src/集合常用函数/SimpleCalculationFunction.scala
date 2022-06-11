package 集合常用函数

/*
    @author wxg
    @date 2021/7/27-8:51
    */
object SimpleCalculationFunction {
	/*
	（1） sorted
	对一个集合进行自然排序，通过传递隐式的 Ordering
	（ 2） sortBy
	对一个属性或多个属性进行排序，通过它的类型。
	（ 3） sortWith
	基于函数的排序，通过一个 comparator 函数，实现自定义排序的逻辑。
	 */
	def main(args: Array[String]): Unit = {
		val list: List[Int] = List(1, 5, -3, 4, 2, -7, 6)
		val list2: List[(String, Int)] = List(("a", 1), ("b", 5), ("c", -3), ("d", 4),("e", 2))
		//（ 1）求和
		println(list.sum)
		//（ 2）求乘积
		println(list.product)

		//（ 3）最大值
		println(list.max)
		println(list2.max)
		println(list2.maxBy((tuple:(String, Int)) => tuple._2))		//	按照值进行查找
		println(list2.maxBy(_._2))
		//（ 4）最小值
		println(list.min)
		println(list2.minBy(_._2))
		println("===" * 20)

		//（ 5）排序
		val sorted: List[Int] = list.sorted
		println(sorted)
		//	从大到小逆序排列
		println(sorted.reverse)
		//	出入隐式参数
		println(list.sorted(Ordering[Int].reverse))
		// （ 5.1）按照元素大小排序
		println(list.sortBy(x => x))
		// （ 5.2）按照元素的绝对值大小排序
		println(list.sortBy(x => x.abs))
		println(list.sortBy(_.abs))
		// （ 5.3）按元素大小升序排序
		println(list.sortWith((x, y) => x < y))
		// （ 5.4）按元素大小降序排序
		println(list.sortWith((_: Int) > (_: Int)))
		//	（5.5）按照指定元素进行排序
		println(list2.sortBy((_: (String, Int))._2))
		println(list2.sortBy(_._2)(Ordering[Int].reverse))
	}

}
