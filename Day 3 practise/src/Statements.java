
public class Statements {
	
	public String greaterNumber(int a, int b) {
		if (a>b)
			return a + " is greater Number";
		else
			return b + " is greater Number";
				
	}
	public int sumOfNumbers(int num) {
		int sum=0;
		while(num>0) {
		sum+=num;
		num--;
	}
	return sum;
	}
	
	public void continueMethod(int n) {
		for (int i = 0; i <= 10; ++i) {  
		      if (i!=n) {
		        continue;
		      }
		      System.out.println(n+ " has been found");
		}
	}
	public void isNumberBelow100(int n) {
		for (int i = 0; i < 100; ++i) {
			if (i == n) {
				System.out.println(n +" is below 100!");
                break;
            }      
        }   
		
    }
	public void doWhileMethod(int n) {
	
	        do {
	        	System.out.println(n);
	            n--;
	        }while (n > 0);
	    }
	
	public void switchCase(int n) {
		
		switch (n) {
		  case 1:
		    System.out.println("You chose option " + n);
		    break;
		  case 2:
		    System.out.println("You chose option " + n);
		    break;
		  case 3:
		    System.out.println("You chose option " + n);
		    break;
		  case 4:
		    System.out.println("You chose option " + n);
		    break;
		  case 5:
		    System.out.println("You chose option " + n);
		    break;
		  default:
			  System.out.println("You chose Invalid Option");
		}
	}



}
