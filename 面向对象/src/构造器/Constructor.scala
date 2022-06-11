package 构造器

/*
    @author wxg
    @date 2021/7/25-8:53
    */
object Constructor {
	def main(args: Array[String]): Unit = {
		val movie: Movie = new Movie()	//这里利用主构造器创建对象，主构造器可以不用加（）
		movie.Movie()
		println("---" *20)

		val movie1: Movie = new Movie("霸王别姬")
		movie1.Movie()
		println("==" * 20)

		val movie2: Movie = new Movie("霸王别姬", 123)
		movie2.Movie()
	}

}

/**
 * 和 Java 一样， Scala 构造对象也需要调用构造方法，并且可以有任意多个构造方法。<p>
	Scala 类的构造器包括： 主构造器和辅助构造器	<p>
		1）基本语法
			class 类名(形参列表) { // 主构造器	<p>
			// 类体	<p>
				def this(形参列表) { // 辅助构造器	<p>
				}	<p>
				def this(形参列表) { //辅助构造器可以有多个...	<p>
				}	<p>
			}	<p>
	说明：
	（1）辅助构造器， 函数的名称 this，可以有多个，编译器通过参数的个数及类型
	来区分。<p>
	（2）辅助构造方法不能直接构建对象，必须直接或者间接调用主构造方法。	<p>
	（3）构造器调用其他另外的构造器， 要求被调用构造器必须提前声明。	<p>
 */

//（ 1）如果主构造器无参数，小括号可省略
class Movie (){		//主构造器是空参的，可以不用加（）
	//	类属性
	var name: String = _
	var time: Int = _
	println("主构造器被调用")

	//	声明辅助构造器方法
	def this(name: String){
		this()	//	直接调用主构造器
		println("辅助构造器一被调用")
		this.name = name
		println(s"$name, $time")
	}

	def this(name:String, time:Int){
		this(name)
		println("辅助构造器二被调用")
		this.time = time
		println(s"$name, #time")
	}

	//	定义普通方法
	def Movie(): Unit ={
		println("普通方法被调用")
	}
}
