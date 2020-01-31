package homework8.hash;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
	public static void main(String arg[]) {
		ArrayList<Comparable<person>> people=new ArrayList();
		ArrayList<person> people2=new ArrayList();
		
			try {
			people=Read.readFile("/Applications/notes/Classes/cs206/assignments/a8/2011.csv");
			//people2=Read.readFile2(x);
			}
			catch(FileNotFoundException e) {
				System.out.println("Sorry the file was not found please check that the file path you entered is correct");
			}
		
		System.out.println("Records given: " + people2.size());
		Deduplication<person> copycats= new Deduplication(people);
		
		long startTime = System.currentTimeMillis();
		
		
		
		//ArrayList<Comparable<person>> allpairs=copycats.allPairsDeduplication(people);
		ArrayList<person> hashlin=copycats.hashLinearDeduplication(people);
		//ArrayList<person> hashdouble=copycats.hashDoubleDeduplication(people);
		//ArrayList<person> quick=copycats.quicksortDeduplication(people);
		//ArrayList<person> built=copycats.builtinSortDeduplication(people2);
		long endTime = System.currentTimeMillis();
		long elapsed = endTime - startTime;
		
		System.out.print("time elapsed"+ elapsed);
		System.out.println("Attributes checked: sex,race,dob,age,ht_feet,ht_inch,weight,haircolr,eyecolor,build");
		System.out.println("Duplicates found: "+ copycats.getBuiltCopies());
		
		
		
		
	}

}