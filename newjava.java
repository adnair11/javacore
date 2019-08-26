class newjava{

  void func(int i)
   {
   	int sum=0;
   	for(int j=1;j<=10;j++)
   	{
   		if(j%2!=0)
   		{
   			sum=((i*j) +((j-1)*i));
   			System.out.println(sum); 


   		}
   		else
   			continue;


   	}

   }

	public static void main(String[] args) {
		int i=10;
		new newjava().func(i);

	}
}