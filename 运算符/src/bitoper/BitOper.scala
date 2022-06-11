package bitoper

/*
    @author wxg
    @date 2021/7/24-9:08
    */
object BitOper {
	def main(args: Array[String]): Unit = {
		var n1 :Int =8
		n1 = n1 << 1
		println(n1)

		var n2  = -10
		n2 = n2 >>> 3
		println(n2)
	}

}
