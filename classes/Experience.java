package classes;
import java.util.Scanner;

public class Experience {
	//конструктор класса со всеми параметрами
	public Experience(byte w, byte a, byte m) {
		workingyears = w;
		army = a;
		maternityleave = m;
	}
	
	//конструктор класса с одним параметром
	public Experience(byte x) {
		workingyears = x;
		army = x;
		maternityleave = x;
	}
	
	//конструктор класса без параметров
	public Experience(){
		workingyears = 0;
		army = 0;
		maternityleave = 0;
	}
	
	//метод вывода
	public void output(){
		System.out.println("Стаж (отработано лет): " + workingyears);
		System.out.println("Стаж (кол-во лет в армии): " + army);
		System.out.println("Стаж (кол-во лет в декретном отпуске): " + maternityleave);
	}
	
	//метод ввода
	public void input(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите кол-во реально отработанных лет: ");
		workingyears = inp.nextByte();
		System.out.println("Введите кол-во лет, проведенных в армии: ");
		army = inp.nextByte();
		System.out.println("Введите кол-во лет в декретном отпуске: ");
		maternityleave = inp.nextByte();
	}
	
	//метод возвращающий совокупный стаж
	public byte allexp(){
		byte all;
		all = workingyears;
		all += army;
		all += maternityleave;
		return all;
	}
	
	//метод возвращающий значения полей
	public byte[] get(){
		byte[] e = new byte[3];
		e[0] = workingyears;
		e[1] = army;
		e[2] = maternityleave;
		return e;
	}
	
	//поля класса
	private byte workingyears; //кол-во реально отработанных лет
	private byte army; //кол-во лет в армии, если сохранялось рабочее место
	private byte maternityleave; //кол-во лет в декретном отпуске, если сохранялось рабочее место
}