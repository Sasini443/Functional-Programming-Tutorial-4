def interestRate(x:Double): Double= x match{
    case x if x<0 => 0
    case x if x>20000 => .02
    case x if x>200000 => .04
    case x if x>2000000 => .035
    case x if x>20000000 => .065
}
def interest(a:Double): Double = a*interestRate(a)

def main(args: Array[String]) ={
    
    println("The inerest is " + interest(30000));
    println("The interest is " + interest(300000));
    println("The interest is "+ interest(3000000));
    println("The interest is "+ interest(30000000));
   
}