import java.util.Scanner;

class App {
	private static Scanner sc;
			
public static void main(String[] args) {
		
		int i, Number, Sum = 0 ;
		java.util.Scanner sc = new Scanner(System.in);		
		System.out.print("\n Lutfen bir sayi giriniz: ");
		Number = sc.nextInt();

		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format("\n% d bir m�kemmel say�d�r.", Number);
		}
		else {
			System.out.format("\n% d m�kemmel say� de�ildir.", Number);
		}
	}
}