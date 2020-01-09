package Treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		TreeSet t= new TreeSet();
		t.add(10);
		t.add(0);
		t.add(3);
		t.add(2);
		System.out.println(t);
		//System.out.println(t);
		
		

	}

	

}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
	}}
