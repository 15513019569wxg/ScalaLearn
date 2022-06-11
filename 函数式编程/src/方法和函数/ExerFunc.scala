package 方法和函数

/*
    @author wxg
    @date 2021/7/2-14:40
    */
object ExerFunc {
	/*
	 * 练习 1：定义一个匿名函数，并将它作为值赋给变量 fun。函数有三个参数，类型分别为 Int， String， Char，返回值类型为 Boolean。
	 *         要求调用函数 fun(0, “”, ‘0’)得到返回值为 false，其它情况均返回 true。
	 */
	def main(args: Array[String]): Unit = {
		val function: (Int, String, Char) => Boolean = (i: Int, s: String, c: Char) => {
			if (i == 0 && s == "" && c == '0') true else false
		}
		println(function(0, "", '0'))
		println(function(1, "", '0'))
		println(function(0, "hello", '0'))
		println(function(0, "", 'a'))
	}

	/*
	练习 2： 定义一个函数 func，它接收一个 Int 类型的参数，返回一个函数（记作 f1）。它返回的函数 f1，接收一个 String 类型的参数，
	          同样返回一个函数（记作 f2）。函数 f2 接收一个 Char 类型的参数，返回一个 Boolean 的值。
		     要求调用函数 func(0) (“”) (‘0’)得到返回值为 false，其它情况均返回 true。
	 */
	def func(i: Int): String => ((Char) => Boolean) ={
		def f1(s: String): (Char) => Boolean ={
			def f2(c: Char): Boolean ={if (i == 0 && s == "" && c == '0') true else false}
			f2
		}
		f1
	}

	//调用
	func(0)("")('0')

	//匿名函数简化
	def func2(i: Int): String => ((Char) => Boolean) ={
		s: String => (c: Char) => {if (i == 0 && s == "" && c == '0') true else false}
	}
	func2(0)("hello")('0')

	//将匿名函数的参数进行柯里化
	def func3(i: Int)(s: String)(c: Char): Boolean ={
		 {if (i == 0 && s == "" && c == '0') true else false}
	}
	func3(0)("hello")('0')
}
