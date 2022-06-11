package 闭包和柯里化

/*
    @author wxg
    @date 2021/7/2-15:14
    */
object CurryingAndClosures {
	/*
	闭包：如果一个函数，访问到了它的外部（ 局部） 变量的值，那么这个函数和他所处的环境，称为闭包
	函数柯里化：把一个参数列表的多个参数，变成多个参数列表。
	 */
	def main(args: Array[String]): Unit = {
		def f1() = {
			val a: Int = 10
			// 函数柯里化，其实就是将复杂的参数逻辑变得简单化,函数柯里化一定存在闭包
			def f2(b: Int) = {
				a + b
			}
			f2 _
		}

		// 在调用时， f1 函数执行完毕后，局部变量 a 应该随着栈空间释放掉
		val f = f1()
		// 但是在此处，变量 a 其实并没有释放，而是包含在了 f2 函数的内部，形成了闭合的效果
		println(f(3))
		println(f1()(3))
	}
}

