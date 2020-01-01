package task3;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

/**
 * @author Volodymyr Karmazyn
 * @version 1.0
 * @category Java
 * @since Java 1.8
 * */

public class Application {

	static void menu() {
		System.out.println("�������� 1, ��� ��������� �� � ����� �����");
		System.out.println("�������� 2, ��� ������� �� ����� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3, ��� ������� �� ����� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6, ��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7, ��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9, ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 0, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");
	}

//	public static void main(String[] args) {
//		
//		seasonScanner();
//	
//	}

	public static void main(String[] args) {
		Months[] monthArr = Months.values();
		Seasons[] seasonArr = Seasons.values();
		Scanner season = new Scanner(System.in);

		while (true) {
			menu();
			System.out.println("Enter number from 0 to 9!");
			
			switch (season.next()) {
			case "1": {// ��������� �� � ����� ����� (����� ������� � ������, �����������, ���			
					   // ������ ���� ��� �� ��������)
				
				System.out.println("Enter month : ");
				season = new Scanner(System.in);
				String sc = season.next().toUpperCase();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.name().equalsIgnoreCase(sc)) {
						System.out.println("Month exists : "+m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;

			}// case 1

			case "2": {// ������� �� ����� � ����� � ����� ����

				System.out.println("Enter season : ");
				season = new Scanner(System.in);
				String seso = season.next().toUpperCase();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.getSeasons().name().equalsIgnoreCase(seso)) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;

			} // case 2

			case "3": {//������� �� ����� �� ����� ���� ���� ������� ���

				System.out.println("Enter number 28 - 31 : ");
				season = new Scanner(System.in);
				int mon = season.nextInt();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.getinDays() == mon) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;
				
			}// case 3

			case "4": {// ������� �� ����� �� ����� �� ����� ����� ������� ���

				System.out.println("Enter number : ");
				season = new Scanner(System.in);
				int mo = season.nextInt();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.getinDays() < mo) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;
				
			} // case 4

			case "5": {// ������� �� ����� �� ����� �� ����� ����� ������� ���

				System.out.println("Enter number : ");
				season = new Scanner(System.in);
				int mo = season.nextInt();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.getinDays() > mo) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;
				
				}// case 5

			case "6": {// ������� �� ����� �������� ���� ����
				
				System.out.println("Enter season : ");
				season = new Scanner(System.in);
				String nSeas = season.next().toUpperCase();
				
				boolean flag = false;
				
				for (Seasons s : seasonArr) {
					if (s.name().equals(nSeas)) {
						//System.out.println("Next season is : "+s);
						flag = true;
					}
				}
				if(flag) {
					Seasons season2 = Seasons.valueOf(nSeas);
					int ordinal = season2.ordinal();
					
					if(ordinal == seasonArr.length -1) {
						ordinal = 0;
						System.out.println(seasonArr [ordinal]);
					}else {
						System.out.println(seasonArr[ordinal+1]);
					}
				}
				
				if (!flag) {
					System.out.println("Season doesn`t exist");
				}
				break;
				
				}// case 6

			case "7": {// ������� �� ����� ��������� ���� ����

				System.out.println("Enter season : ");
				season = new Scanner(System.in);
				String uSeas = season.next().toUpperCase();
				
				boolean flag = false;
				
				for (Seasons s : seasonArr) {
					if (s.name().equals(uSeas)) {
						//System.out.println("Next season is : "+s);
						flag = true;
					}
				}
				if(flag) {
					Seasons season3 = Seasons.valueOf(uSeas);
					int ordinal = season3.ordinal();
					
					if(ordinal == seasonArr.length -1) {
						ordinal = 0;
						System.out.println(seasonArr [ordinal]);
					}else {
						System.out.println(seasonArr[ordinal-1]);
					}
				}
				
				if (!flag) {
					System.out.println("Season doesn`t exist");
				}
				break;
				
			} // case 7

			case "8": {// ������� �� ����� �� ����� �� ����� ����� ������� ���

				System.out.println("Enter number 28 or 30 : ");
				season = new Scanner(System.in);
				int no = season.nextInt();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.getinDays() % 2 == 0) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;
				
			} // case 8
			
			case "9": {// ������� �� ����� �� ����� �� ����� ������� ������� ���

				System.out.println("Enter number 31 : ");
				season = new Scanner(System.in);
				int nom = season.nextInt();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.getinDays() % 2 == 1) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;
				
			} // case 9

			case "0": {// ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���

				System.out.println("Enter month : ");
				season = new Scanner(System.in);
				String scs = season.next().toUpperCase();

				boolean flag = false;

				for (Months m : monthArr) {
					if (m.name().equalsIgnoreCase(scs)) {
						if(m.getinDays() % 2 == 0) {
							System.out.println("Month exists and has an even number of days : "+m);					
						flag = true;
					}else {
						System.out.println("Month exists and has no even number of days : "+m);					
						}
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;

			} // case 10*/

			}// switch
		} // while
	}// seasonScanner
}
