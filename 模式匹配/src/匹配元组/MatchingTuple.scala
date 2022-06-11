package 匹配元组

/*
    @author wxg
    @date 2021/7/28-23:28
    */
object MatchingTuple {
	def main(args: Array[String]): Unit = {
		//对一个元组集合进行遍历
		for (tuple <- Array((0, 1), (1, 0), (1, 1), (1, 0, 2))) {
			val result: String = tuple match {
				case (0, _) => "0 ..." //是第一个元素是 0 的元组
				case (y, 0) => "" + y + "0" // 匹配后一个元素是 0 的对偶元组
				case (a, b) => "" + a + " " + b
				case (a, _, 2) => "匹配最后一个元素是2的元组"
				case (_, _, _) => "匹配任意三元组"
				case _ => "something else" //默认
			}
			println(result)
		}
	}
}
