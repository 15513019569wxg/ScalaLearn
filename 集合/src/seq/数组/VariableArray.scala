package seq.数组

/*
    @author wxg
    @date 2021/7/25-20:32
    */
object VariableArray {
	/*
	1）定义变长数组
		val arr01 = ArrayBuffer[Any](3, 2, 5)
		（ 1） [Any]存放任意数据类型
		（ 2） (3, 2, 5)初始化好的三个元素
		（ 3） ArrayBuffer 需要引入 scala.collection.mutable.ArrayBuffer
	 */
	def main(args: Array[String]): Unit = {
		import scala.collection.mutable.ArrayBuffer
		/*
		（ 1） ArrayBuffer 是有序的集合
		（ 2）增加元素使用的是 append 方法()，支持可变参数
		 */

		//（ 1）创建并初始赋值可变数组
		val arr01: ArrayBuffer[Any] = ArrayBuffer[Any](1, 2, 3)
		//（ 2）遍历数组
		for (i <- arr01) {
			println(i)
		}
		println(arr01.length) // 3
		println("arr01.hash=" + arr01.hashCode())
		//（ 3）增加元素
		//（ 3.1）追加数据
		arr01.+=(4)
		val arro11: ArrayBuffer[Any] = arr01.+=(23)
		println(arro11 == arr01) //同一个引用对象
		//（ 3.2）向数组最后追加数据（包括元素或者数组）
		arr01.prepend(12)
		arr01.append(5, 6)
		arr01.appendAll(arro11)
		//（ 3.3）向指定的位置插入数据
		arr01.insert(0, 7, 8)
		arr01.insertAll(1, arro11)
		println("arr01.hash=" + arr01.hashCode())
		//（3.4） 利用 :+ 或者 +:, 必须定义一个新数组
		var arr02: ArrayBuffer[Any] = arr01 :+ 10
		println(arr02)
		77 +: arr02
		println(arr02)
		//（ 4）修改元素
		arr01(1) = 9 //修改第 2 个元素的值
		println("--------------------------")
		for (i <- arr01) {
			println(i)
		}
		println(arr01.length) // 5
		//	（5）删除元素
		arr01.remove(3)
		println(arr01)
		//	remove()第一个参数表示起始索引，第二个数表示删除元素的个数
		arr01.remove(0, 1)
		println(arr01)
		//	删除指定的元素
		arr01 -= 9
		println(arr01)
	}

}
