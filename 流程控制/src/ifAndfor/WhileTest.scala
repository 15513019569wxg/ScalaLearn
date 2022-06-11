package ifAndfor

/*
    @author wxg
    @date 2021/7/2-8:14
 */

object WhileTest {

  /**
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    import scala.util.control.Breaks
    import scala.util.control.Breaks.breakable
    /*
      （ 3）与 for 语句不同， while 语句没有返回值，即整个 while 语句的结果是 Unit 类型()
      （ 4） 因为 while 中没有返回值，所以当要用该语句来计算并返回结果时，就不可避免
      地使用变量，而变量需要声明在 while 循环的外部，那么就等同于循环的内部对外部的变量
      造成了影响，所以不推荐使用，而是推荐使用 for 循环。
     */
    var i = 0
    while (i < 10) {
      println("宋宋，喜欢海狗人参丸" + i)
      i += 1
    }

    var j = 0
    do {
      println("宋宋，喜欢海狗人参丸" + i)
      j += 1
    } while (j < 10)
    /*
    1）基本说明
    Scala 内置控制结构特地去掉了 break 和 continue， 是为了更好的适应函数式编程， 推
    荐使用函数式的风格解决break和continue的功能，而不是一个关键字。 Scala中使用breakable
    控制结构来实现 break 和 continue 功能。
     */
    // 需求 1： 采用异常的方式退出循环
    try {
      for (elem <- 1 to 10) {
        println(elem)
        if (elem == 5) throw new RuntimeException
      }
    } catch {
      case e =>
    }
    println("正常结束循环")

    //  需求 2： 采用 Scala 自带的函数，退出循环
    Breaks.breakable(for (elem <- 1 to 10) {
      println(elem)
      if (elem == 5) Breaks.break()
    })
    println("正常结束循环")

    //需求 3： 对 break 进行省略
    breakable {
      for (elem <- 1 to 10) {
        import scala.util.control.Breaks.break
        println(elem)
        if (elem == 5) break
      }
    }
    println("正常结束循环")

  }

}
