import java.util.*;


class Cricketer implements Comparable{ //--- Comparable<> used to compare complex objects.
										//implements comapareTo(Object y);
	
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

	
	public int compareTo(Object y) { //Comparison done on run basis can be changed to avg or name.
		
		if(this.avg<((Cricketer)(y)).runs) {
			return 1;
		}
		else {
		return -1;
	}
	}
	
	
	
}
public class CricketCompare {

	public static void main(String[] args) {
		
		Cricketer c1 = new Cricketer("Dhoni", 150000, 45.f);
		Cricketer c2 = new Cricketer("Virat", 170000, 47.f); //<---Object Creation---->//
		Cricketer c3 = new Cricketer("Rohit", 180000, 41.f);

		ArrayList al = new ArrayList();
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		
		Collections.sort(al); //<----sort() from Collections interface----->///
		System.out.println(al);
		
	
		
	}
}
