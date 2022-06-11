/*
    @author wxg
    @date 2021/7/29-1:27
    */
object ContravarianceAndCovariance {
	/*
	1）语法
		class MyList[+T]{ //协变}
		class MyList[-T]{ //逆变}
		class MyList[T] //不变
	2）说明
		协变： Son 是 Father 的子类，则 MyList[Son] 也作为 MyList[Father]的“子类” 。
		逆变： Son 是 Father 的子类，则 MyList[Son]作为 MyList[Father]的“父类” 。
		不变： Son 是 Father 的子类，则 MyList[Father]与 MyList[Son]“无父子关系” 。
	 */
	//泛型模板
//	class MyList<T>{}
	//不变
//	class MyList[T]{}
	//协变
	class MyList[+T]{}
	//逆变
//	class MyList[-T]{}

	class Parent{}
	class Child extends Parent{}
	class SubChild extends Child{}

	def main(args: Array[String]): Unit = {
		var s : MyList[Child] = new MyList[SubChild]
		println(s.getClass)
	}

}
