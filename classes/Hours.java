package classes;
import java.util.Scanner;

public class Hours {
	//конструктор класса со всеми параметрами
	public Hours(short n, short o, short w){
		normal = n;
		overtime = o;
		weekends = w;
	}
	//конструктор класса с одним параметром
	public Hours(short x){
		normal = x;
		overtime = x;
		weekends = x;
	}
	//конструктор класса без параметров
	public Hours(){
		normal = 0;
		overtime = 0;
		weekends = 0;
	}
	//метод ввода
	public void input(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите кол-во отработанных за месяц часов по графику: ");
		normal = inp.nextShort();
		System.out.println("Введите кол-во сверхурочных часов: ");
		overtime = inp.nextShort();
		System.out.println("Введите кол-во отработанных за месяц часов в выходные: ");
		weekends = inp.nextShort();
	}
	//метод вывода
	public void output(){
		System.out.println("Отработано часов за месяц(по графику): " + normal);
		System.out.println("Отработано часов за месяц(сверхурочно): " + overtime);
		System.out.println("Отработано часов за месяц(в выходные дни): " + weekends);
	}
	//метод возвращающий все отработанные за месяц часы
	public short allhours(){
		short all = 0;
		all += normal;
		all += overtime;
		all += weekends;
		return all;
	}
	private short normal; //кол-во часов, отработанных по графику
	private short overtime; //кол-во часов, отработанных сверхурочно
	private short weekends; //кол - во часов, отработанных в выходные дни
}