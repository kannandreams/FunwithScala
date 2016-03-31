class Rational(a:Int,b:Int){
  //Any code within class body will be part of Primary constructor
  //println("Created "+ a +"/"+ b)
  require(b != 0)
  val num:Int = a
  val dem:Int = b

  def this(a:Int) = this(a,1) // Auxiliary constructor

  override def toString = a + "/" + b

  def +(that:Rational):Rational =
  new Rational(
    num * that.dem + that.num * dem,
    dem * that.dem

  )

  def +(i:Int):Rational =
    new Rational(num * i,dem)



}


//val r = new Rational(10,2);
val r = new Rational(10,2)
val r1 = new Rational(10,2)
r + r1
//r.add(r1)

val ra1 = new Rational(5)
val ra2 = new Rational(10,2)
ra1 + ra2

ra1 + 2

// This will fail if we dont have implicit intToRational method
implicit def intToRational(x:Int) = new Rational(x)
2 + ra1




