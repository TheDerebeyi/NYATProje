package nesneYonelimliAnalizVeTasarimProje;

import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu{


	public void menu() {

		Scanner scanner = new Scanner(System.in);
		String input;
		do {
			System.out.print("Men�den bir i�lem se�iniz:\n"
					+ "1- S�cakl��� g�r�nt�le\n"
					+ "2- So�utucuyu a�\n"
					+ "3- So�utucuyu kapat\n"
					+ "0- ��k��\n"
					+ "Se�iminiz: ");
			input = scanner.nextLine();
		}
		while(input != "0" && input != "1" && input != "2" && input !="3");
		
		switch(input) {
		case "0":
			System.exit(0);
			break;
		case "1":
			sicaklikGonder();
			break;
		case "2":
			sogutucuAc();
			break;
		case "3":
			sogutucuKapat();
			break;
		}
		
	}

	private void sogutucuAc() {
		
	}
	
	private void sogutucuKapat() {
		
	}
	
	private float sicaklikGonder() {
		return 0;
	}
}
