
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//a.	A while loop that prints all even numbers from 0 to 100
//		int eN = 0;
//		while (eN <= 100) {
//			System.out.println(eN);	
//			eN += 2;
//		}
//		
//b.	A while loop that prints every 3rd number going backwards from 100 until we reach 0
//		int odd	= 100;
//		while (odd > 0) {
//			System.out.println(odd);
//			odd -= 3;
//		}
//		
//c.	A for loop that prints every other number from 1 to 100
//		for (int eO = 1; eO <= 100; eO += 2) {
//			System.out.println(eO);
//		}
//		
//d.	A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” instead of the number, and if the number is divisible by 5, it prints “World” instead of the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.	
		
		for (int hW = 0; hW <= 100; hW ++) {
			if (hW == 0) {
				System.out.println(hW);
			} else if (hW%3 == 0) {
				System.out.println("Hello");
			} else if (hW%5 == 0) {
				System.out.println("World");
			} else {
				System.out.println(hW);
			}
		}
	}

}
