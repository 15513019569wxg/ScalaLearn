
/*
    @author wxg
    @date 2021/7/6-20:50
    */

	/*
		1） 和 Java 一样，可以在顶部使用 import 导入， 在这个文件中的所有类都可以使用。
		2） 局部导入：什么时候使用，什么时候导入。 在其作用范围内都可以使用
		3） 通配符导入： import java.util._
		4） 给类起名： import java.util.{ArrayList=>JL}
		5） 导入相同包的多个类： import java.util.{HashSet, ArrayList}
		6）屏蔽类： import java.util.{ArrayList =>_,_}
		7） 导入包的绝对路径： new _root_.java.util.HashMap
	 */
package 包

object test{
			def main(args: Array[String]): Unit = {
				import com.atguigu.Inner
				println(Inner.in)
				a()
			}
			import com.atguigu.Inner
			def a(): Unit = {
				println(Inner.in)
			}
		}

	/*
	说明
		import com.atguigu.Fruit				引入 com.atguigu 包下 Fruit（ class 和 object）
		import com.atguigu._					引入 com.atguigu 下的所有成员
		import com.atguigu.Fruit._				引入 Fruit(object)的所有成员
		import com.atguigu.{Fruit,Vegetable} 	引入 com.atguigu 下的 Fruit 和 Vegetable
		import com.atguigu.{Fruit=>Shuiguo} 	引入 com.atguigu 包下的 Fruit 并更名为 Shuiguo
		import com.atguigu.{Fruit=>Shuiguo,_} 	引入 com.atguigu 包下的所有成员，并将 Fruit 更名为 Shuiguo
		import com.atguigu.{Fruit=>_,_} 		引入 com.atguigu 包下屏蔽 Fruit 类
		new _root_.java.util.HashMap 			引入的 Java 的绝对路径

		注意:
		Scala 中的三个默认导入分别是:
			import java.lang._
			import scala._
			import scala.Predef._
	 */
