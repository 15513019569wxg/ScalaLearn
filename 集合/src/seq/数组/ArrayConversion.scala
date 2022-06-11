package seq.数组

/*
    @author wxg
    @date 2021/7/25-21:43
    */
object ArrayConversion {
	/*
	说明
		arr1.toBuffer //不可变数组转可变数组
		arr2.toArray //可变数组转不可变数组
		（ 1） arr2.toArray 返回结果才是一个不可变数组， arr2 本身没有变化
		（ 2） arr1.toBuffer 返回结果才是一个可变数组， arr1 本身没有变化
	 */
	def main(args: Array[String]): Unit = {
		import scala.collection.mutable
		import scala.collection.mutable.ArrayBuffer
		//（ 1）创建一个空的可变数组
		val arr2: ArrayBuffer[Int] = ArrayBuffer[Int]()
		//（ 2）追加值
		arr2.append(1, 2, 3)
		println(arr2) // 1,2,3

		//（ 3） ArrayBuffer ==> Array
		//（ 3.1） arr2.toArray 返回的结果是一个新的定长数组集合
		//（ 3.2） arr2 它没有变化
		val newArr: Array[Int] = arr2.toArray
		println(newArr.mkString(",") + "\n")

		//（ 4） Array ===> ArrayBuffer
		//（ 4.1） newArr.toBuffer 返回一个变长数组 newArr2
		//（ 4.2） newArr 没有任何变化，依然是定长数组
		val newArr2: mutable.Buffer[Int] = newArr.toBuffer
		newArr2.append(123)
		println(newArr2)
	}

}
