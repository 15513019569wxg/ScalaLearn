package set

/*
    @author wxg
    @date 2021/7/26-10:11
    */
object ImmutableMap {
	def main(args: Array[String]): Unit = {
		import scala.collection.mutable
		//（ 1）创建可变集合
		val map: mutable.Map[String, Int] = mutable.Map( "a"->1, "b"->2, "c"->3 )
		println(map)
		//（ 3）向集合增加数据
		map.+=("d" -> 4)
		println(map)
		println("===" * 10)

		// 将数值 4 添加到集合，并把集合中原值 1 返回
		val maybeInt: Option[Int] = map.put("a", 4)
		println(maybeInt)
		println(maybeInt.getOrElse(0))
		println(map)
		map += (("e", 7))
		println("===" * 10)

		//（ 4）删除数据
		map.-=("b", "c")
		//（ 5）修改数据
		map.update("d",5)
		map("d") = 5
		//（ 2）打印集合
		map.foreach((kv)=>{println(kv)})
		println("===" * 10)
		//	合并map， 无则添加，有则覆盖
		val map1: Map[String, Int] = Map("m" -> 3, "n" -> 5, "a" -> 7)
		map ++= map1
		println(map)
		//	不可变map1，无则添加，有则覆盖
		val map2: Map[String, Int] = map1 ++ map
		println(map2)
	}

}
