package collection;

import java.util.LinkedList;

public class FstEleLinkList_9 {

		public static void main(String[] args) {
			
			LinkedList<String> l1=new LinkedList<String>();
			l1.add("one");
			l1.add("two");
			l1.add("three");
			l1.add("four");
			l1.add("five");
			
			System.out.println("LinkedList contains = "+l1);

			System.out.println("1st ele of LinkedList = "+l1.getFirst());
			
		}
}
