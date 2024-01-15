package Collection_Studyall;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class List_2_Vector_Traverssing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  

//Vector<String> v = new Vector<String>();
	
		Vector<String> v=new Vector<String>();
		v.add("MH");
		v.add("AP");
		v.add("TN");
		v.add("KA");
		v.add("PB");
		v.add("UP");
		v.add("DL");
		
		
		   System.out.println("===============TRAVERSING THROGH VECTOR=================");
		   //for loop , for each , while , do while , iterator, list iterator , neumaration
		    
		    
		   System.out.println(v);
		    
		    
		   System.out.println("======================FOR LOOP============================");
		  
		    for(int fr=0;fr<= v.size()-1;fr++)
		    {
		    	System.out.println(v.get(fr));
		     }
		    
		    
		   System.out.println("====================FOR EACH LOOP===========================");
		   for(String vect:v)
		   {
			   System.out.println(vect);
		   }
		   
		   
		   System.out.println("====================iterator===========================");
		   
		   Iterator<String> ite = v.iterator();
		
		   while(ite.hasNext())
		   {
			   System.out.println(ite.next());
		   }
		   
		   
		   System.out.println("==================== list iterator===========================");

		   ListIterator<String> wli = v.listIterator(); 
		   
		    
		   while(wli.hasNext())
		   {
			   System.out.println(wli.next());
		   }
		   
		   
		   System.out.println("====================enemuration===========================");
		   
		   Enumeration<String> wenu = v.elements();
		   
		   while(wenu.hasMoreElements())
		   {
			   System.out.println(wenu.nextElement());
		   }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
