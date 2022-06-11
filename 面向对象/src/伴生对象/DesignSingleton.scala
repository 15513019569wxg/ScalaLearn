package 伴生对象

/*
    @author wxg
    @date 2021/7/25-11:55
    */
object DesignSingleton {
	def main(args: Array[String]): Unit = {
		val design1: Design = Design.getInstance()
		design1.printInfo()

		val design2: Design = Design.getInstance()
		design2.printInfo()

		println(design1 == design2) //true
	}

}


//	饿汉式
//object Design{
//	private val design: Design = new Design()
//	def getInstance(): Design = design
//}

//	懒汉式
object Design {
	private var design: Design = _

	def getInstance(): Design = {
		if (design == null) {
			design = new Design()
		}
		design
	}
}

class Design private {
	var name: String = "bobo"

	def printInfo(): Unit = {
		println(s"${Person.country}, ${Person.country}")
	}
}

