package fibonacciseries;


	import java.util.Arrays; 
	import java.util.Comparator; 
	import java.util.LinkedList; 
	import java.util.List; 
	/** * Java Program to show how to sort a list in Java 8. * * @author WINDOWS 8 */
	  public static void main(String args[])
	
	
	{ // foods which helps in weight loss 
		List<String> listOfWeightLossFood = new LinkedList<>( Arrays.asList("beans", "oats", "avocados", "broccoli")); 
		System.out.println("before sorting: " + listOfWeightLossFood);
		listOfWeightLossFood.sort(Comparator.reverseOrder());
		System.out.println("after sorting: " + listOfWeightLossFood); } 
	}

		
}
