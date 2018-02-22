class euler02 {

  def fiboSum : Int ={

    def helper(a:Int,b:Int,c:Int):Int =  {
      if ((a + b < 4000000) && ((a + b) % 2 == 0))   helper(b, a+b,c+a+b)
      else if (a + b < 4000000)   helper(b,a+b,c)  //fixed infinite loop
      else c

    }
    helper(0,1,0)
  }

  //how to get sum, use a c


}
