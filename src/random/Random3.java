package random;

public class Random3 {
	int trial;
	
	public static void main(String[] args) {
		Random3 obj=new Random3();
		Random3 obj2=new Random3();
		obj.one();
		obj2.two();
	}
	public void one() {
		trial=50;
		System.out.println(trial);
		
	}
	public void two() {
		trial++;
		System.out.println(trial);
		
	}

}
