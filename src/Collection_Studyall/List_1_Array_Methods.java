package Collection_Studyall;

import java.util.ArrayList;

public class List_1_Array_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Object> a2=new ArrayList<>();
     //1)ADD METHOD
     a2.add("testing");
     System.out.println(a2.add("manual"));
     System.out.println("=================================");
     //2)ADD(INDEX,ELEMENTS)
     a2.add(0, "pune");
     System.out.println(a2);
     System.out.println("=================================");
       //3)CLEAR METHOD
      // a2.clear();
      // System.out.println(a2);
        // System.out.println("=================================");
     //4) CLONE METHOD
     a2.clone();
     Object a2new = a2.clone();
     System.out.println("clone arraylist"+a2new);
     System.out.println("================================");
     
     //5)CONTAINS METHOD
     a2.contains("pune");
     System.out.println(a2.contains("pune"));
     System.out.println("===============================");
     
     //6)ENSURE CAPACITY METHOD
     a2.ensureCapacity(3);
     System.out.println("katraj");
     System.out.println("=================================");
       
     //7)EQUALS METHOD
     a2.equals(a2new);
     System.out.println(a2new);
     System.out.println(a2);
     System.out.println("==============================");
    // 8)GET METHOD
     a2.get(2);
     System.out.println(2);
     System.out.println("=====================================");
     
     //9)INDEX OF METHOD
     a2.indexOf("MUMBAI");
     System.out.println(a2.indexOf("MUMBAI"));
     System.out.println("====================================");
     
     //10)ISEMPTY METHOD
     a2.isEmpty();
     System.out.println(a2.isEmpty());
     System.out.println("=======================================");
     
     ///12)LAST INDEX METHOD
     a2.lastIndexOf(a2new);
     System.out.println(a2.lastIndexOf(a2));
     System.out.println("========================================");
     
     //13)REMOVE METHOD
     a2.remove(a2new);
     System.out.println(a2.remove(a2new));
     System.out.println("===========================================");
     
     //14)SET METHOD
     a2.set(2, "pune");
     System.out.println(a2.set(2, "pune"));
     System.out.println("=========================================");
     
     //15)SIZE METHOD
     a2.size();
     System.out.println(a2.size());
     System.out.println("=============================================");
     
     
     
     

     
     
	}

}
