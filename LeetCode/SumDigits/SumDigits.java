public class SumDigits {

	/*
	 * Sum Digits of a number
	 * Example 38 = 3 + 8 = 11
	 * 57 = 5 + 7 = 12
	 */
	public int addDigits(int number){
		
		//Logic we need to isolate each digit and sum it individually
		int sum = 0; 
		while(number > 0){
			//trick is to use % (mod) example 47 mod 10 = 7 (returns remainder)
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
	
	public int addDigits2(int number){
		//Logic we need to isolate each digit and sum it individually
		while(number >= 10){
			int sum = 0; 
			while(number > 0){
			//trick is to use % (mod) example 47 mod 10 = 7 (returns remainder)
				sum += number % 10;
				number /= 10;
			}
			//update number = sum making number smaller each time we exit inner loop
			number = sum;
		}
		//return number instead
		return number;
	}
		
	public static void main(String [] args){
		
		SumDigits tester = new SumDigits();
		System.out.println(tester.addDigits(57)); //pass
		System.out.println(tester.addDigits(38)); //pass
		
		//Lets do a variation
		/*
		 * Let's say we wanted to get the sum but return it when it's less than 10. When the sum of the digits is < 10
		 * return so if it's 12 or 11 we have to loop again and get 12 = 1 + 2 == 3 so return 3. 11 = 1 + 1 = 2
		 */
		// examples 57 would return 3
		// 38 would return 2
		System.out.println(tester.addDigits2(57)); //pass
		System.out.println(tester.addDigits2(38)); //pass 
	}
}
