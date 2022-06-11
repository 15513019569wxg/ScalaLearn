package 变量和数据结构.数据类型

/*
    @author wxg
    @date 2021/7/23-20:55
    */
object Null {


	def main(args: Array[String]): Unit = {
		//	Unit -----> 只有一个对象实例()
		//	Null ------> 只有一个对象实例 null
		//	Nothing ------> 类型是否存在不知道，有可能异常

		//	Unit
		def func(): Unit ={
			println("hello")
		}
		val ret: Unit = func()
		println(ret)		//	()


		// Null只可以赋值给对象的引用类型，不能赋给值的引用类型
		//		val n :Int= null
		//		println(n)

		var student: Student = new Student()
		student = null
		println(student)

		//	Nothing
		def funcNoth(n: Int): Int ={
			if (n == 0)
				throw new NullPointerException
			else
				return n
		}

		val nothing: Unit = funcNoth(0)
		println(nothing)

	}

}


class Student(){

}
