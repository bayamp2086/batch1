package com.bayamp.archana.training.mathPrograms;

public   class PrimeNumber {
	static int temp;
	//static boolean isPrime = true;

	public  static  boolean primeCheck(int n) {
		for (int i = 2; i <=n / 2; i++) {
			temp = n % i;

			if (temp == 0) {
				return false;
			}
				//isPrime = false;
/*				break;

			}
		}
		if (isPrime) {
			System.out.println("The given number " + n + " is  prime number");

		} else {
			System.out.println("The given number " + n + " is not prime number");
		}
	}

*/
		}
		return true;		
	
			}
}