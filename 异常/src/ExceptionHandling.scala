/*
    @author wxg
    @date 2021/7/29-0:09
    */
object ExceptionHandling {
	/*
		用throw关键字，抛出一个异常对象。所有异常都是Throwable的子类型。throw 表达式是有类型的，就是Nothing。
		因为Nothing是所有类型的子类型，所以throw表达式可以用在需要类型的地方。

		java 提供了throws关键字来声明异常。可以使用方法定义声明异常。它向调用者函数提供了此方法可能引发此异常的信息。
		它有助于调用函数处理并将该代码包含在 try-catch块中，以避免程序异常终止。在Scala中，可以使用 throws 注解来声明异常
	 */
	def main(args: Array[String]): Unit = {
		//	我们将可疑代码封装在try块中。在try块之后使用了一个catch处理程序来捕获异常。如果发生任何异常，catch处理程序将处理它，程序将不会异常终止。
		try {
			var n: Int = 10 / 0
			//	Scala的异常的工作机制和Java一样，但是Scala没有“checked（编译期）”异常，即Scala没有编译异常这个概念，异常都是在运行的时候捕获处理。
		} catch {
			case ex: ArithmeticException =>
				// 发生算术异常
				println("发生算术异常")
			case ex: Exception =>
				// 对异常处理
				println("发生了异常 1")
				println("发生了异常 2")
		} finally {
			println("finally")
		}
		f11()
	}

	def test():Nothing = {
		throw new Exception("不对")
	}

	@throws(classOf[NumberFormatException])
	def f11(): Int = {
		"abc".toInt
	}
}
