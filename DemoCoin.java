

import java.util.Scanner;
public class DemoCoin
{
	
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Is the coin in circulation ? (true / false): ");
		boolean inCirculation = scanner.nextBoolean();
		
		
		System.out.print("Enter the condition of the coin (E - Excellent , G - Good , F - Fair): ");
		char condition = scanner.next().toUpperCase().charAt(0);
		
		System.out.print("Enter the mint year of the coin: ");
		int mintYear = scanner.nextInt();
		
		System.out.print("Enter the base value of the coin: ");
		double baseValue = scanner.nextDouble();
		
		
		
		Coin coin = new Coin(inCirculation,condition,mintYear,baseValue);
		
		System.out.println("\n---Coin Details---");
		System.out.println("in Circulation: " + coin.isInCirculation());
		System.out.println("Condition: " + coin.getCondition());
		System.out.println("Mint Year: " + coin.getMintYear());
		System.out.println("Base Value: R " + coin.getBaseValue());
		System.out.println("Collector Value : R " + coin.getCollectorValue());
	}
	
	
	
}





















