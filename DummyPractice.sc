object DummyPractice {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val s="simon"                                   //> s  : String = simon
  s.length                                        //> res0: Int = 5
  s.foreach(println)                              //> s
                                                  //| i
                                                  //| m
                                                  //| o
                                                  //| n
   for (e<-"joshua")
   println(e)                                     //> j
                                                  //| o
                                                  //| s
                                                  //| h
                                                  //| u
                                                  //| a
  
 "Johan".drop(2).take(2)                          //> res1: String = ha
 
 case class Student(name: String, score: Int)
 val hannah = Student("Hannah", 95)               //> hannah  : DummyPractice.Student = Student(Hannah,95)
 println(s"${hannah.name} has a score of ${hannah.score}")
                                                  //> Hannah has a score of 95
 
 
 
 val upper = "hello, world".map(_.toUpper)        //> upper  : String = HELLO, WORLD
 val numPattern = "[0-9]+".r                      //> numPattern  : scala.util.matching.Regex = [0-9]+
 val address = "123 Main Street Suite 101"        //> address  : String = 123 Main Street Suite 101
 val match1 = numPattern.findFirstIn(address)     //> match1  : Option[String] = Some(123)
 val matches = numPattern.findAllIn(address).toArray
                                                  //> matches  : Array[String] = Array(123, 101)
 
}