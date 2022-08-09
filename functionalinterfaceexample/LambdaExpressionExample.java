package com.hexaware.java8examples.functionalinterfaceexample;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// Lambda Expression
		Addition ad = () -> System.out.println("add method implemented using Lambda Expression");
		ad.add();
		
		Addition adNew = () -> {
			int res = 4 + 4;
			System.out.println("addition = "+res);
		};
		adNew.add();
		
		Substraction subCode = (x,y) ->{
			int subRes=0;
			if(x > y) {
				subRes= x -y;
			}else {
				subRes = y -x;
			}
			System.out.println("Substraction = "+subRes);
		};
		subCode.sub(10, 4);

		Division divCode = (x,y) -> {
			if(x > y) {
				return x/y;
			}else {
				return y/x;
			}
		};
		
		float divResult = divCode.div(15, 3);
		System.out.println("Division = "+divResult);
		
		Multiplication Multi =(x,y) ->{
			int z = x*y;
			return z;
		};
		int result = Multi.mul(4,6);
		System.out.println("Multiplication =" +  result);
}
}
