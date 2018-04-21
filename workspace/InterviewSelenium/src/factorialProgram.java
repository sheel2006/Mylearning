public class factorialProgram{
	
	public static void main(String args[]){
		System.out.println("Factorial of 5");
		System.out.println(factorial(5));
	}	
		static int factorial(int num){
			{
		   int result;
		   if(num==1) return 1;
		   result=factorial(num-1)*num;
		   return result;
		   //This is recursion example where method call it self
			}
		}
	}

