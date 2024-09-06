package Lec_4;
import java.util.*;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       ArrayList<Integer> l= new ArrayList<>();
       //List
       List<Integer> l= new ArrayList<>();
       //add
       l.add(1);
       l.add(66);
       l.add(120);
       l.add(67);
       l.add(12);
       System.out.println(l);
       
       
       //get
       System.out.println(l.get(1));
       
       //size()
       System.out.println(l.size());
       
       //remove
       l.remove(2);
       System.out.println(l);
       
       //Collections.sort(l)
       Collections.sort(l);
       System.out.println(l);
	}

}
