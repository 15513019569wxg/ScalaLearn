package 闭包和柯里化

/*
    @author wxg
    @date 2021/7/3-14:07
    */
object LazyLoading {
	/**
	 * 当函数返回值被声明为 lazy 时，函数的执行将被推迟，直到我们首次对此取值，该函数才会执行。这种函数我们称之为惰性函数
	 * 注意： lazy 不能修饰 var 类型的变量
	 */
	def main(args: Array[String]): Unit = {
		lazy val res = sum(10, 30)
		println("----------------")
		println("res=" + res)
	}

	def sum(n1: Int, n2: Int): Int = {
		println("sum 被执行。。。 ")
		return n1 + n2
	}

}

//	IDEA不支持Scala的导包方式
package com{
	package capensis{
		object test{
			def main(args: Array[String]): Unit = {
				val sum: Int = LazyLoading.sum(10, 20)
				println(sum)
			}
	   }
	}
}
