
public class Fibonacci {
public static void main(String[] args) {
	for(int i=0; i<11; i++) {
		int n1=0;
		int n2=1;
		if(i>=2) {
			n1+=n2=i;
			n1+=i+1;
			n2+=i+1;
		}
		System.out.println(i);
	}
}
}
//int:sum
//n1=n2
//n2=sum