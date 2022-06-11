package 集合常用函数

/*
    @author wxg
    @date 2021/7/27-9:08
    */
object AdvancedCalculationFunctions {
	/*
	（ 1）过滤
		遍历一个集合并从中获取满足指定条件的元素组成一个新的集合
	（ 2） 转化/映射（ map）
		将集合中的每一个元素映射到某一个函数
	（ 3）扁平化
	（ 4）扁平化+映射 注： flatMap 相当于先进行 map 操作，在进行 flatten 操作
		集合中的每个元素的子元素映射到某个函数并返回新集合
	（ 5） 分组(group)
		按照指定的规则对集合的元素进行分组
	（ 6）简化（ 归约）
	（ 7）折叠
	 */
	def main(args: Array[String]): Unit = {
		import scala.collection.mutable
		println("================================Map类=======================================")
		val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
		val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
		val wordList: List[String] = List("hello world", "hello atguigu", "hello scala")
		//（ 1）过滤（按照偶数）
		println(list.filter(x => x % 2 == 0))

		//（ 2）转化/映射
		println(list.map(x => x + 1))
		println(list.map(x => x * x))
		println("===" * 20)
		//（ 3）扁平化
		println(nestedList(0) ::: nestedList(1) ::: nestedList(2))
		println(nestedList.flatten)
		println("----" * 20)

		//（ 4）扁平化+映射 注： flatMap 相当于先进行 map 操作，在进行 flatten操作
		val stringses: List[Array[String]] = wordList.map(_.split(" "))
		println(stringses)
		println(stringses.flatten)
		println(wordList.flatMap(x => x.split(" ")))

		//（ 5）分组
		println(list.groupBy(_ % 2))
		println(list.groupBy(data => if(data % 2 == 0) "偶数" else "奇数"))
		val wordList2: List[String] = List("hello", "world", "hello", "atguigu", "hello", "scala")
		println(wordList2.groupBy(_.charAt(0)))


		println("===================================Reduce====================================")
		//	Reduce 简化（归约） ：通过指定的逻辑将集合中的数据进行聚合，从而减少数据，最终获取结果。
		val list2 = List(1,2,3,4)
		// 将数据两两结合，实现运算规则
		val i: Int = list2.reduce( (x,y) => x-y )
		println(list2.reduce( _-_ ))
		println("i = " + i)
		// 从源码的角度， reduce 底层调用的其实就是 reduceLeft
		//val i1 = list.reduceLeft((x,y) => x-y)
		// ((4-3)-2-1) = -2
		val i2: Int = list2.reduceRight(_-_)
		println(i2)
		//Fold 折叠：化简的一种特殊情况
		val list3 = List(1,2,3,4)
		// fold 方法使用了函数柯里化，存在两个参数列表
		// 第一个参数列表为 ： 零值（初始值）
		// 第二个参数列表为： 简化规则
		// fold 底层其实为 foldLeft
		println(list3.foldLeft(1)((x,y)=>x-y))		//	1-1-2-3-4
		println(list3.foldRight(10)((x,y)=>x-y))	//	1-(2-(3-(4-10)))

		println("===============================Map合并================================")
		// 两个 Map 的数据合并
		val map1 = mutable.Map("a"->1, "b"->2, "c"->3)
		val map2 = mutable.Map("a"->4, "b"->5, "d"->6)
		println(map1 ++ map2)
		val map3: mutable.Map[String, Int] = map2.foldLeft(map1)
		{
			(map, kv) => {
				val k = kv._1
				val v = kv._2
				map(k) = map.getOrElse(k, 0) + v
				map
			}
		}
		println(map3)

	}

}
