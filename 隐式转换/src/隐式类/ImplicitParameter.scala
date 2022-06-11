package 隐式类

/*
    @author wxg
    @date 2021/7/29-0:59
    */
object ImplicitParameter {
	implicit val str: String = "hello world!"

	def hello(implicit arg: String="good bey world!"): Unit = {
		println(arg)
	}
	//	普通方法或者函数中的参数可以通过 implicit 关键字声明为隐式参数，调用该方法时，就可以传入该参数，编译器会在相应的作用域寻找符合条件的隐式值。
	def main(args: Array[String]): Unit = {
		/*
		（ 1）同一个作用域中，相同类型的隐式值只能有一个
		（ 2）编译器按照隐式参数的类型去寻找对应类型的隐式值，与隐式值的名称无关。
		（ 3）隐式参数优先于默认参数
		 */
		hello
	}

	def helloImplicit(): Unit ={
		println(implicitly[String])
	}
	helloImplicit()

}
