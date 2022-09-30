package classes;
import java.util.Scanner;

public class Employee {
	public Employee(int i, Experience e, Hours h, Jobtitle j){
		id = i;
		exp = e;
		hour = h;
		jt = j;
	}
	public Employee(int x){
		id = x;
		exp = new Experience((byte)x);
		hour = new Hours((short)x);
		jt = new Jobtitle((short)x);
	}
	public Employee(){
		id = 0;
		exp = new Experience();
		hour = new Hours();
		jt = new Jobtitle();
	}
	public void output(){
		System.out.println("ID: " + id);
		exp.output();
		hour.output();
		jt.output();
	}
	public void input(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите ID: ");
		id = inp.nextInt();
		exp.input();
		hour.input();
		jt.input();
	}
	//public int getsalary(int overtimecost, int weekendscost, int exppercent, \
	//	int expstatus, int subspercent, int subsstatus){
	//}
	public String getpremium(short houramount){
		if (hour.allhours() < houramount)
			return "Премия не положена";
		else
			return "Премия положена";
	}
	private int  id; //индивидуальный номер
	private Experience exp; //стаж
	private Hours hour; //отработанные за месяц часы
	private Jobtitle jt; //должность
}