class Hpnotes {

  public static boolean isPrime(int n) {
	
	for ( int index = 2; index < n; index ++ ) {
		if ( n % index  == 0 )
			 return false;
	}

	return true;
  }
  public static void main( String args[] ) {
    for ( int index = 2; index <= 10; index ++ )
	if ( isPrime(index) ) {
		System.out.println(index + " " );
	}else {
		int temp=index;
		System.out.print(index+"=");
		while(temp!=1) {
			for(int k=2;k<index;k++) {
				if(temp%k==0) {
					temp=temp/k;
					if(temp==1) {
						System.out.print(k);
						System.out.println();
						break;
					}
					System.out.print(k+"+");
					break;
				}else {
					continue;
				}
			}
		}
	}
  }
}