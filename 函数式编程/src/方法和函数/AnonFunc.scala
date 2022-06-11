package 方法和函数

//noinspection DuplicatedCode
/*
    @author wxg
    @date 2021/7/2-14:14
 */
object AnonFunc {
	/*
	1） 说明
	没有名字的函数就是匿名函数。
	(x:Int)=>{函数体}
	x： 表示输入参数类型； Int：表示输入参数类型； 函数体： 表示具体代码逻辑
	传递匿名函数至简原则：
	（ 1）参数的类型可以省略，会根据形参进行自动的推导
	（ 2）类型省略之后，发现只有一个参数，则圆括号可以省略； 其他情况：没有参数和参
	数超过 1 的永远不能省略圆括号。
	（ 3）匿名函数如果只有一行， 则大括号也可以省略
	（ 4）如果参数只出现一次，则参数省略且后面参数可以用_代替
	（ 5）如果可以推断出当前传入的匿名函数的操作是一个函数体，则可以直接省略_
	 */
	def main(args: Array[String]): Unit = {
		// （ 1）定义一个函数：参数包含数据和逻辑函数
		def operation(arr: Array[Int], op: Int => Int): Array[Int] = {
			for (elem <- arr) yield op(elem)
		}
		// （ 2）定义逻辑函数
		def op(ele: Int): Int = ele + 1

		// （ 3）标准函数调用
		val arr: Array[Int] = operation(Array(1, 2, 3, 4), op)
		println(arr.mkString("Array(", ", ", ")"))
		println(arr.mkString(","))

		// （ 4）采用匿名函数
		val arr1: Array[Int] = operation(Array(1, 2, 3, 4), (ele: Int) => ele + 1)
		println(arr1.mkString(","))

		// （ 4.1）参数的类型可以省略，会根据形参进行自动的推导; // (4.3) 匿名函数如果只有一行，则大括号也可以省略
		val arr2: Array[Int] = operation(Array(1, 2, 3, 4), (ele: Int) => ele + 1)

		// （ 4.2）类型省略之后，发现只有一个参数，则圆括号可以省略；其他情况：没有参数和参数超过 1 的永远不能省略圆括号。
		val arr3: Array[Int] = operation(Array(1, 2, 3, 4), (ele: Int) => ele + 1)

		//（ 4.4）如果参数只出现一次，则参数省略且后面参数可以用_代替
		val arr4: Array[Int] = operation(Array(1, 2, 3, 4), (_: Int) + 1)

		//传递的函数有两个参数
		def calculator(a: Int, b: Int, op: (Int, Int) => Int): Int = {op(a, b)}
		// （ 1）标准版
		println(calculator(2, 3, (x: Int, y: Int) => {x + y}))
		// （ 2）如果只有一行，则大括号也可以省略
		println(calculator(2, 3, (x: Int, y: Int) => x + y))
		// （ 3）参数的类型可以省略，会根据形参进行自动的推导;
		println(calculator(2, 3, (x: Int, y: Int) => x + y))
		// （ 4）如果参数只出现一次，则参数省略且后面参数可以用_代替
		println(calculator(2, 3, (_: Int) + (_: Int)))



		val fun: String => Unit = (name: String) => { println(name)}
		def f(func: String => Unit): Unit = {
			func("hello")
		}
		//	调用
		f(fun)
		f((name: String) => {println(name)})
		f((name: String) => println(name))
		f(println(_: String))
		//（ 5）如果可以推断出当前传入的匿名函数的操作是一个函数体，则可以直接省略_
		f(println)
	}

}
