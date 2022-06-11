package 匹配类型

/*
    @author wxg
    @date 2021/7/28-23:10
    */
object MatchType {
	/*
		需要进行类型判断时，可以使用前文所学的 isInstanceOf[T]和 asInstanceOf[T]，也可使用模式匹配实现同样的功能。
	 */
	def main(args: Array[String]): Unit = {
		println(describe(5))
		println(describe(List("hello", "scala")))
		//泛型擦除
		println(describe(List(1, 2, 3, 4, 5)))
		//数组例外，可保留泛型
		println(describe(Array(1, 2, 3, 4, 5, 6)))
		println(describe(Array("abc")))
	}

	def describe(x: Any): String = x match {
		case i: Int => "Int"
		case s: String => "String hello"
		case m: List[_] => "List"
		case c: Array[Int] => "Array[Int]"
		case someThing => "something else " + someThing
	}
}
