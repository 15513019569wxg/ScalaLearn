package com {
	object Outer {
		val out: String = "out"
		def main(args: Array[String]): Unit = {
			import com.atguigu.Inner	//父包访问子包需要导包
			println(Inner.in)
		}
	}
	package atguigu {
		object Inner {
			val in: String = "in"
			def main(args: Array[String]): Unit = {
				println(Outer.out) //子包访问父包无需导包
				import 包.shareMethod	//调用包对象的方法
				shareMethod()
			}
		}
	}
}


package other {
}