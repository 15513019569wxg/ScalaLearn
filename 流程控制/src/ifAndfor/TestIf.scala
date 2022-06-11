package ifAndfor

/*
    @author wxg
    @date 2021/7/24-9:37
    */
object TestIf {
	def main(args: Array[String]): Unit = {
		import scala.io.StdIn
		//（ 1）需求 1： 需求：输入年龄，如果年龄小于 18 岁，则输出“童年”。如果年龄大于等于 18 且小于等于 30， 则输出“中年”，否则，输出“老年”。
		println("input age")
		val age1: Int = StdIn.readInt()
		if (age1 < 18){
			println("童年")
		}else if(age1>=18 && age1<30){
			println("中年")
		}else{
			println("老年")
		}

		//	（2）需求 2： Scala 中 if else 表达式其实是有返回值的，具体返回值取决于满足条件的代码体的最后一行内容。
		println("input age")
		val age2: Int = StdIn.readInt()
		val res :String = if (age2 < 18){
			"童年"
		}else if(age2>=18 && age2<30){
			"中年"
		}else{
			"老年"
		}
		println(res)

		//（3）需求 3： Scala 中返回值类型不一致，取它们共同的祖先类型。
		val age3: Int = StdIn.readInt()
		val res1 :Any = if (age3 < 18){
			"童年"
		}else if(age3>=18 && age3<30){
			print("中年")
			age3
		}else{
			"老年"
		}
		println(res1)

		//（4）需求 4： Java 中的三元运算符可以用 if else 实现如果大括号{}内的逻辑代码只有一行，大括号可以省略。 如果省略大括号， if 只对最近
		//的一行逻辑代码起作用。
		// Java
		// int result = flag?1:0
		// Scala
		println("input age")
		val age4: Int = StdIn.readInt()
		val res2:Any = if (age4 < 18) "童年" else "成年"
		"不起作用"
		println(res2)
	}

}
