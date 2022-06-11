package 包

/*
    @author wxg
    @date 2021/7/6-20:35
    */
object test_package_var {
	def main(args: Array[String]): Unit = {
		//	直接访问包里面的方法
		shareMethod()
	}

}

package 包{
	object test_package_var_embed{
		def main(args: Array[String]): Unit = {
			shareMethod()
		}
	}
}