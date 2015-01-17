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
  
 "Johan".drop(2).take(2).capitalize               //> res1: String = Ha
 
 case class Student(name: String, score: Int)
 val hannah = Student("Hannah", 95)               //> hannah  : DummyPractice.Student = Student(Hannah,95)
 println(s"${hannah.name} has a score of ${hannah.score}")
                                                  //> Hannah has a score of 95
}