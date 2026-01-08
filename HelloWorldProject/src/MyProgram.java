/*
 * TODO: Leo Wang
 * TODO: 01/7/25
 * TODO: 6
 * TODO: Program to sort trains by mileage, destination, and weight to different tracks. In order to ensure trains can reach destination safely. 
 */
import java.util.Scanner;
import java.io.File;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class MyProgram {
	public static int val = 0;
	public static void main(String[] args) {

		Queue <Train> O = new LinkedList<Train>(); 
		Queue <Train> needMaintenance = new LinkedList<Train>(); 
		Queue <Train> A = new LinkedList<Train>(); 
		Queue <Train> B = new LinkedList<Train>(); 
		Queue <Train> C = new LinkedList<Train>(); 
		Queue <Train> other = new LinkedList<Train>(); 

		int weightA, weightB, weightC; 

		int limitTrackA = 100000, limitTrackB = 100000, limitTrackC = 100000;
	
		Scanner x = new Scanner(System.in);
		try{
			File f = new File("HelloWorldProject/src/data.txt");
			x = new Scanner (f);
			String name = x.nextLine();
			//System.out.println(name);
			
			while(x.hasNext()){
				if(name.indexOf("car") != -1){
					O.add(new Train(name, x.nextLine(), x.nextLine(), x.nextLine(), x.nextInt(), x.nextInt())); 
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println(O); 
		

	}
}
