import classes.*;

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
		short norm = 120;
		short over = 10;
		short week = 10;
		Hours h1 = new Hours();
		Hours h2 = new Hours(norm);
		Hours h3 = new Hours(norm, over, week);
		h1.input();
		System.out.println("\n" + "h1:");
		h1.output();
		System.out.println("\n" + "h2:");
		h2.output();
		System.out.println("\n" + "h3:");
		h3.output();
		System.out.println("\n" + "Отработано всего часов h3: " + h3.allhours());
		byte a = 6;
		float b = 1.2f;
		Subordinates sub1 = new Subordinates();
		Subordinates sub2 = new Subordinates(a);
		Subordinates sub3 = new Subordinates(a, b);
		sub1.input();
		System.out.println("\n" + "sub1:");
		sub1.output();
		System.out.println("\n" + "sub2:");
		sub2.output();
		System.out.println("\n" + "sub3:");
		sub3.output();
	}
}