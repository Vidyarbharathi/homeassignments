package homeroomassign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "stops";
		String text2 = "potss";
//		        char[] charArrayText1 = text1.toCharArray();
		        char[] charArrayText2 = text2.toCharArray();
		        
		       
		System.out.println(text1.contains(text2));
  int[] a= {1,2,3,4,5,6};
  List<Integer> l=new ArrayList<Integer>();

                String name="PayPal";
		String lowerCase = name.toLowerCase();
		char[] charArray=lowerCase.toCharArray();
		
		Set<Character> same=new HashSet<Character>();
		Set<Character> dup=new HashSet<Character>();

		
		for(int i=0;i<charArray.length;i++)
		{
			if(!same.add(charArray[i]))
				dup.add(charArray[i]);
}
		System.out.println(same);
		System.out.println(dup);
		same.removeAll(dup);
		System.out.println(same);

	}
}
