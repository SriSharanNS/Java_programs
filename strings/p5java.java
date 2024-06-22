package stringprog;

public class p3 {
	public static void main(String[] args) {
		String s1= "Samanth";
		String s2="Raghu";
		System.out.println(s1.length());
		  System.out.println("-------------------");
		  System.out.println(s1.charAt(2));
		  char[] s3=s1.toCharArray();
		  for (int j = 0; j < s3.length; j++) {
			  System.out.println(s3[j]);
		}
		 System.out.println("-------");
	System.out.println( s1.substring(1));
		System.out.println( s1.substring(3, 6));
		System.out.println(s1.isEmpty());
		System.out.println("--------------");
		String s4=s1.concat(s2);
		System.out.println(s4);
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		System.out.println("-------");
		System.out.println(s1.replace('S', '$'));
		System.out.println(s1.replace("Sam", "ram"));
		System.out.println(s1.contains(s2));
		
		 
		
	}

}
