import classes.Experience;

public class Main {
	public static void main(String args[]) {
		byte years = 10;
		byte armyyears = 1;
		byte materyears = 0;
		Experience exp1 = new Experience();
		Experience exp2 = new Experience(years);
		Experience exp3 = new Experience(years, armyyears, materyears);
		exp1.input();
		System.out.println("\n" + "exp1:");
		exp1.output();
		System.out.println("\n" + "exp2:");
		exp2.output();
		System.out.println("\n" + "exp3:");
		exp3.output();
		System.out.println("\n" + "Совокупный стаж exp3: " + exp3.allexp());
	}
}