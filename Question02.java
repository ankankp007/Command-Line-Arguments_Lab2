public class Question02 {
	public static void main(String[] args) {
		int rand1 = 0, rand2 = 0, l = 0, h = 0, a = 1, b = 6;
 		// if (args.length < 1){ // Error Handle
     		//	System.out.println("Enter valid arguments: \nYou haven\'t entered and argument");
		//	return;
   		//} else {
		//	a = Integer.valueOf(args[0]);
   		//	b = Integer.valueOf(args[1]);
		//}
	
		if (a > b){ 
			// Finding low and high value among two numbers.
   			l = b;
			h = a;
		} else if (a < b) {
			l = a;
			h = b;	
		} else { 
			System.out.println("You have Enterd Same Numbers.");
		}
		
		rand1 = (int)(l + (h - l) * Math.random());
		rand2 = (int)(l + (h - l) * Math.random());
		
		System.out.println("Random Number 1 : " + rand1); 
		System.out.println("Random Number 2 : " + rand2); 
		System.out.println("Sum of Two Random Number : " + (rand1 + rand2)); 
	}
}