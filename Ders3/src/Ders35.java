import java.util.Scanner;

public class Ders35 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("A kenar�n� giriniz :");
		
		int a=sc.nextInt();
		
		System.out.println("B kenar�n� giriniz :");
		
		int b=sc.nextInt();
		
		int alan=a*b;
		
		int cevre=(a+b)*2;
		
		System.out.println("Alan :"+alan+" �evre :"+cevre);
		
		
	}

}
