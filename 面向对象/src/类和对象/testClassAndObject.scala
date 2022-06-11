package 类和对象
import scala.beans.BeanProperty
/*
    @author wxg
    @date 2021/7/6-21:23
    */
object testClassAndObject {
	/**
	 *  回顾： Java 中的类如果类是 public 的，则必须和文件名一致。<p>
		一般，一个.java 有一个 public 类	<p>
		注意： Scala 中没有 public，一个.scala 中可以写多个类。<p>
		1）基本语法	<p>
			[修饰符] class 类名 {类体}

	 * @param args 数组
	 */
	def main(args: Array[String]): Unit = {
		val student: Student = new Student()
		println(student.age)
		println(student.sex)
		student.sex = "male"
		println(student.sex)
	}

}

//（ 1） Scala 语法中，类并不声明为 public，所有这些类都具有公有可见性（即默认就是 public）
class Student{
	private var name: String = "alice"
	@BeanProperty
	var age: Int = _
	var sex: String = _
}


//（ 2）一个 Scala 源文件可以包含多个类
//class Teacher{}
