package Collection_Studyall;

import java.util.HashSet;
import java.util.Iterator;

public class Set_1_Hashset_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Object>hs=new HashSet<>();
      hs.add(4);
      hs.add(3);
      hs.add(2);
      hs.add(5);
      hs.add(4);
      hs.add(3);
      hs.add(2);
      hs.add("gn");
      hs.add(3);
      hs.add(null);
       System.out.println(hs);
       System.out.println("==================================================");
       
       
       //1)for each loop
       
       for(Object h:hs)
       {
    	   System.out.println(h);
    	   System.out.println("===================================================");
       }
       
     
	Iterator<Object>it=hs.iterator();
	while(it.hasNext());
	{
		System.out.println(it.next());
	}

}
}
