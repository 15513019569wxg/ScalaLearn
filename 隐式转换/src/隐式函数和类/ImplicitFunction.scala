package 隐式函数和类

/*
    @author wxg
    @date 2021/7/29-0:31
    */
object ImplicitFunction {
	//隐式函数
	implicit def convert(arg: Int): MyRichInt = new MyRichInt(arg)
	/*
	（ 1）首先会在当前代码作用域下查找隐式实体（隐式方法、隐式类、隐式对象）。（一般是这种情况）
	（ 2）如果第一条规则查找隐式实体失败，会继续在隐式参数的类型的作用域里查找。
		  类型的作用域是指与该类型相关联的全部伴生对象以及该类型所在包的包对象。
	 */
	def main(args: Array[String]): Unit = {
		// 当想调用对象功能时，如果编译错误，那么编译器会尝试在当前作用域范围内查找能调用对应功能的转换规则
		// 这个调用过程是由编译器完成的，所以称之为隐式转换。也称之为自动转换
		println(2.myMax(6))
	}
}


class MyRichInt(val self: Int) {
	def myMax(i: Int): Int = if (self < i) i else self
	def myMin(i: Int): Int = if (self < i) self else i
}