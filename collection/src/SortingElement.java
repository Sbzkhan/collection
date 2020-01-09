import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingElement {

	public static void main(String[] args) {
	List al= new ArrayList();
	
	al.add(6);
	al.add(5);
	al.add(4);
	al.add(9);
	al.add(7);
	al.add(1);
	al.add(0);
	al.add(8);
	System.out.println(al);
	//Collections.sort(al);
	//System.out.println(al);
	Collections.sort(al,new MyyComparator());
	System.out.println(al);
	
	/*catch(Exception e)
	{
		System.out.println("not sorted integer as well as string");
	}*/
	}

}
class MyyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return -i1.compareTo(i2);
		
	}
}