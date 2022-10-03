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
		salary += hour.hoursmoney(jt, sal);
		salary = sal.allmoney(salary, exp, jt);
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