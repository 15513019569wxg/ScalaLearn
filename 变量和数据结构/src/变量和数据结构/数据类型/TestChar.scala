package 变量和数据结构.数据类型

/*
    @author wxg
    @date 2021/7/23-20:43
    */
object TestChar {
	/**
	 * char类型底层存储的是ascii码
	 * @param args
	 */
	def main(args: Array[String]): Unit = {
		val char1  = 'a'
		val Int1: Int = char1
		println(Int1)

		val char2  = (Int1 + 1).toChar
		println(char2)
	}


}
