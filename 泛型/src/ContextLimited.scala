/*
    @author wxg
    @date 2021/7/29-1:47
    */
object ContextLimited {
	/*
	1）语法
	def f[A : B](a: A) = println(a) //等同于 def f[A](a:A)(implicit arg:B[A])=println(a)
	 */
	def main(args: Array[String]): Unit = {
		/*
		上下文限定是将泛型和隐式转换的结合产物，以下两者功能相同.
		使用上下文限定[A :Ordering]之后，方法内无法使用隐式参数名调用隐式参数，需要通过 implicitly[Ordering[A]]
		获取隐式变量，如果此时无法查找到对应类型的隐式变量，会发生出错误。
		implicit val x = 1
		val y = implicitly[Int]
		val z = implicitly[Double]
		 */
		def f[A: Ordering](a: A, b: A): Int = implicitly[Ordering[A]].compare(a, b)

		def f[A](a: A, b: A)(implicit ord: Ordering[A]): Int = ord.compare(a, b)
	}

}
