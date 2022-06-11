package set

/*
    @author wxg
    @date 2021/7/26-9:02
    */
object ImmutableCollection {
	def main(args: Array[String]): Unit = {
		//（ 1） Set 默认是不可变集合，数据无序
		val set = Set(1, 2, 3, 4, 5, 6)
		//（ 2）数据不可重复
		val set1 = Set(1, 2, 3, 4, 5, 6, 3)
		//（ 3）遍历集合
		for (x <- set1) println(x)
		//（4）添加元素
//		val set2.Set[Int] = set.+(20)
		val set2: Set[Int] = set + 20
		println(set1)
		println(set2)

		//（5）合并set
		val setComb: Set[Int] = set ++ set1
		println(set)
		println(set1)
		println(setComb)

		//（6）删除元素
		val set3: Set[Int] = setComb - 5
		println(set3)
		println(setComb)
	}
}
