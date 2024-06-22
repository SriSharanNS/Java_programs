package strings;

public class p10 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb);
		
		sb.insert(1, '$');
		System.out.println(sb);
		
		sb.insert(4, false);
		System.out.println(sb);
		
	}
	
}
