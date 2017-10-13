public class Drinken {
	public static void main(String[] args) {
		drinken();
		lopen(500);
		drinken();
	}

	public static void lopen(int afstand) {
		System.out.println("De volgende kroeg is " + afstand + " meter lopen.");
	}

	public static void drinken() {
		System.out.println("Proost!");
	}
}