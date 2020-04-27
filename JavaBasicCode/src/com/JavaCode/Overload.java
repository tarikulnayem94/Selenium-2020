package com.JavaCode;

public class Overload {
	public static void main(String[] args)
	{
		anotherclass object=new anotherclass();
		System.out.println(object.maxvalue(50, 60, 55));
	}
}
class anotherclass
{
	int maxvalue(int a, int b)
	{
		int max;
		if(a>b)
		{
			max=a;
		}	
		else
		{
			max=b;
		}
		System.out.println("called max value with integer arguments");
		return max;
	}
	
		double maxvalue(double a, double b)
		{
			double max;
			if(a>b)
			{
				max=a;
			}	
			else
			{
				max=b;
			}
			System.out.println("called max value with double arguments");
			return max;
	}
		int maxvalue(int a, int b, int c)
		{
			int max;
			if(a>b)
			{
				max=a;
			}	
			else if (b>c)
			{
				max=b;
			}
			else
				max=c;
			System.out.println("called max value with triple arguments");
			return max;
		}	
}

