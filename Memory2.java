public class Memory2{
int a;
int b;

  public void setData(int c,int d){
    a=c;
    b=d;
  }
  public void showData(){
    System.out.println("Value of a = "+a);
    System.out.println("Value of b = "+b);
  }
  public static void main(String args[]){
   Memory2 s1 = new  Memory2();
   Memory2 s2 = new  Memory2();
    s1.setData(1,2);
    s2.setData(3,4);
    s1.showData();
   
    Memory2 s3;
  s3=s2;
  s3.showData();
   // s3.showData();
  s2=null;
  //s2.showData();
  // s3.showData();
   System.gc();
   // s3=null;
    //s3.showData();
   
  
   }
  @Override
  public void finalize() {
	   System.out.println("Final is called");
  }
  }


