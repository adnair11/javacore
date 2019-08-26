class Search
{
	public static void main(String[] args) {
		String s1="wow wow ";
		String sub="wow";
		 StringBuilder ss=new StringBuilder("wow");
		int j=sub.length();
		System.out.println(j);
		String s=s1.substring(0,j);
		System.out.println(s);
		int count=0;
		for(int i=0;i<(s1.length()-sub.length());i++)
		{
			if(sub.equals((s1.substring(i,j))))
			{
				System.out.println("Found");
				StringBuilder x= new StringBuilder();
				x.append(s1.substring(i,j));
				x=x.reverse();

				// System.out.println(sub.equals(x.toString()));
				if(sub.equals(x.toString()))
					System.out.println("Palindrome spotted");
				count++;

			}
		    j++;	

		}
		System.out.println("THE COUNT OF REPEATED STRING IS " + count);

	}
}