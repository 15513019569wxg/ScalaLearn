package compoper

/*
    @author wxg
    @date 2021/7/24-1:12
    */
object CompOper {


	def main(args: Array[String]): Unit = {
		// 测试： >、 >=、 <=、 <、 ==、 !=
		var a: Int = 2
		var b: Int = 1
		println(a > b) // true
		println(a >= b) // true
		println(a <= b) // false
		println(a < b) // false
		println("a==b" + (a == b)) // false
		println(a != b) // true

		/*
		（2）需求 2： Java 和 Scala 中关于==的区别
			Java：
			==比较两个变量本身的值，即两个对象在内存中的首地址；
			equals 比较字符串中所包含的内容是否相同。

			Scala： ==更加类似于 Java 中的 equals
		 */
		val s1 = "abc"
		val s2 = new String("abc")
		println(s1 == s2)
		println(s1.eq(s2))
	}


}


