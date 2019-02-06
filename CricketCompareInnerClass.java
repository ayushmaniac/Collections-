import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer {
	
	String name;
	int runs;
	float avg;
	
	public Cricketer(String name, int runs, float avg) { // Constructors
		this.name = name;
		this.runs = runs;
		this.avg = avg;
	}

	public String getName() { //Getters
		return name;
	}

	public int getRuns() {
		return runs;
	}

	public float getAvg() {
		return avg;
	}
	
	public String toString() { //Conversion of complex output to String.
		
		return name+" "+runs+" "+avg;
	
	}
}


	
public class CricketCompareTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cricketer c1 = new Cricketer("Dhoni",15000, 45.5f);
		Cricketer c2 = new Cricketer("Virat",19000, 55.5f);
		Cricketer c3 = new Cricketer("Adam Gilchrist",13000, 35.5f);
		
		class Alpha implements Comparator{
	
	public int compare(Object x, Object y) {
		
		if(((Cricketer)(x)).avg < ((Cricketer)(y)).avg){
			return 1;
		}
		else {
			return -1;
		}
	
		
		
	}
}
		
		Alpha a = new Alpha();
		
		ArrayList al = new ArrayList();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		
		Collections.sort(al,a);
		
		System.out.println(al);

		

	}

}

