package 匹配对象与样例类

/*
    @author wxg
    @date 2021/7/28-23:44
    */
object MatchObject {
	def main(args: Array[String]): Unit = {
		//val user = User("zhangsan",11)，该语句在执行时，实际调用的是 User 伴生对象中的 apply 方法，因此不用 new 关键字就能构造出相应的对象。
		val user: User = User("zhangsan", 11)
		val result: String = user match {
			//当将User("zhangsan", 11)写在case后时,会默认调用unapply方法(对象提取器)
			// user作为unapply方法的参数，unapply方法将user对象的name和age属性提取出来，与User("zhangsan", 11)中的属性值进行匹配
			case User("zhangsan", 11) => "yes"
			case _ => "no"
		}
		println(result)

		val person: Person = Person("zhangsan", 11)
		val per = person match {
			case Person("zhangsan", 11) => "yes"
			case _ => "no"
		}
		println(per)

	}
}

class User(val name: String, val age: Int){}

object User{
	def apply(name: String, age: Int): User = new User(name, age)

	//case中对象的unapply方法(提取器)返回Some，且所有属性均一致，才算匹配成功,属性不一致，或返回 None，则匹配失败
	/*
	若只提取对象的一个属性，则提取器为 unapply(obj:Obj):Option[T]
	若提取对象的多个属性，则提取器为 unapply(obj:Obj):Option[(T1,T2,T3…)]
	若提取对象的可变个属性，则提取器为 unapplySeq(obj:Obj):Option[Seq[T]]
	 */
	def unapply(user: User): Option[(String, Int)] = {
		if (user == null) None
		else Some(user.name, user.age)
	}

	//样例类
	/*
	○1 样例类仍然是类，和普通类相比，只是其自动生成了伴生对象，并且伴生对象中自动提供了一些常用的方法，如apply、unapply、toString、equals、hashCode和copy。
	○2 样例类是为模式匹配而优化的类，因为其默认提供了unapply 方法，因此，样例类可以直接使用模式匹配，而无需自己实现unapply方法。
	○3 构造器中的每一个参数都成为val，除非它被显式地声明为var（不建议这样做）
	 */
}

case class Person(name: String, age: Int)
