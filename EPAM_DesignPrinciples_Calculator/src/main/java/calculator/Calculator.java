package calculator;

public class Calculator 
{
	double result=0;
	void addition(double input1,double input2)
	{
		result = input1+input2;
	}
	void subtraction(double input1,double input2)
	{
		result = input1-input2;
	}
	void multiplication(double input1,double input2)
	{
		result = input1*input2;
	}
	void division(double input1,double input2)
	{
		result = input1/input2;
	}
	double displayResult()
	{
		return result;
	}

}
