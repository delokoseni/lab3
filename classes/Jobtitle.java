package classes;
import java.util.Scanner;
import classes.Subordinates;

public class Jobtitle {
	//конструктор со всеми параметрами
	public Jobtitle(String j, short h, Subordinates s){
		jtitle = j;
		hourlycost = h;
		subs = s;
	}
	
	//конструктор с одним параметром
	public Jobtitle(short x){
		jtitle = Short.toString(x);
		hourlycost = x;
		subs = new Subordinates((byte)x);
	}
	
	//конструктор без параметров
	public Jobtitle(){
		jtitle = "";
		hourlycost = 0;
		subs = new Subordinates();
	}
	
	//метод ввода класса
	public void input(){
		Scanner inp = new Scanner(System.in, "Cp866");
		System.out.println("Введите должность: ");
		jtitle = inp.nextLine();
		System.out.println("Введите стоимость часа работы: ");
		hourlycost = inp.nextShort();
		subs.input();
	}
	
	//метод вывода класса
	public void output(){
		System.out.println("Должность: " + jtitle);
		System.out.println("Стоимость часа работы: " + hourlycost);
		subs.output();
	}
	
	//метод сравнения
	public float comparisonhc(short hcost){
		float percent;
		percent = (float)hourlycost / ((float)hcost / 100) - 100;
		return percent;
	}
	
	//метод возвращающий значения полей класса
	public float[] get(){
		float[] j = new float[3];
		j[0] = (float)hourlycost;
		float[] j1 = new float[2];
		j1 = subs.get();
		j[1] = j1[0];
		j[2] = j1[1];
		return j;
	}
	
	//поля класса
	private String jtitle; //наименование должности
	private short hourlycost; //стоимость часа работы
	private Subordinates subs; //подчиненные
}