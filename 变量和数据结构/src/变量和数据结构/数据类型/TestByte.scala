package 变量和数据结构.数据类型

/*
    @author wxg
    @date 2021/7/23-20:33
    */
object TestByte {
	def main(args: Array[String]): Unit = {
		val num1: Byte = 10
//		val num2: Byte = num1 + 20      //error
		val num2: Byte = (num1 + 20).toByte
		println(num2)

//		val num3: Byte = 10 + 20 // Int自动转换为了Byte
//		println(num3)
	}

}
