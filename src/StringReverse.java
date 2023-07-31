
public class StringReverse {
	public static void main(String[] args) {
		StringReverse s=new StringReverse();
		s.Reverse();
		
	}
	private void Reverse() {
		

	
	String s="Vaishali";
	 char a[]= s.toCharArray();
	 for(int i=a.length-1;i>=0;i-- ) {
		 System.out.print(a[i]);
	 }
	}
}
