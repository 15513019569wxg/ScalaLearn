package 闭包和柯里化

/*
    @author wxg
    @date 2021/7/3-11:31
    */
object ControlAbst {
	//值调用： 把计算后的值传递过去
	def main(args: Array[String]): Unit = {
		//	传值参数
		def g1(i: Int): Unit = {
			print(i)
		}

		def g2(): Int = {
			print("g1调用")
			12
		}

		def q = () => {
			println("f...")
			10
		}

		val t = () => {
			println("f...")
			10
		}
		g1(g2())
		g1(t())
		g1(q())
		println("===" * 10)

		/*
		 传名函数, 传递的不是具体值，而是代码块
		 a 和 代码块 绑定在一起执行，但是a实际接受的值是代码块的返回值
		 */
		def f1(a: => Int): Unit = {
			println("a: " + a)
			println("a: " + a)
		}
		//	23这里就代表着代码块：{23}, 这里省略了{}
		f1(23)
		//	以函数的形式将代码块传进去
		f1(g2())
		//	直接传递代码块,可以省略()
		f1 {
			print(2 + 3)
			3
		}

		//	自定义一个while循环
		//	用闭包实现一个函数，将代码块作为参数传入，递归调用
		def myWhile0(condition: => Boolean): (=> Unit) => Unit = {
			//	内层函数需要递归调用，参数就是循环体
			def loop(op: => Unit): Unit = {
				if (condition) {
					op
					myWhile0(condition)(op)
				}
			}

			loop _
		}

		var n: Int = 2
		myWhile1(n <= 10)({
			println(n)
			n += 1
		})

		//简化
		// lambda表达式
		def myWhile1(condition: => Boolean): (=> Unit) => Unit = {
			//	内层函数需要递归调用，参数就是循环体
			(op) => {
				if (condition) {
					op
					myWhile1(condition)(op)
				}
			}
		}

		var j: Int = 3
		myWhile1(j <= 10)({
			println(j)
			j += 1
		})

		//	柯里化
		def myWhile2(condition: => Boolean)(op: => Unit): Unit = {
			if (condition) {
				op
				myWhile2(condition)(op)
			}
		}

		// 这里代码块外部的小括号可以省略
		var i: Int = 1
		myWhile2(i <= 10) {
			println(i)
			i += 1
		}
	}
}
