package week2.Java;

public class Calculator {
	public int add(int a,int b)
	{
		return a+b;
	}
public double add(double d,double e, double f)
{
	return d+e+f;
}
public double sub(double d, double e)
{
	return d-e;
	}
public double sub(double d, double e,double f)
{
	return d-e-f;
	
	}
public double mul(double d, double e) {
	return e*d;
	
}public double mul(double d, double e,double f) {
	return e*d*f;}
	public double div(double d, double e) {
		return d/e;
	}
	
public int div(int d, int e) {
		return d/e;
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Calculator calc=new Calculator();
	System.out.println(+calc.add(4,50));
	System.out.println(+calc.add(4.5,6.7, 8.3));
	System.out.println(+calc.mul(4.5,6.7));
	System.out.println(+calc.mul(4.5,6.7,1.0));
	System.out.println(+calc.sub(4.5,6.7));
	System.out.println(+calc.sub(4.5,6.7,1.0));
	System.out.println(+calc.div(4.0,2.0));
	System.out.println(+calc.div(66,3));
}

}
