package 匹配for模式

/*
    @author wxg
    @date 2021/7/28-23:46
    */
object forExpressionMatching {
	def main(args: Array[String]): Unit = {
		val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
		for ((k, v) <- map) { //直接将 map 中的 k-v 遍历出来
			println(k + " -> " + v) //3 个
		}
		println("----------------------")
		//不考虑位置遍历
		for((k, _) <- map){
			println(k)
		}
		println("----------------------")
		//考虑位置遍历
		for(("B", count) <- map){
			println(count)
		}
		println("----------------------")
		//遍历 value=0 的 k-v ,如果 v 不是 0,过滤
		for ((k, 0) <- map) {
			println(k + " --> " + 0) // B->0
		}
		println("----------------------")
		//if v == 0 是一个过滤的条件
		for ((k, v) <- map if v >= 1) {
			println(k + " ---> " + v) // A->1 和 c->33
		}
	}
}
