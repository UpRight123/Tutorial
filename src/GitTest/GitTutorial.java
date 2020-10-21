package GitTest;

import java.util.ArrayList;

public class GitTutorial {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		for (int i = 0; i <number.size(); i++) {
		      System.out.println(number.get(i));
		    }
	    System.out.println(number);
	    System.out.println(number.get(1));
	    System.out.println(number.set(0, 50));
	    System.out.println(number);
	    System.out.println(number.remove(0));
	    System.out.println(number.size());
	    

	}

}
