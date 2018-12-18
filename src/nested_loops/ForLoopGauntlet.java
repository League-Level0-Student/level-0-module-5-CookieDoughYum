package nested_loops;

import javax.swing.JOptionPane;

public class ForLoopGauntlet {
public static void main(String[] args) {
	//Single For-Loops
	for(int i=0; i<=100; i++) {
		System.out.println(i);
	}
	for(int i=100; i>=0; i--) {
		System.out.println(i);
	}
	for(int i=2; i<=100; i++) {
		if(i%2==0) {
			System.out.println(i);
			if(i==100) {
				System.out.println(100);
			}
		}
	}
	for(int i=1; i<=99; i++) {
		if(i%2==0) {
			
		}
		else {
			System.out.println(i);
		}
	}
	for(int i=1; i<=500; i++) {
		if(i%2==0) {
			System.out.println(i + " is even ");
		}
		else {
			System.out.println(i + " is odd ");
		}
	}
	for(int i=0; i<=777; i++) {
		if(i%7==0) {
			System.out.println(i);
		}
	}
	for(int i=2007; i<=2018; i++) {
		System.out.println(" In " + i + " I was " +  (i-2007)  + " Years Old ");
	}
	//Nested For-Loops
	for(int i=0; i<3; i++) {
		for(int i2=0; i2<3; i2++) {
			System.out.println(i+" "+i2);
		}
	}
	for(int i=0; i<=6; i+=3) {
		for(int j=1; j<4; j++) {
			System.out.print(j+i+" ");
		}
		System.out.println();
	}
	
	//work on this
	for(int i=0; i<6; i++) {
		for(int b=0; b<1; b+=1) {
			System.out.println("*");
		}
	}
}
}
