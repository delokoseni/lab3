package classes;
import java.util.Scanner;
import classes.Subordinates;

public class Jobtitle {
	public Jobtitle(String j, short h, Subordinates s){
		jtitle = j;
		hourlycost = h;
		subs = s;
	}
	public Jobtitle(short x){
		jtitle = Short.toString(x);
		hourlycost = x;
		subs = new Subordinates((byte)x);
	}
	public Jobtitle(){
		jtitle = "";
		hourlycost = 0;
		subs = new Subordinates();
	}
	public void input(){
		Scanner inp = new Scanner(System.in, "Cp866");
		System.out.println("Введите должность: ");
		jtitle = inp.nextLine();
		System.out.println("Введите стоимость часа работы: ");
		hourlycost = inp.nextShort();
		subs.input();
	}
	public void output(){
		System.out.println("Должность: " + jtitle);
		System.out.println("Стоимость часа работы: " + hourlycost);
		subs.output();
	}
	public float comparisonhc(short hcost){
		float percent;
		percent = (float)hourlycost / ((float)hcost / 100) - 100;
		return percent;
	}
	private String jtitle; //наименование должности
	private short hourlycost; //стоимость часа работы
	private Subordinates subs; //подчиненные
}