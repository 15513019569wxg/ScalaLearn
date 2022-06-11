package 类和对象

/*
    @author wxg
    @date 2021/7/6-21:36
    */
object Encapsulation {
	/*
		封装就是把抽象出的数据和对数据的操作封装在一起，数据被保护在内部，程序的其它
	部分只有通过被授权的操作（成员方法），才能对数据进行操作。 Java 封装操作如下，
		（ 1）将属性进行私有化
		（ 2）提供一个公共的 set 方法，用于对属性赋值
		（ 3）提供一个公共的 get 方法，用于获取属性的值

		Scala 中的 public 属性，底层实际为 private，并通过 get 方法（ obj.field()）和 set 方法
	（obj.field_=(value)）对其进行操作。所以 Scala 并不推荐将属性设为 private，再为其设置
	public 的 get 和 set 方法的做法。但由于很多 Java 框架都利用反射调用 getXXX 和 setXXX 方
	法，有时候为了和这些框架兼容，也会为 Scala 的属性设置 getXXX 和 setXXX 方法（通过
	@BeanProperty 注解实现）。
	 */

	/*
	访问权限
	1） 说明
		在 Java 中，访问权限分为： public， private， protected 和默认。在 Scala 中，你可以通
	过类似的修饰符达到同样的效果。但是使用上有区别。
		（ 1） Scala 中属性和方法的默认访问权限为 public，但 Scala 中无 public 关键字。
		（ 2） private 为私有权限，只在类的内部和伴生对象中可用。
		（ 3） protected 为受保护权限， Scala 中受保护权限比 Java 中更严格，同类、子类可以
		访问，同包无法访问。
		（ 4） private[包名]增加包访问权限，包名下的其他类也可以使用
	*/

}

class Person {
	private val name: String = "bobo"
	protected var age: Int = 18
	var sex: String = "男"

	def say(): Unit = {
		println(name)
	}
}

//	伴生对象
object Person {
	def main(args: Array[String]): Unit = {
		val person = new Person
		person.say()
		println(person.name)
		println(person.age)
	}
}

class Teacher extends Person {
	def test(): Unit = {
		this.age
		this.sex
	}
}

class Animal {
	def test(): Unit = {
		new Person().sex
	}
}
