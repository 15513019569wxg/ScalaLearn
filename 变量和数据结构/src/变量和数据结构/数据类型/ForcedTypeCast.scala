package 变量和数据结构.数据类型

/*
    @author wxg
    @date 2021/7/23-23:59
    */
object ForcedTypeCast {
	def main(args: Array[String]): Unit = {
		/*
		1） 基本说明
			自动类型转换的逆过程，将精度大的数值类型转换为精度小的数值类型。使用时要加上
			强制转函数，但可能造成精度降低或溢出，格外要注意。
			Java : int num = (int)2.5
			Scala : var num : Int = 2.7.toInt
		 */
		//（ 1）将数据由高精度转换为低精度，就需要使用到强制转换
		var n1: Int = -2.5.toInt // 这个存在精度损失
		println(n1)

		//（ 2）强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
		var r1: Int = 10 * 3.5.toInt + 6 * 1.5.toInt // 10 *3 + 6*1 = 36
		var r2: Int = (10 * 3.5 + 6 * 1.5).toInt // 44.0.toInt = 44
		println("r1=" + r1 + " r2=" + r2)
	}

}
