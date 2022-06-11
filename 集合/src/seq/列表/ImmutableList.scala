package seq.列表

/*
    @author wxg
    @date 2021/7/26-8:32
    */
object ImmutableList {
	def main(args: Array[String]): Unit = {
		import scala.collection.immutable.Nil.:::
		//（ 1） List 默认为不可变集合
		//（ 2）创建一个 List（数据有顺序，可重复）
		val list: List[Int] = List(1,2,3,4,3)
		//（ 7）空集合 Nil
		val list5: List[Int] = 1::2::3::4::Nil
		//（ 4） List 增加数据
		//（ 4.1） ::的运算规则从右向左
		//val list1 = 5::list
		val list1: List[Int] = 7::6::5::list
		//（ 4.2）添加到第一个元素位置
		val list2: List[Int] = list.+:(5)
		//（ 5）集合间合并：将一个整体拆成一个一个的个体，称为扁平化
		val list3 = List(8,9)
		val list4: List[Any] = list3::list1
		val list44: List[Int] = list3:::list1
		//（ 6）取指定数据
		println(list.head)
		println(list(1))
		//（ 3）遍历 List
		//list.foreach(println)
		//list1.foreach(println)
		//list3.foreach(println)
		//list4.foreach(println)
		list5.foreach(println)
	}

}
