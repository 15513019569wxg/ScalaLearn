package 隐式解析机制

/*
    @author wxg
    @date 2021/7/29-1:12
    */
object ImplicitResolutionMechanism extends PersonTrait{
	/*
	（ 1）首先会在当前代码作用域下查找隐式实体（隐式方法、隐式类、隐式对象）。 （一般是这种情况）
	（ 2）如果第一条规则查找隐式实体失败，会继续在隐式参数的类型的作用域里查找。类型的作用域是指与该类型相关联的全部伴生对象以及该类型所在包的包对象。
	 */
	def main(args: Array[String]): Unit = {
		//（ 1）首先会在当前代码作用域下查找隐式实体
		val teacher = new Teacher()
		teacher.eat()
		teacher.say()
	}
	class Teacher {
		def eat(): Unit = {
			println("eat...")
		}
	}

}

trait PersonTrait {
}

object PersonTrait {

	import 隐式解析机制.ImplicitResolutionMechanism.Teacher

	// 隐式类 : 类型 1 => 类型 2
	implicit class Person(user:Teacher) {
		def say(): Unit = {
			println("say...")
		}
	}
}
