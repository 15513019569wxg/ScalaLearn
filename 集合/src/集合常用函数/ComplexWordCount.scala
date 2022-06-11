package 集合常用函数

/*
    @author wxg
    @date 2021/7/27-9:54
    */
object ComplexWordCount {
	def main(args: Array[String]): Unit = {
		println("==================================第一种方式（不通用）===============================")
		val tupleList = List(("Hello Scala Spark World", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))
		val stringList: List[String] = tupleList.map(t => (t._1 + " ") * t._2)
		println(stringList)
		//val words: List[String] = stringList.flatMap(s=>s.split(" "))
		val words: List[String] = stringList.flatMap(_.split(" "))
		println(words)
		//在 map 中，如果传进来什么就返回什么，不要用_省略
		val groupMap: Map[String, List[String]] = words.groupBy(word=>word)
		//val groupMap: Map[String, List[String]] =words.groupBy(_)
		// (word, list) => (word, count)
		println(groupMap)
		val wordToCount: Map[String, Int] = groupMap.map(t=>(t._1, t._2.size))
		val wordCountList: List[(String, Int)] =
			wordToCount.toList.sortWith {
//				(left, right) => {
//					left._2 > right._2
//				}
				_._2 > _._2
			}
		//tupleList.map(t=>(t._1 + " ") * t._2).flatMap(_.split(" ")).groupBy(word=>word).map(t=>(t._1, t._2.size))
		println(wordCountList)

		println("==================================第二种方式（通用）===============================")
		val tuples = List(("Hello Scala Spark World", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))
		// (Hello,4),(Scala,4),(Spark,4),(World,4)
				// (Hello,3),(Scala,3),(Spark,3)
				// (Hello,2),(Scala,2)
				// (Hello,1)
		val wordToCountList: List[(String, Int)] = tuples.flatMap
		{
			t => {
				val strings: Array[String] = t._1.split(" ")
				strings.map(word => (word, t._2))
			}
		}
		println(wordToCountList)
		// Hello, List((Hello,4), (Hello,3), (Hello,2), (Hello,1))
		// Scala, List((Scala,4), (Scala,3), (Scala,2)
		// Spark, List((Spark,4), (Spark,3)
		// Word, List((Word,4))
		val wordToTupleMap: Map[String, List[(String, Int)]] = wordToCountList.groupBy(t=>t._1)
		println(wordToTupleMap)
		val stringToInts: Map[String, List[Int]] = wordToTupleMap.mapValues  {_.map(t => t._2)}
		println(stringToInts)
		val wordToTotalCountMap: Map[String, Int] =
			stringToInts.map(t=>(t._1, t._2.sum))
		println(wordToTotalCountMap.toList.sortWith(_._2 > _._2))
		/*
		val wordToCountMap: Map[String, List[Int]] =
		wordToTupleMap.map {
		t => {
		(t._1, t._2.map(t1 => t1._2))
		}
		}
		val wordToTotalCountMap: Map[String, Int] =
		wordToCountMap.map(t=>(t._1, t._2.sum))
		println(wordToTotalCountMap)*/
	}

}
