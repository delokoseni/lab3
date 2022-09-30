package classes;
import java.util.Scanner;

public class Subordinates {
	//конструктор класса со всеми параметрами
	public Subordinates(byte a, float A){
		amount = a;
		asos = A;
	}
	
	//конструктор класса с одним параметром
	public Subordinates(byte x){
		amount = x;
		asos = x;
	}
	
	//конструктор класса без параметров
	public Subordinates(){
		amount = 0;
		asos = 0;
	}
	
	//метод подсчета среднего стажа
	public float averageseniority(byte number){
		Scanner inp = new Scanner(System.in);
		float avesen = 0;
		byte[] arr = new byte[2*number];
		System.out.println("Вводите сначала целое число лет стажа, затем месяцы!" + "\n");
		for (byte i = 0; i < 2 * number; i++) {
			arr[i] = inp.nextByte();
		}
		for (byte i = 0; i < 2 * number; i+=2) {
			avesen += arr[i];
			avesen += (float)arr[i+1] / 12;
		}
		avesen = avesen / number;
	return avesen;
	}
	
	//метод ввода
	public void input(){
		Scanner inp = new Scanner(System.in);
		byte YesNo;
		System.out.println("Введите количество подчиненных сотрудника: ");
		amount = inp.nextByte();
		if (amount > 0) {
			System.out.println("Вы знаете средний стаж подчиненных? 1 - да, 0 - нет");
			YesNo = inp.nextByte();
			if(YesNo == (byte)1){
				System.out.println("Введите средний стаж подчиненных сотрудника: ");
				asos = inp.nextFloat();
			}
			else{
				asos = this.averageseniority(this.amount);
			}
		}
		else
			asos = 0;
	}
	
	//метод возвращающий значения полей
	public float[] get(){
		float[] a = new float[2];
		a[0] = (float)amount;
		a[1] = asos;
		return a;
	}
	
	//метод вывода
	public void output(){
		System.out.println("Кол-во подчиненных: " + amount);
		System.out.println("Средний стаж подчиненных: " + asos);
	}
	private byte amount; //кол-во подчиненных
	private float asos; //average seniority of subordinates - средний стаж подчиненных
}