package map

/*
    @author wxg
    @date 2021/7/26-9:38
    */
object ImmutableMap {
	def main(args: Array[String]): Unit = {
		// Map
		//（ 1）创建不可变集合 Map
		val map = Map( "a"->1, "b"->2, "c"->3 )
		println(map)
		println(map.getClass)
		println("===" * 10)

		//（ 3）访问数据
		for (elem <- map.keys) {
			// 使用 get 访问 map 集合的数据，会返回特殊类型 Option(选项):有值（ Some），无值(None)
			println(elem + "=" + map.get(elem).get)
			println(elem + "=" + map(elem))
		}
		println("----" * 10)

		//（ 4）如果 key 不存在，返回 0
		println(map.get("d").getOrElse(0))
		println(map.getOrElse("d", 0))
		println("*****" * 10)

		//（ 2）循环打印
		map.foreach((kv: (String, Int)) =>{println(kv)})
		for (key <- map.keys){
			println(s"$key -> ${map.get(key)}")
		}
	}


}
