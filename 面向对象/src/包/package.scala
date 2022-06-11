/**
 *
 */
/*
    @author wxg
    @date 2021/7/6-20:20
    */
package object 包 {
	/*
		在 Scala 中可以为每个包定义一个同名的包对象， 定义在包对象中的成员， 作为其对
	应包下所有 class 和 object 的共享变量， 可以被直接访问。
	 */
	val  name ="share"
	def shareMethod(): Unit ={
		println("我是包对象中的方法")
	}
	/*
		（ 1）若使用 Java 的包管理风格，则包对象一般定义在其对应包下的 package.scala
	文件中，包对象名与包名保持一致。
		（ 2）如采用嵌套方式管理包，则包对象可与包定义在同一文件中，但是要保证包对象
	与包声明在同一作用域中。
	 */
}

package 包 {
	object Outer {
		val out: String = "out"
		def main(args: Array[String]): Unit = {
			println(name)
		}
	}
}


package aa{
	package bb{
		object test{
			def main(args: Array[String]): Unit = {
				println(value_aa)
				//	此时bb的包和包对象不在同一个作用域中，只有采用_root_.bb.value_bb的方式才能访问bb的属性和方法
				println(bb.value_bb)
			}
		}
	}
	package object bb{
		var value_bb: String = "hello world"
	}
}

package object aa{
	val value_aa: String = "hello world"
}


