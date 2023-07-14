package burcProgrami;

import java.util.Scanner;

public class burcP {

	public static void main(String[] args) {
		
		int month,day;
		Scanner inp=new Scanner(System.in);
		System.out.print("Dogdugunuz gunu giriniz: ");
		day=inp.nextInt();
		System.out.print("Dogdugunuz ayi giriniz: ");
		month=inp.nextInt();
		if (month==1) {
			if (day>=21) {
				System.out.print("Oglak burcu");
			}
			else {
				System.out.print("Kova burcu");
			}
		}
		else if (month==2) {
			if (day>=19) {
				System.out.print("Kova burcu");
			}
			else {
				System.out.print("Balik burcu");
			}
		}
		else if (month==3) {
			if (day>=20) {
				System.out.print("Balik burcu");
			}
			else {
				System.out.print("Koc burcu");
			}
		}
		else if (month==4) {
			if (day>=20) {
				System.out.print("Boga burcu");
			}
			else {
				System.out.print("Koc burcu");
			}
		}
		else if (month==5) {
			if (day>22) {
				System.out.print("İkizler burcu");
			}
			else {
				System.out.print("Boga burcu");
			}
		}
		else if (month==6) {
			if (day>=23) {
				System.out.print("Yengec burcu");
			}
			else {
				System.out.print("İkizler burcu");
			}
		}
		else if(month==7) {
			if (day>22) {
				System.out.print("Aslan burcu");
			}
			else {
				System.out.print("Yengec burcu");
			}
		}
		else if(month==8) {
			if (day>22) {
				System.out.print("Basak burcu");
			}
			else {
				System.out.print("Aslan burcu");
			}
		}
		else if(month==9) {
			if (day>22) {
				System.out.print("Terazi burcu");
			}
			else {
				System.out.print("Basak burcu");
			}
		}
		else if(month==10) {
			if (day>22) {
				System.out.print("Akrep burcu");
			}
			else {
				System.out.print("Terazi burcu");
			}
		}
		else if(month==11) {
			if (day>21) {
				System.out.print("Yay burcu");
			}
			else {
				System.out.print("Akrep burcu");
			}
		}
		else if(month==12) {
			if (day>21) {
				System.out.print("Oglak burcu");
			}
			else {
				System.out.print("Yay burcu");
			}
		}
		
		
	}
	
}
