public class Q7{
public static void main(String[] args) {

int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = Integer.valueOf(args[2]);
		if(a<=(b*c))
			System.out.println(true);
		else if (b<=(a*c))
			System.out.println(true);
		else if (c<=(a*b))
			System.out.println(true);
		else
			System.out.println(false);
	}
}