package 变量和数据结构

/*
    @author wxg
    @date 2021/7/23-19:37
    */
object String {
	val name = "hema"
	val age = 28
	val num : Float = 2.4534f
	def main(args: Array[String]): Unit = {
		printf("%s, %d", name, age)
		//	模板字符串s
		println(s"${name}, ${age}")
		//	模板字符串f
		println(f"${num}%2.3f")
		//	raw
		println(raw"${num}%2.3f")
		//	三引号，可以保持原来的字符串的段落格式
		val sql: String =
			"""
				| selsct
				| 	name, age
				| from user
				| where
				| 	id = "1001"
				|""".stripMargin
		println(sql)
	}

}
