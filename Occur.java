class Occur
{
	public static void main(String[] args) {
		String x="Hello World Hello World";
		String []y= x.split(" ");
		// for(int i=0;i<y.length;i++)
		// 	System.out.println(y[i]);
		




			for(int i=0;i<y.length;i++)
			{
				for(int j=0;j<y.length-1;j++)
				{
					if(y[j].compareTo(y[j+1])>0)
					{
						String temp=y[j];
						y[j]=y[j+1];
						y[j+1]=temp;
					}

				}
			}
			int []count=new int[20];

			for(int i=0,k=0;i<y.length;i++,k++)
		{
			
			for(int j=0;j<y.length;j++,k++)
			{
				if(y[i].equals(y[j]))
					count[k]++;
			}
				// System.out.println(y[i]+"occurs" + count[k] + "times");
		}

		String n[];
		

		

	}
}