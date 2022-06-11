package 变量和数据结构.数据类型

/*
    @author wxg
    @date 2021/7/24-0:28
    */
object StringConv {
	def main(args: Array[String]): Unit = {
		//	1） 基本说明
		//	在程序开发中，我们经常需要将基本数值类型转成 String 类型。或者将 String 类型转成基本数值类型
		//（ 1）基本类型转 String 类型（语法：将基本类型的值+"" 即可）
		var str1 : String = true + ""
		var str2 : String = 4.5 + ""
		var str3 : String = 100 +""
		//（ 2） String 类型转基本数值类型（语法：调用相关 API）
		var s1 : String = "12"
		var n1 : Byte = s1.toByte
		var n2 : Short = s1.toShort
		var n3 : Int = s1.toInt
		var n4 : Long = s1.toLong
		var s2 : String = "12.3"
		val n5: Float = s2.toFloat
		//	val n6: Int = s2.toInt		//error
		val n7: Float = s2.toDouble.toInt
		println(n7)

		//（3）注意事项
		//在将 String 类型转成基本数值类型时，要确保 String 类型能够转成有效的数据，比如我们可以把"123"，转成一个整数，但是不能把"hello"转成一个整数。
		//var n5:Int = "12.6".toInt 会出现 NumberFormatException 异常。
	}

}
