package 隐式函数和类

/*
    @author wxg
    @date 2021/7/29-0:44
    */
object ImplicitClass {
	/*
		在 Scala2.10 后提供了隐式类，可以使用 implicit 声明类，隐式类的非常强大，同样可以扩展类的功能，在集合中隐式类会发挥重要的作用。
		（ 1）其所带的构造参数有且只能有一个
		（ 2）隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是顶级的。
	 */
	implicit class MyRichInt(arg: Int) {
		def myMax(i: Int): Int = {
			if (arg < i) i else arg
		}
		def myMin(i: Int): Int = {
			if (arg < i) arg else i
		}
	}
	def main(args: Array[String]): Unit = {
		println(1 myMax 3)
	}

}
