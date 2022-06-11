package set

/*
    @author wxg
    @date 2021/7/26-9:26
    */
object MutableCollection {
	def main(args: Array[String]): Unit = {
		import scala.collection.mutable
		//（ 1）创建可变集合
		val set: mutable.Set[Int] = mutable.Set(1,2,3,4,5,6)
		//（ 3）集合添加元素
		set += 8
		val set1: mutable.Set[Int] = set + 9 	//必须重新进行赋值才可以
		println(set1)
		//（ 4）向集合中添加元素，返回一个新的 Set
		val ints: mutable.Set[Int] = set.+(9)
		println(ints)
		println("set2=" + set)
		println("----" * 10)
		//	使用add()添加元素
		set.add(10)
		val bool: Boolean = set.add(20)
		println(bool)
		println(set)
		//（ 5）删除数据
		set-=(5)
		set.remove(10)
		val bool1: Boolean = set.remove(20)
		println(bool1)
		println("==" * 20)
		//（6）合并元素
		val set2:mutable.Set[Int] = mutable.Set(10, 20, 30 ,40)
		val set3: mutable.Set[Int] = set ++ set2
		//	set和set2均不变
		println(set)
		println(set2)
		println(set3)
		set ++= set2	//	谁调用，谁合并
		println(set)
		// （ 2）打印集合
		set.foreach(println)
		println(set.mkString(","))
	}

}
