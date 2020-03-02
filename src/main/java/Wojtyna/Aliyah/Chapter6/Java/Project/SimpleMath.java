package Wojtyna.Aliyah.Chapter6.Java.Project;

public class SimpleMath {
	public double Divide(double num, double den){
		
		double Result = num/den;
		
		if(den == 0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		
		return Result;
			
		
	}
	
	public double Multiply(double num1, double num2) {
		double ResultM = num1*num2;
		return ResultM;
	}
}
