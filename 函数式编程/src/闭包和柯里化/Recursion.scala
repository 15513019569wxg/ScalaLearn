package 闭包和柯里化

/*
    @author wxg
    @date 2021/7/3-11:28
    */
object Recursion {
	def main(args: Array[String]): Unit = {
		import scala.annotation.tailrec
		// 阶乘
		// 递归算法
		// 1) 方法调用自身
		// 2) 方法必须要有跳出的逻辑
		// 3) 方法调用自身时，传递的参数应该有规律
		// 4) scala 中的递归必须声明函数返回值类型
		def test(i : Int) : Int = {
			if (i == 1) {
				1
			} else {
				i * test(i - 1)
			}
		}
		println(test(6))

		//	尾递归实现
		def tailFact(n: Int): Int = {
			@tailrec
			def loop(n: Int, currRet: Int): Int={
				if (n == 0) return currRet
				loop(n - 1, currRet * n)
			}
			loop(n, 1)
		}

		println(tailFact(5))
	}

}
