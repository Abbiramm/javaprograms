
public class Memory {
	

	 int i; 
	    String s;
	    Memory(){
	    	i=90;
	    	s="Hello";
	    }
	    
		public static void main(String[] args) {
			
	          System.out.println("Main method");
	          Memory ob=new Memory();
	          System.out.println("ob="+ob);
	          System.out.println(ob.i);
	          System.out.println(ob.s);
	        ob=null;
	          System.gc();
	          System.out.println("ob="+ob);
	         // System.out.println(ob.i);
	         // System.out.println(ob.s);
	          
		}
		@Override
		public void finalize() {
			
				System.out.println("finalize method is called when object becomes null");
				
			}


}
