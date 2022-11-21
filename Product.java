package addd;


class prd
{
	int id;
	String name;
	float price;
	
	prd(){
		id=34;
		name="ABC";
		price=4567f;	
	}
	prd(int i,String n,float p)
	{	
		id=i;
		name=n;
		price=p;	
	}
	
	void display()
	{
		
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("PRICE:"+price);
		
	}	
}

public class Product {

	public static void main(String[] args) {
		prd o=new prd();
		System.out.println("pid:"+o.id);
		System.out.println("pname:"+o.name);
		System.out.println("prrice:"+o.price);
		
		prd o1=new prd(2,"sdf",5.67f);
		o.display();
		o1.display();
       		

	}

}
