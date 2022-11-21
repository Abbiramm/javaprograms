package addd;

public class primenumberusingtwoloops {
	public static void main(String[] args) {
 int c=0;
		for(int num=1;num<=100;num++) { //1 2 3 4 5 6 7 8 9 10 11..........100
			c=0;
			for(int j=1;j<=num;j++) {
				if(num%j==0) {
					c=c+1;
				}
			}
			if(c==2) {
				System.out.print(num+" ");
			}
		}

	}

}



