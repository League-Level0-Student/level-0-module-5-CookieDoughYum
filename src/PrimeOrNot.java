import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String prime=JOptionPane.showInputDialog("Pick any number, we'll tell you if it is prime");
	int number=Integer.parseInt(prime);
	for(int i=2; i<=number/2; i++) {
		if(number%i==0) {
			JOptionPane.showMessageDialog(null, "Not prime!");
			System.exit(0);
		}
	}
	JOptionPane.showMessageDialog(null, "Prime!");
		
		
	
}
}
