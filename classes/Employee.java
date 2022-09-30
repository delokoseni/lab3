package classes;
import java.util.Scanner;
import java.util.ArrayList;

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
		short[] s = new short[5];
		float[] a = new float[2];
		h = hour.get();
		s = sal.get();
		a = jt.subs.get();
		salary += h[0] * jt.hourlycost;
		salary += h[1] * s[0];
		salary += h[2] * s[1];
		if (s[4] == 1)
			salary += (float)salary / 100 * s[2] * experience;
		else
			salary += (float)salary / 100 * s[2] * exp.workingyears;
		if (jt.subs.amount > 0 && s[5] == 1)
			salary += a[0] * salary / 100 * s[3] / a[1];
		else
			salary += a[0] * salary / 100 * s[3];
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