package 抽象类

/*
    @author wxg
    @date 2021/7/25-10:52
    */
object AbsClass {
	/**
	 * 基本语法	<p>
	 * （ 1）定义抽象类： abstract class Person{} //通过 abstract 关键字标记抽象类	<p>
	 * （ 2）定义抽象属性： val|var name:String //一个属性没有初始化，就是抽象属性	<p>
	 * （ 3）定义抽象方法： def hello():String //只声明而没有实现的方法，就是抽象方法	<p>
	 * 继承&重写	<p>
	 * （ 1）如果父类为抽象类，那么子类需要将抽象的属性和方法实现，否则子类也需声明为抽象类	<p>
	 * （ 2）重写非抽象方法需要用 override 修饰，重写抽象方法则可以不加 override。	<p>
	 * （ 3）子类中调用父类的方法使用 super 关键字	<p>
	 * （ 4） 子类对抽象属性进行实现，父类抽象属性可以用 var 修饰；	<p>
	 * 子类对非抽象属性重写，父类非抽象属性只支持 val 类型，而不支持 var。因为 var 修饰的为可变变量，子类继承之后就可以直接使用，没有必要重写
	 *
	 * @param args
	 */
	def main(args: Array[String]): Unit = {
		val teacher: Teacher = new Teacher()
		teacher.eat()
		teacher.sleep()

	}

}

//	抽象类
abstract class Person {
	//	抽象属性r
	val name: String
	//	非抽象属性
	val age: Int = 20

	//	抽象方法
	def hello(): Unit

	//	非抽象方法
	def eat(): Unit = {
		println("父类的eat()")
	}

	def sleep(): Unit = {
		println("父类的sleep()")
	}
}

class Teacher extends Person {
	//	var不可以重写，直接就可以进行修改，只有val属性才能使用override
	val name: String = "teacher"

	//	重写抽象方法
	override def hello(): Unit = { //	override也可以不写
		println("hello teacher")
	}

	//	重写非抽象方法
	override def eat(): Unit = {
		//	调用父类的方法
		super.eat()
		println("重写父类的非抽象方法eat()")
	}

}




