package Array;

import java.util.Scanner;

public class PhoneBrands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
			String[] google = { "Pixel 6", "Pixel 6 pro", "Pixel 5" };
			String[] iphone = { "Iphone 12", "iphone 12 mini", "iphone 11", "iphone 11 pro" };

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter phone brand name");
			String phoneBrandName = sc.next();
			String productName = "";
			boolean isProductAvailable = false;

			switch (phoneBrandName) {

			case "samsung":
				System.out.println("All available phones for Samsung");
				for (int i = 0; i < samsung.length; i++) {
					System.out.println(samsung[i]);
				}

				System.out.println("Enter product Name");
				productName = sc.next();
				for (int i = 0; i < samsung.length; i++) {
					if (samsung[i].equals("S20"))
						;
					{
						isProductAvailable = true;
					}
					break;
				}
			case "google":
				System.out.println("All available phones for google");
				for (int i = 0; i < google.length; i++) {
					System.out.println(google[i]);
				}
				System.out.println("Enter product name");
				productName = sc.next();
				for (int i = 0; i < google.length; i++) {
					if (google[i].equals("Pixel 5"));
						
					{
						isProductAvailable = true;
					}
					break;

				}
			case "iphone":
				System.out.println("All available phones for iphone");
				for (int i = 0; i < iphone.length; i++) {
					System.out.println(iphone[i]);
				}
				System.out.println("Enter product name");
				productName = sc.next();
				for (int i = 0; i < iphone.length; i++) {
					if (iphone[i].equals(productName));
						
					{
						isProductAvailable = true;
					}
					break;

				}
			default:
				System.out.println("Please select product from the list");

			}

		}

	

	}


