package 构造器

/*
    @author wxg
    @date 2021/7/25-9:15
    */
object ConstrPara {
	/**
	 * 1） 说明	<p>
		Scala 类的主构造器函数的形参包括三种类型：未用任何修饰、 var 修饰、 val 修饰	<p>
		（ 1）未用任何修饰符修饰，这个参数就是一个局部变量	<p>
		（ 2） var 修饰参数，作为类的成员属性使用，可以修改	<p>
		（ 3） val 修饰参数，作为类只读属性使用，不能修改	<p>
	 * @param args
	 */
	def main(args: Array[String]): Unit = {
		val student: Student = new Student("Bob", 28)
		student.name = "Kate"
		println(s"${student.name}, ${student.age}")
		println("---" * 20)

		val student1: Student1 = new Student1("Kate", 24)
//		println(s"${student1.name}, ${student1.age}")
		student1.printInfo()
		println("===" * 20)

		val student2: Student2 = new Student2("Kair", 34)
//		student2.age = 18;		//error

		val student3: Student3 = new Student3("Alicy", 20, "atguigu")
		println(s"${student3.name}, ${student3.age}, ${student3.school}")
		student3.printInfo()






	}
}

//	直接将类属性定义在主构造器方法中
class Student(var name: String, var age: Int)
//	主构造器的参数定义成局部变量
class Student1(name: String, age: Int){
	def printInfo(): Unit ={
		println(s"$name, $age")
	}
}

//	这里属性就不能更改了
class Student2(val name: String, val age: Int)


//	主构造器和辅助构造器都定义参数
class Student3(var name:String, var age: Int){
	var school: String = _
	def this(name: String, age: Int, school: String){
		this(name, age)
		this.school = school
	}
	def printInfo(): Unit ={
		println(s"$name, $age, $school")
	}

}