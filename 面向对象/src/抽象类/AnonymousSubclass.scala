package 抽象类

/*
    @author wxg
    @date 2021/7/25-11:12
    */
object AnonymousSubclass {
	def main(args: Array[String]): Unit = {
		val person1: Person1 = new Person1 {
			override val name: String = "teacher"
			override def hello(): Unit = println("hello teacher")
		}
		println(person1.name)
	}

}


abstract class Person1 {
	val name: String
	def hello(): Unit
}