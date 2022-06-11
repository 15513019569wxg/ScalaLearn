package 多态

/*
    @author wxg
    @date 2021/7/25-10:34
    */
object Polymorphism {
	/**
	 * Scala 中属性和方法都是动态绑定，而 Java 中只有方法为动态绑定。
	 *
	 * @param args
	 */
	def main(args: Array[String]): Unit = {
		val teacher: Teacher = new Teacher()
		println(teacher.name)
		teacher.hello()

		val teacher1: Person = new Teacher
		println(teacher1.name)
		teacher1.hello()
	}

}

class Person {
	val name: String = "person"

	def hello(): Unit = {
		println("hello person")
	}
}

class Teacher extends Person {
	override val name: String = "teacher"

	override def hello(): Unit = {
		println("hello teacher")
	}
}
