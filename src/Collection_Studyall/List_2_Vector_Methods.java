package Collection_Studyall;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class List_2_Vector_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String>v=new Vector<>();
		
		v.add("pune");
		v.add("mumbai");
		v.add(null);
		v.add(null);
		v.add("nagpur");
		v.add("nashik1");
		v.add("ahmednagar");
		System.out.println(v.capacity());
		
		System.out.println(v.set(2, "pune"));
		
		//methods using vector
		
		//1)contains method
		System.out.println(v.contains("pune"));
		System.out.println("===========================");
		
		//2)get method
		System.out.println(v.get(0));
		System.out.println("============================");
		
		//3)firstelement method
		System.out.println(v.firstElement());
		System.out.println("===============================");
		
		//4)first index method
		System.out.println(v.firstElement());
		System.out.println("=============================");
		
		//5)index  of method
		System.out.println(v.indexOf(v, 0));
		System.out.println("================================");
		
		//6)remove method
		
		System.out.println(v.remove(null));
		System.out.println("==============================");
		
		//7)clone method
		System.out.println(v.clone());
		System.out.println("=============================");
		
		//8)remove method
		System.out.println(v.remove(null));
		System.out.println("=============================");
		
		//9)equal method
		System.out.println(v.equals(null));
		System.out.println("==============================");
		
		//traversing using vector
		
		//1)for each loop
		for(String vect:v)
		{
			
			System.out.println(vect);
		}
		//2)iterator
		Iterator<String>it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//3)Enumeration only support in vector
		Enumeration<String> e1 = v.elements();
		while(e1.hasMoreElements())
		{
		System.out.println(e1.nextElement());	
		}

		
		
		
		
		
		
		
		
	}

}
