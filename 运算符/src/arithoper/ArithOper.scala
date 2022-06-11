package arithoper

/*
    @author wxg
    @date 2021/7/24-1:09
    */
object ArithOper {
	def main(args: Array[String]): Unit = {
		//（ 1）对于除号“/”，它的整数除和小数除是有区别的：整数之间做除法时，只保留整数部分而舍弃小数部分。
		var r1: Int = 10 / 3 // 3
		println("r1=" + r1)
		var r2: Double = 10 / 3 // 3.0
		println("r2=" + r2)
		var r3: Double = 10.0 / 3 // 3.3333
		println("r3=" + r3)
		println("r3=" + r3.formatted("%.2f")) // 含义：保留小数点 2位，使用四舍五入
	}


}
