package classes;
import java.util.Scanner;

public class Salary {
	
	//конструктор со всеми параметрами
	public Salary(byte over, byte week, short expper, short subsper, boolean expst, boolean subsst){
		overtimecost = over;
		weekendcost = week;
		exppercent = expper;
		subspercent = subsper;
		expstatus = expst;
		subsstatus = subsst;
	}
	
	//конструктор с одним параметром
	public Salary(byte x){
		overtimecost = x;
		weekendcost = x;
		exppercent = (short)x;
		subspercent = (short)x;
		if(x > 0){
			expstatus = true;
			subsstatus = true;
		}
		else {
			expstatus = false;
			subsstatus = false;
		}
	}
	
	//конструктор без параметров
	public Salary() {
		overtimecost = (byte)0;
		weekendcost = (byte)0;
		exppercent = (short)0;
		subspercent = (short)0;
		expstatus = false;
		subsstatus = false;
	}
	
	//метод ввода
	public void input(){
		byte a;
		Scanner inp = new Scanner(System.in, "Cp866");
		System.out.println("На сколько процентов увеличивать почасовую оплату сверхурочных: ");
		overtimecost = inp.nextByte();
		System.out.println("На сколько процентов увеличивать почасовую оплату в выходные: ");
		weekendcost = inp.nextByte();
		System.out.println("Учитывать ли стаж (0 - нет, иначе - да): ");
		a = inp.nextByte();
		if(a != 0) {
			System.out.println("На сколько процентов умножать зарплату за стаж: ");
			exppercent = inp.nextShort();
			expstatus = true;
		}
		System.out.println("Учитывать ли наличие подчиненных (0 - нет, иначе - да): ");
		a = inp.nextByte();
		if(a != 0) {
			System.out.println("На сколько процентов умножать зарплату за наличие подчиненных: ");
			subspercent = inp.nextShort();
			subsstatus = true;
		}
		
	}
	
	//метод вывода
	public void output(){
		System.out.println("Коэффициент умножения оплаты сверхурочных часов: " + overtimecost);
		System.out.println("Коэффициент умножения оплаты часов отработанных в выходные: " + weekendcost);
		System.out.println("Коэффициент умножения оплаты за стаж: " + exppercent);
		System.out.println("Коэффициент умножения оплаты за наличие подчененных: " + subspercent);
		System.out.println("Учет стажа: " + expstatus);
		System.out.println("Учет наличия подчиненных: " + subsstatus);
	}
	
	//поля класса
	private byte overtimecost; //коэффициент умножения оплаты сверхурочных часов
	private byte weekendcost; //коэффициент умножения оплаты часов отработанных в выходные
	private short exppercent; //коэффициент умножения оплаты за стаж
	private short subspercent; //коэффициент умножения оплаты за наличие подчененных
	private boolean expstatus; //учет стажа
	private boolean subsstatus; //учет наличия подчиненных
}