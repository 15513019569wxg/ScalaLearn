package 匹配数组

/*
    @author wxg
    @date 2021/7/28-23:18
    */
object MatchArray {
	/*
		scala 模式匹配可以对集合进行精确的匹配，例如匹配只有两个元素的、且第一个元素为 0 的数组
		匹配顺序如果成功，就不再匹配了
	 */
	def main(args: Array[String]): Unit = {
		for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1), Array("hello", 90)))
		{ // 对一个数组集合进行遍历
			val result: String = arr match {
				case Array(0) => "0" //匹配 Array(0) 这个数组
				case Array(x, y) => x + "," + y //匹配有两个元素的数组，然后将将元素值赋给对应的 x,y
				case Array(0, _*) => "以 0 开头的数组" //匹配以 0 开头和数组
				case Array(_, 1, _)	=> "匹配第二个元素为 1 的数组"
				case _ => "something else"
			}
			println("result = " + result)
		}
	}
}
