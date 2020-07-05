/** Print all primes up to and including LIMIT, 10 to
* a line. */
private static void printPrimes(int limit){
	int up;
	np = 0;
	for(int p =2; p <= limit; p +=1){
	    if(isPrime((p)){
	       System.out.print(p + " ");
	       np += 1;
	       if (np % 10 == 0)
	           System.out.println();
	    }
	}
	if (np % 10 != 0)
	    System.out.println();
}