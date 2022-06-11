package ifAndfor

/*
    @author wxg
    @date 2021/7/2-8:14
 */

object ForTest {
	def main(args: Array[String]): Unit = {
		import scala.collection.immutable
		// 范围数据循环(包含边界)
		for (i <- 1 to 10) { //for (i <- 1.to(10))
			print(i + "\t")
		}

		println()
		//  不包含边界
		for (i <- Range(1, 10)) {
			println(i + ".hello world")
		}
		for (i <- 1 until 3) {
			print(i + "\t")
		}
		println("----" * 5)

		/**
		 * 循环守卫，即循环保护式（也称条件判断式，守卫）。保护式为 true 则进入循环体内部，为 false 则跳过，类似于 continue。
		 */
		for (i <- 1 to 3 if i != 2) {
			print(i + " ")
		}

		//  集合遍历
		for (i <- Array(1, 2, 3)) {
			println(i)
		}
		for (i <- List(1, 2, 3)) {
			println(i)
		}
		for (i <- Set(1, 2, 3)) {
			println(i)
		}

		//  循环步长
		for (i <- 1 to 10 by 2) {
			println("i=" + i)
		}
		for (i <- 10 to 1 by -2) {
			println("i=" + i)
		}
		for (i <- 1 to 10 reverse) {
			println("i=" + i)
		}

		for (i <- 1.0 to 10.0 by 0.5) {
			println("i=" + i)
		}

		//  嵌套循环
		for (i <- 1 to 9) {
			for (j <- 1 to i) {
				print(s"$j * $i = ${i * j} \t")
			}
			println()
		}
		//  简写
		for (i <- 1 to 9; j <- 1 to i) {
			print(s"$j * $i = ${i * j} \t")
			if (j == i) println()
		}

		//  引入变量
		for (i <- 1 to 10; j = 10 - i) {
			println(" i = " + i + ", j = " + j)
		}

		/**
		 * for 推导式有一个不成文的约定：当 for 推导式仅包含单一表达式时使用圆括号，当包含多个表达式时，一般每行一个表达式，并用花括号代替圆括号
		 */
		for {
			i <- 1 to 10
			j = 10 - i
		} {
			println("i = " + i + ", j = " + j)
		}

		//  打印九层妖塔
		for (i <- 1 to 9; stars = 2 * i - 1; spaces = 9 - i) {
			println(" " * spaces + "*" * stars)
		}

		//  循环返回值,在for循环中默认返回的值都是Unit
		val ints: immutable.IndexedSeq[Int] = for (i <- 1 to 20) yield i * 2
		println(ints)
	}
}
