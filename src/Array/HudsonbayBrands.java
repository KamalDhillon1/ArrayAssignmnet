package Array;

import java.util.Scanner;

public class HudsonbayBrands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hudsonbay Store have 2 brands -Coach & Tory Burch online for sale.Both brands
		// have their own product availability
		String[] coach = { "Bags", "Shoes", "Jewelry" };
		String[] toryBurch = { "dresses", "wallet", "Glasses" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Brand Name");
		String storeBrandName = sc.next();
		String productName = "";
		boolean isProductAvailable = true;

		switch (storeBrandName) {
		case "coach":
			System.out.println("Available things for coach");
			for (int i = 0; i < coach.length; i++) {
				System.out.println(coach[i]);
			}
			System.out.println("Enter product Name");
			productName = sc.next();
			for (int i = 0; i < coach.length; i++) {
				if (coach[i].equals("Shoes"));
					

				{
					isProductAvailable = true;
				}
				break;
			}
		case "toryBurch":
			System.out.println("Available things for toryBurch");
			for (int i = 0; i < toryBurch.length; i++) {
				System.out.println(toryBurch[i]);
			}
			System.out.println("Enter product Name");
			productName = sc.next();
			for (int i = 0; i < toryBurch.length; i++) {
				if (toryBurch[i].equals("Dresses"));
					

				{
					isProductAvailable = true;
				}
				break;

			}
		default:
			System.out.println("Please choose from product list");

		}
	}

}

