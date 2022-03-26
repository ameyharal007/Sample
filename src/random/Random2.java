package random;

public class Random2 {
	

	public static void main(String[] args) {
		
		String name="Haral";
		
		String reverse="";
		
		int i=name.length()-1;
		
		for(;i>=0;i--) {
			
			reverse=reverse+name.charAt(i);
			
		}
		
		
		System.out.println(reverse);
	}
}
