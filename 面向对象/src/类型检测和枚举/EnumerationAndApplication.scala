package 类型检测和枚举

/*
    @author wxg
    @date 2021/7/25-18:11
    */
object EnumerationAndApplication {
	/*
	1） 说明
		使用 type 关键字可以定义新的数据数据类型名称，本质上就是类型的一个别名
		枚举类： 需要继承 Enumeration
		应用类：需要继承 App
	 */
	def main(args: Array[String]): Unit = {
		println(Color.RED)
		type S = String
		var v:S = "abc"
		def test():S = "xyz"
	}

}

// 枚举类
object Color extends Enumeration {
	val RED = Value(1, "red")
	val YELLOW = Value(2, "yellow")
	val BLUE = Value(3, "blue")
}

// 应用类
object Test20 extends App {
	println("xxxxxxxxxxx");
}