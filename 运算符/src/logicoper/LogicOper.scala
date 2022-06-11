package logicoper

/*
    @author wxg
    @date 2021/7/24-1:18
    */
object LogicOper {
	def main(args: Array[String]): Unit = {
		// 测试： &&、 ||、 !
		var a = true
		var b = false
		println("a&&b=" + (a && b)) // a&&b=false
		println("a||b=" + (a || b)) // a||b=true
		println("!(a&&b)=" + (!(a && b))) // !(a&&b)=true
		println(isNotEmpty(null))

	}
	//扩展避免逻辑与空指针异常
	def isNotEmpty(s: String ) : Boolean = {
	//如果按位与， s 为空，会发生空指针
		if (s != null && !"".equals(s.trim())) return true else return false
	}



}
