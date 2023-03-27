package Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Collections {
	public static void main(String args[])
	{
		List<String> l1=new ArrayList<>();
		l1.add("a1");
		l1.add("b1");
		l1.add("c1");
		l1.add("b1");
		l1.add("e1");
		l1.add("a1");
		l1.add("g1");
		l1.add("h1");
		List<String> duplicateList=new ArrayList<>();
		for(String s1:l1)
		{
			if(!duplicateList.contains(s1))
			{
				duplicateList.add(s1);
			}
		}
		System.out.println(duplicateList);
		System.out.println("----------------");
	String ar1[]=l1.toArray(new String[l1.size()]);
	List<Integer> lstint=new ArrayList<>();
	//int iarr[]=lstint.toArray();
	
	
		System.out.println(Arrays.toString(ar1));
		
		
		Iterator<String> iterator1=l1.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		System.out.println("-----------------------------------------------------");
		l1.forEach(a->{
			System.out.println(a);
		});
		System.out.println("--------------------------------------------------------");
		Iterator<String> iterator2=l1.iterator();
		iterator2.forEachRemaining(a1->{
			System.out.println(a1);
		});
		
		System.out.println("-----------------------------------------------------");
		List<String> list2 =new ArrayList<>();
		list2.add("s1");
		list2.add("s2");
		list2.add("s1");
		
		HashSet<String> set1=new HashSet<>(list2);
		Iterator iterator3=set1.iterator();
		while(iterator3.hasNext())
		{
			System.out.println(iterator3.next());
		}
	}

}
