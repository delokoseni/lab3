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
	
	
	public int getsalary(Salary sal){
		int salary = 0;
		float experience = (float)exp.allexp();
		short[] h = new short[3];
		h = hour.gethours();
		salary += h[0] * jt.hourlycost;
		salary += h[1] * sal.overtimecost;
		salary += h[2] * sal.weekendcost;
		if (sal.expstatus == true)
			salary += (float)salary / 100 * sal.exppercent * experience;
		else
			salary += (float)salary / 100 * sal.exppercent * exp.workingyears;
		if (jt.subs.amount > 0 && sal.subsstatus)
			salary += jt.subs.amount * salary / 100 * sal.subspercent / jt.subs.asos;
		else
			salary += jt.subs.amount * salary / 100 * sal.subspercent;
		return salary;
	}
	
	
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