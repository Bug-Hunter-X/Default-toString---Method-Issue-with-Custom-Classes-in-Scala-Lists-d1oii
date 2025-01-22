```scala
class MyClass(val x: Int) {
  def this() = this(0) 
}

object Main extends App {
  val myInstance = new MyClass()
  println(myInstance.x) // this prints 0 as expected

  val myInstance2 = new MyClass(5)
  println(myInstance2.x) // this prints 5 as expected

  //Here is the problematic part
  val list = List(new MyClass(),new MyClass(1))

  list.foreach(println)
  // this will print MyClass@.....
  // because the default toString method is used, not the expected output of x
}
```