import java.util.Scanner;

class MyScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Son " + num);
	}
}
