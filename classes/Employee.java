package classes;
import java.util.Scanner;
import java.util.ArrayList;

public class Employee {
	//конструктор класса со всеми параметрами
	public Employee(int i, Experience e, Hours h, Jobtitle j){
		id = i;
		exp = e;
		hour = h;
		jt = j;
	}
	
	//конструктор класса с одним параметром
	public Employee(int x){
		id = x;
		exp = new Experience((byte)x);
		hour = new Hours((short)x);
		jt = new Jobtitle((short)x);
	}
	
	//конструктор класса без параметров
	public Employee(){
		id = 0;
		exp = new Experience();
		hour = new Hours();
		jt = new Jobtitle();
	}
	
	//метод вывода
	public void output(){
		System.out.println("ID: " + id);
		exp.output();
		hour.output();
		jt.output();
	}
	
	//метод ввода
	public void input(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите ID: ");
		id = inp.nextInt();
		exp.input();
		hour.input();
		jt.input();
	}
	
	//метод подсчета зарплаты
	public int getsalary(Salary sal){
		int salary = 0;
		float experience = (float)exp.allexp();
		short[] h = new short[3]; //для часов
		short[] s = new short[5]; //для зарплаты
		byte[] e = new byte[3]; //для стажа
		float[] j = new float[3]; //для должности 
		Subordinates sub = new Subordinates();
		h = hour.get();
		s = sal.get();
		e = exp.get();
		j = jt.get();
		salary += h[0] * j[0];
		salary += h[1] * s[0];
		salary += h[2] * s[1];
		if (s[4] == 1)
			salary += (float)salary / 100 * s[2] * experience;
		else
			salary += (float)salary / 100 * s[2] * e[0];
		if (j[1] > 0 && s[5] == 1)
			salary += j[1] * salary / 100 * s[3] / j[2];
		else
			salary += j[1] * salary / 100 * s[3];
		return salary;
	}
	
	//метод определения положена ли премия
	public String getpremium(short houramount){
		if (hour.allhours() < houramount)
			return "Премия не положена";
		else
			return "Премия положена";
	}
	
	//поля класса
	private int  id; //индивидуальный номер
	private Experience exp; //стаж
	private Hours hour; //отработанные за месяц часы
	private Jobtitle jt; //должность
}