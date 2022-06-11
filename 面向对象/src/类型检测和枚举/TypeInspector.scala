package 类型检测和枚举

/*
    @author wxg
    @date 2021/7/25-17:42
    */
object TypeInspectorAndTransform {
	/*
	1） 说明
	（ 1） obj.isInstanceOf[T]：判断 obj 是不是 T 类型。
	（ 2） obj.asInstanceOf[T]：将 obj 强转成 T 类型。
	（ 3） classOf 获取对象的类名。
	 */
	def main(args: Array[String]): Unit = {
		val person: Person = new Student("Bob", 25)
		person.sayHi()
		val student: Student = new Student("Bob", 25)
		student.study()
		student.sayHi()
		println(student.isInstanceOf[Person])
		println(student.isInstanceOf[Student])
		println(person.isInstanceOf[Person])
		println(person.isInstanceOf[Student])

		//（ 1）判断对象是否为某个类型的实例
		val bool: Boolean = person.isInstanceOf[Student]
		if ( bool ) {
			//（ 2）将对象转换为某个类型的实例
			val p1: Student = person.asInstanceOf[Student]
			p1.study()
			println(p1)
		}
		//（ 3）获取类的信息
		println(classOf[Student])
	}

}

class Person(val name:String, val age: Int){
	def sayHi(): Unit ={
		println(" Person " + name)
	}
}

class Student(name: String, age: Int) extends Person(name: String, age: Int){
	override def sayHi(): Unit ={
		println(" Student " + name)
	}
	def study(): Unit ={
		println("student study")
	}
}