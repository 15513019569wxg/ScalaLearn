package 方法和函数

/*
    @author wxg
    @date 2021/7/2-11:14
 */
object FuncDef {
  def main(args: Array[String]): Unit = {}
  /*
   有参、无参、多参; 有返回值、无返回值；
   */

  // 函数 1：无参，无返回值
  def test1(): Unit = {
    println("无参，无返回值")
  }
  test1()

  // 函数 2：无参，有返回值
  def test2(): String = {
    return "无参，有返回值"
  }
  println(test2())

  // 函数 3：有参，无返回值
  def test3(s: String): Unit = {
    println(s)
  }
  test3("jinlian")

  // 函数 4：有参，有返回值
  def test4(s: String): String = "%s有参，有返回值".format(s)
  println(test4("hello "))

  // 函数 5：多参，无返回值
  def test5(name: String, age: Int): Unit = {
    println(s"$name, $age")
  }
  test5("dalang", 40)
}
