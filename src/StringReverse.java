
public class StringReverse {
	public static void main(String[] args) {
		StringReverse s=new StringReverse();
		s.Reverse();
		
	}
	private void Reverse() {
		

	
	String s="Vaishali";
	 char a[]= s.toCharArray();
	 System.out.println("Reverse String is : ");
	 System.out.println("1. First Changes");
	 System.out.println("2.second change ");
	 System.out.println("3.Third change ");
	 System.out.println("4.Fourth change ");
	 System.out.println("5.Fifth change ");
	 System.out.println("6.Fourth change ");
	 System.out.println("7.Fifth change ");
	 System.out.println("8.Fourth change ");
	 System.out.println("9.Fifth change ");
	 for(int i=a.length-1;i>=0;i-- ) {
		 
		 System.out.print(a[i]);
		 
	 }
	}
}
