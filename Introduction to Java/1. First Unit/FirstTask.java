import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // instance of Scanner
		
		
		System.out.print("Input the value of a: "); float a = input.nextFloat();
		System.out.print("Input the value of b: "); float b = input.nextFloat();
		System.out.print("Input the value of c: "); float c = input.nextFloat();
		
		float z = ((a - 3) * b / 2) + c;
		System.out.print("The value of the expression z: " + z);
	}

}
