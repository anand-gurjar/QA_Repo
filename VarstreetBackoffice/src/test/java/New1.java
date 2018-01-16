
public class New1 {
	
	public static void main(String args[]){
		String str = "I am Divya Gurjar";
		String[] spiltarray = str.split(" ");
		String[] t = new String[spiltarray.length];
		for(String reverse: spiltarray){
			StringBuilder sb = new StringBuilder(reverse);
			
			int i = 0;
			t[ i]=sb.reverse().toString();
			System.out.println(t[ i]);
		}
	}
}
