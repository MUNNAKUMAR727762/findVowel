package star;

public class vowelInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="good morning";
		String l=s.toLowerCase();
		int c=0;
		for(int i=0; i<s.length();i++) {
			if(l.charAt(i)=='a' ||l.charAt(i)=='e' ||l.charAt(i)=='i' || l.charAt(i)=='o' ||l.charAt(i)=='u') {
				c +=1;
			}
		}
		System.out.println(c);

	}

}
