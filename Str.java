class Str
{
	public static void main(String[] args) {
		String msg="Hello";
		String msg1="Hello";
		String s=new String("Hello");
		String s1=new String("Hello");
		if(msg==msg1)
			System.out.println("TRUE");
		if(s==s1)
			System.out.println("TRUE");

		if(s.equals(s1))
			System.out.println("SAME");
		s=s.intern();
		if(s==msg)
			System.out.println("TRUE");

		


	}
}