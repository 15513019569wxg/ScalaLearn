package 特质

/*
    @author wxg
    @date 2021/7/25-17:27
    */
object MyApp extends APP with Dao {
	/*
	自身类型可实现依赖注入的功能。
		可以注入特质或者类
	 */
	def main(args: Array[String]): Unit = {
		login(new User("bobo", 11))
	}

}

class User(val name: String, val age: Int)
trait Dao {
	def insert(user: User) = {
		println("insert into database :" + user.name)
	}
}
trait APP {
	_: Dao =>
	def login(user: User): Unit = {
		println("login :" + user.name)
		insert(user)
	}
}