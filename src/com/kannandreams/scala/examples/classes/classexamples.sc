import scala.beans.BeanProperty

class Duck

class Person(@BeanProperty val name:String,@BeanProperty var nickname:String){
  println("Inside the Constructor" + this )
  val color:String = if(name == "Kannan") "Black" else "Blue"
}

val p = new Person("Kannan","KK")
println("Colored :" + p.color)
println("Name: " + p.name)
println("Invoke Name as method : " + p.getName)
println("Invoke Name as method : " + p.getNickname)
println("Invoke Name as method : " + p.setNickname("KannanDreams"))
println("Invoke Name as method : " + p.getNickname)
