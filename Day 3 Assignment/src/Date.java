
public class Date {
	int dd;
	int mm;
	int yy;
	
	public Date(int dd,int mm,int yy) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void displayDate() {
		System.out.println(this.dd+"-"+this.mm+"-"+this.yy);
	}
	
	public void checkDate() {
		if(this.mm==2) {
			if(this.yy%4==0) {
				if(this.dd<=29)
					System.out.println("Valid Date");
				else System.out.println("Not Valid Date");
			}
			else {
				if(this.dd<=28) 
					System.out.println("valid Date");
				else System.out.println("Not valid Date");
				
			}
		}
		else {
			if(this.dd<=31 && this.mm<=12) 
				System.out.println("valid Date");
			else System.out.println("Not valid Date");
			
		}
	}



}
