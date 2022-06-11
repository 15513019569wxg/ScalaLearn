package 特质

/*
    @author wxg
    @date 2021/7/25-16:57
    */
object TraitStacking {
	/*
	由于一个类可以混入（ mixin）多个 trait，且 trait 中可以有具体的属性和方法，若混入的特质中具有相同的方法（方法名，参数列表，返回值均相同），必然会出现继承冲突问题。
	冲突分为以下两种：
		第一种，一个类（ Sub）混入的两个 trait（ TraitA， TraitB）中具有相同的具体方法，且两个 trait 之间没有任何关系
				解决这类冲突问题，直接在类（ Sub）中重写冲突方法。
	    第二种，一个类（ Sub）混入的两个 trait（ TraitA， TraitB）中具有相同的具体方法，且trait 继承自相同的 trait（ TraitC），及所谓的“钻石问题”
	    解决这类冲突问题， Scala 采用了特质叠加的策略。

	当一个类混入多个特质的时候， scala 会对所有的特质及其父特质按照一定的顺序进行 排序，而此案例中的 super.describe()调用的实际上是排好序后的下一个特质中的 describe()
	方法。
	排序规则如下：
		MyBall ----->  Color  ---->  Category	------>	Ball
		class MyBall extends Category with Color
	第一步：列出混入的第一个特质（ Category）的继承关系，作为临时叠加顺序Category Ball
	第二步：列出混入的第二个特质（ Color）的继承关系，并将该顺序叠加到临时顺序前边， 已经出现的特质不再重复Color Ball
	第三步：将子类（ MyBall）放在临时叠加顺序的第一个，得到最终的叠加顺序MyClass

	结论：
		（ 1）案例中的 super，不是表示其父特质对象，而是表示上述叠加顺序中的下一个特质，
			即， MyClass 中的 super 指代 Color， Color 中的 super 指代 Category， Category 中的 super指代 Ball。
		（ 2）如果想要调用某个指定的混入特质中的方法，可以增加约束： super[]，例如super[Category].describe()。

	特质和抽象类的区别
		1.优先使用特质。一个类扩展多个特质是很方便的，但却只能扩展一个抽象类。
		2.如果你需要构造函数参数，使用抽象类。因为抽象类可以定义带参数的构造函数，而特质不行（ 有无参构造） 。
	 */
	def main(args: Array[String]): Unit = {
		println(new MyBall().describe())
	}
}


trait Ball {
	def describe(): String = {
		"ball"
	}
}
trait Color extends Ball {
	override def describe(): String = {"blue-" + super.describe()}
}
trait Category extends Ball {
	override def describe(): String = {"foot-" + super.describe()}
}
class MyBall extends Category with Color {
	override def describe(): String = {
		"my ball is a " + super.describe()
//		"my ball is a " + super[Category].describe()

	}
}