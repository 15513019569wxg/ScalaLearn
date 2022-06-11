package 继承

/*
    @author wxg
    @date 2021/7/25-10:14
    */
object Extend {
	/**
	 * 1）基本语法
		class 子类名 extends 父类名 { 类体 }
		（ 1）子类继承父类的属性和方法
		（ 2） scala 是单继承
	2）案例实操
	（ 1）子类继承父类的属性和方法
	（ 2）继承的调用顺序： 父类构造器->子类构造器
	 * @param args
	 */
	def main(args: Array[String]): Unit = {
		val book1: Book = new Book("射雕英雄传", 1998)
		println("===" * 20)
		val book2: Book = new Book("射雕英雄传", 1998, 21)

	}

}

//	定义一个父类
class Books(){
	var name: String = _
	var time: Int = _
	println("父类的主构造器被调用")

	def this(name: String, time: Int){
		this()
		println("父类的辅助构造器被调用")
		this.name = name
		this.time = time
	}

	def printInfo(): Unit ={
		println(s"父类：$name, $time")
	}


}

//	定义子类
class Book(name: String, time: Int) extends Books(name,time){
	var bookId: Int = _
	println("子类的主构造器被调用")

	def this(name: String, time:Int, bookId: Int){
		this(name, time)
		println("子类的辅助构造器被调用")
		this.bookId = bookId
	}

	override def printInfo(): Unit = {
		println(s"子类：$name, $time $bookId")
	}

}

