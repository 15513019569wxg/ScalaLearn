package 匹配变量

/*
    @author wxg
    @date 2021/7/28-23:33
    */
object MatchAtVariableDeclaration {
	def main(args: Array[String]): Unit = {
		//特殊的模式匹配 1 打印元组第一个元素
		for (elem <- Array(("a", 1), ("b", 2), ("c", 3))) println(elem._1)
		for ((word, count) <- Array(("a", 1), ("b", 2), ("c", 3))) println(word)
		for ((word, _) <- Array(("a", 1), ("b", 2), ("c", 3))) println(word)
		for (("a", count) <- Array(("a", 1), ("b", 2), ("c", 3))) println(count)

		//特殊的模式匹配 2 给元组元素命名
		var (id,name,age): (Int, String, Int) = (100, "zs", 20)
		println((id,name,age))
		println("--------------")

		//特殊的模式匹配 3 遍历集合中的元组，给 count * 2
		var list: List[(String, Int)] = List(("a", 1), ("b", 2), ("c", 3))
		//println(list.map(t => (t._1, t._2 * 2)))
		println(list.map{ case (word,count)=>(word,count*2)})
		var list1 = List(("a", ("a", 1)), ("b", ("b", 2)), ("c", ("c", 3)))
		println(list1.map{ case (groupkey,(word,count))=>(word,count*2)})
		var List(first, second, _*) = List(1, 2, 3, 4, 5)
		println(s"$first, $second, ")
		var fir :: sec :: th = List(1, 2, 3, 4, 5)
		println(s"$fir, $sec, $th")
		

	}
}
