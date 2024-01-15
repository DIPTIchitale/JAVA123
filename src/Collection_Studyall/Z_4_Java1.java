package Collection_Studyall;

import java.util.Arrays;

public class Z_4_Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]=new int[4];
		marks[0]=5;
		marks[1]=30;
	    marks[2]=20;
	    Arrays.sort(marks);
	    for(int i=0;i<=3;i++)
	    {
	    	System.out.println(marks[i]);
	    }
	    //desending order
	    Arrays.sort(marks);
	    for(int i=3;i>=0;i--)
	    {
	    	System.out.println(marks[i]);
	    }

	}

}
