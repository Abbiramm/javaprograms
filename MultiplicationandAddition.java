
interface Add11
{
	void add(int a,int b);
}
@FunctionalInterface
interface Mul
{
	int mul(int a,int b);
}
interface Sub
{
	int sub(int a,int b);
}
interface Str
{
	String ss(String s);
}



public class MultiplicationandAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add11 ao=(a,b)->{
             System.out.println("Sum is  "+(a+b));		

	};
	ao.add(5, 8);
	//Multiplication
	Mul mo=(a,b)->(a*b);
	System.out.println("Multiplication: "+mo.mul(7, 8));
	//Subtraction
	Sub so=(a,b)->(a-b);
	System.out.println("Subtraction: "+so.sub(8,4));
	//String
	Str sb=(s)->(s);
	System.out.println("String: "+sb.ss("asdf"));
	
	
	
	

}
}