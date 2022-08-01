def CheckTheValue(number: Int) : String = number match{
    case x if x<=0 => "Negative/Zero"
    case x if x%2 == 0 => "even number"
    case x if x%2!= 0 => "odd number"
}
def main(args: Array[String]) ={
    
    print("Enter the number:");
    val number = scala.io.StdIn.readInt();
    val answer = CheckTheValue(number);
    printf("Number is %s",answer);
}