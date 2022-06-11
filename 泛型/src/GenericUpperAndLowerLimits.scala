/*
    @author wxg
    @date 2021/7/29-1:54
    */
object GenericUpperAndLowerLimits {
	/*
	1）语法
		Class PersonList[T <: Person]{ //泛型上限}
		Class PersonList[T >: Person]{ //泛型下限}
	2）说明
		泛型的上下限的作用是对传入的泛型进行限定。
	 */
	def main(args: Array[String]): Unit = {
//		test(classOf[SubChild])
//		test[Child](new SubChild)
	}


	//泛型通配符之上限
	//def test[A <: Child](a:Class[A]): Unit ={
	// println(a)
	//}
	//泛型通配符之下限
	//def test[A >: Child](a:Class[A]): Unit ={
	// println(a)
	//}
	//泛型通配符之下限 形式扩展
//	def test[A >: Child](a:A): Unit ={
//		println(a.getClass.getName)
//	}

}
