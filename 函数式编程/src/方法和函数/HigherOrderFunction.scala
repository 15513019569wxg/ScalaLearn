package 方法和函数

/*
    @author wxg
    @date 2021/7/2-13:22
 */
object HigherOrderFunction {
  // 1）函数可以作为值进行传递
  def main(args: Array[String]): Unit = {
    import scala.math.Numeric.BigDecimalAsIfIntegral.mkNumericOps
    def foo(): Int = {
      println("foo...")
      1
    }

    //（ 1）调用 foo 函数，把返回值给变量 f
    //val i: Int = foo()
    val f = foo
    println(f)

    //（ 2）在被调用函数 foo 后面加上 _， 相当于把函数 foo 当成一个整体，传递给变量 f1
    val f1 = foo _
    foo()
    f1()
    //（ 3）如果明确变量类型，那么不使用下划线也可以将函数作为整体传递给变量
    var f2: () => Int = foo

    //2）函数可以作为参数进行传递
    //（ 1）定义一个函数，函数参数还是一个函数签名；f 表示函数名称;(Int,Int)表示输入两个 Int 参数； Int 表示函数返回值
    def t1(f: (Int, Int) => Int): Int = {
      f(2, 4)
    }

    // （ 2）定义一个函数，参数和返回值类型和 f1 的输入参数一致
    def add(a: Int, b: Int): Int = a + b

    // （ 3）将 add 函数作为参数传递给 f1 函数， 如果能够推断出来不是调用， _可以省略
    println(t1(add))
    println(t1((a, b) => a + b))
    println(t1(_ + _))

    //3）函数可以作为函数返回值返回
    def g1() = {
      def f2() = {
        println("该函数是外层函数的返回值")
      }
      f2 _
    }
    val g = g1()
    // 因为 g1 函数的返回值依然为函数，所以变量 g 可以作为函数继续调用
    g()
    // 上面的代码可以简化为
    g1()()
  }

}
