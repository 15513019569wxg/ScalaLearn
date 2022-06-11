package 特质

/*
    @author wxg
    @date 2021/7/25-16:42
    */
object TraitMixin {
	/*（ 1）特质可以同时拥有抽象方法和具体方法
		（ 2）一个类可以混入（ mixin）多个特质
		（ 3）所有的 Java 接口都可以当做 Scala 特质使用
		（ 4） 动态混入：可灵活的扩展类的功能
			（ 4.1）动态混入：创建对象时混入 trait，而无需使类混入该 trait
			（ 4.2）如果混入的 trait 中有未实现的方法，则需要实现
				*/
	def main(args: Array[String]): Unit = {
		val teacher = new Teacher
		teacher.say()
		teacher.eat()
		//（ 4）动态混入：可灵活的扩展类的功能
		val t2 = new Teacher with SexTrait {
			override var sex: String = "男"
		}
		//调用混入 trait 的属性
		println(t2.sex)
	}

}

trait PersonTrait {
	//（ 1）特质可以同时拥有抽象方法和具体方法
	// 声明属性
	var name: String = _
	// 抽象属性
	var age:Int
	// 声明方法
	def eat(): Unit = {
		println("eat")
	}
	// 抽象方法
	def say(): Unit
}
trait SexTrait {
	var sex: String
}


//（ 2）一个类可以实现/继承多个特质
//（ 3）所有的 Java 接口都可以当做 Scala 特质使用
class Teacher extends PersonTrait with java.io.Serializable {
	override def say(): Unit = {
		println("say")
	}
	override var age: Int = _
}