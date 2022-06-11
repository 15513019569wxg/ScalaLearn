package 匹配常量

/*
    @author wxg
    @date 2021/7/27-11:29
    */
object BasicGrammar {
	/*
	模式匹配语法中，采用 match 关键字声明，每个分支采用 case 关键字进行声明，当需要匹配时，会从第一个 case 分支开始，如果匹配成功，那么执行对应的逻辑代码，如果匹
	配不成功，继续执行下一个分支进行判断。如果所有 case 都不匹配，那么会执行 case _分支，类似于 Java 中 default 语句。
	 */
	def main(args: Array[String]): Unit = {
		println(describe(5))
		println(describe("hello"))
		println(describe(true))
	}

	//	这里= 后面的括号可以省略
	def describe(x: Any): String ={
		x match {
		case 5 => "Int five"
		case "hello" => "String hello"
		case true => "Boolean true"
		case '+' => "Char +"
		case _ => ""	// 也可以写作 case abc => "" abc 是为一个普通变量
		}

	}
}
