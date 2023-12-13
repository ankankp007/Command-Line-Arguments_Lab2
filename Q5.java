public class Q5{
public static void main(String[] args) {


int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = Integer.valueOf(args[2]);
		int max = Math.max(a, (Math.max(b, c)));
		int min = Math.min(a, (Math.min(b, c)));
		int median = (a+b+c)-(max+min);
		System.out.println(min + " "+median+" "+max);

}
}