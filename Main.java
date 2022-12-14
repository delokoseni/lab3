import classes.*;
import java.util.Scanner;

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
		String str = "Менеджер";
		Jobtitle jt1 = new Jobtitle();
		Jobtitle jt2 = new Jobtitle(over);
		Jobtitle jt3 = new Jobtitle(str, over, sub1);
		jt1.input();
		System.out.println("\n" + "jt1:");
		jt1.output();
		System.out.println("\n" + "jt2:");
		jt2.output();
		System.out.println("\n" + "jt3:");
		jt3.output();
		System.out.println("Почасовая оплата jt1 выше/ниже 120 на " + jt1.comparisonhc(norm) + " процентов");
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(10);
		Employee emp3 = new Employee(11, exp1, h1, jt1);
		emp1.input();
		System.out.println("\n" + "emp1:");
		emp1.output();
		System.out.println("\n" + "emp2:");
		emp2.output();
		System.out.println("\n" + "emp3:");
		emp3.output();
		System.out.println(emp1.getpremium((short)150));
		Salary sal1 = new Salary();
		Salary sal2 = new Salary((byte)5);
		Salary sal3 = new Salary((byte)50, (byte)100, (short)5, (short)10, true, true);
		sal1.input();
		System.out.println("\n" + "sal1:");
		sal1.output();
		System.out.println("\n" + "sal2:");
		sal2.output();
		System.out.println("\n" + "sal3:");
		sal3.output();
		System.out.println("Зарплата emp1 при sal3 " + emp1.getsalary(sal3));
	}
}