package 特质

/*
    @author wxg
    @date 2021/7/25-15:50
    */
object DefTrait {
	/**
	 * 通过查看字节码，可以看到特质=抽象类+接口
	 *
	 * Scala 语言中，采用特质 trait（特征）来代替接口的概念，也就是说，多个类具有相同的特质（特征）时，就可以将这个特质（特征）独立出来，采用关键字 trait 声明。
		Scala 中的 trait 中即可以有抽象属性和方法，也可以有具体的属性和方法， 一个类可以混入（ mixin）多个特质。这种感觉类似于 Java 中的抽象类。
		Scala 引入 trait 特征，第一可以替代 Java 的接口，第二个也是对单继承机制的一种补充

	一个类具有某种特质（特征），就意味着这个类满足了这个特质（特征）的所有要素，
		所以在使用时，也采用了 extends 关键字，如果有多个特质或存在父类，那么需要采用 with
		关键字连接。
		1） 基本语法：
			没有父类： class 类名 extends 特质 1 with 特质 2 with 特质 3 …
			有父类：class 类名 extends 父类 with 特质 1 with 特质 2 with 特质 3…
		2）说明
		（ 1）类和特质的关系：使用继承的关系。
		（ 2）当一个类去继承特质时，第一个连接词是 extends，后面是 with。
		（ 3）如果一个类在同时继承特质和父类时，应当把父类写在 extends 后。

	 * @param args
	 */
	def main(args: Array[String]): Unit = {
		val gongFu: GongFu = new GongFu()
		gongFu.func3()
		gongFu.comment()
	}
}

//	定义一个父类
class Video {
	var name: String = "Video"
	var id: Int = 1
	def comment (): Unit ={
		println(s"$name")
	}

}

//	声明特质
trait Smile{
	//	声明抽象属性和非抽象属性
	var elem: String
	var people: String = "周星驰"
	//	声明抽象方法和非抽象方法
	def func1(): Unit ={
		println("特质中的非抽象方法")
	}

	def func2(): Unit
	def comment (): Unit ={
		println("comments Smile")
	}
}

class GongFu extends Video with Smile{
	//	重写抽象方法和抽象属性
	var elem:String  = "smile"
	override def func2(): Unit = {
		println("实现抽象方法")
		super.func1()
	}
//	name = "GongFu"
	//	重写父类和特质中冲突的方法（如果父类和特质中存在相同的方法，则必须重写此方法）
	override def comment(): Unit = println(s"$name")

	//	定义自己的方法
	def func3(): Unit = {
		func1()
		super.comment()	//	这里的comment()指得是特质中的方法,从最后边开始叠加
		println("子类特有的方法")
	}

}
