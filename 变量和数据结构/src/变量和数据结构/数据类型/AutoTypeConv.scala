package 变量和数据结构.数据类型

/*
    @author wxg
    @date 2021/7/23-23:43
    */
object AutoTypeConv {
	def main(args: Array[String]): Unit = {
		//	(1)、自动类型提升：多种数据类型混合运算时，系统首先自动将所有数据转换成精度更大的数据类型，然后进行运算
		val a1: Byte = 10
		val b1: Long = 3456
		val ret: Long = a1 + b1
		val ret2: Int = (a1 + b1.toInt)

		//	(2)、把精度更大的数据类型转换成精度更小的数据类型时，会报错；反之，就会进行类型转换
		val a2: Byte = 10
		val b2: Int = 456
		//	val c2: Int = a2

		//	(3)、（Byte、Short）和char之间不会相互自动转换
		val a3: Byte = 10
		val b3: Char = 'b'
		//	val c3: Byte = b3		// error
		val c3: Int = b3
		println(c3)

		//	(4)、Byte,Short,Long相互运算时，必须首先转化成Int类型
		val a4: Byte = 10
		val b4: Short = 20
		val c4: Char = 'c'
		val ret3: Int = a4 + b4
		val ret4: Int = a4 + b4 + c4
		println(ret4)

	}

}
