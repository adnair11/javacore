import java.util.Scanner;

class use
{
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User: { ID : " + id + ", NAME : " + name + " }";
	}


    public static void main(String[] args) {
    	use []u=new use[3];
    	Scanner sc=new Scanner(System.in);
    	for(int i=0;i<3;i++)
    	{
    		u[i]=new use();
    		u[i].setId(sc.nextInt());
    		u[i].setName(sc.next());

    	}
    	use temp=new use();


		for(int i=0;i<u.length-1;i++)
		{
			for(int j=0;j<u.length-i-1;j++)
			{
				String s1=u[j].getName();
				String s2=u[j+1].getName();
				if(s1.compareTo(s2)>0)
				{
					
					temp=u[j];
					u[j]=u[j+1];
					u[j+1]=temp;
					
				}


			}
		}



    	for(int i=0;i<u.length;i++)
    	{
    			System.out.println(u[i].getId());
    		    System.out.println(u[i].getName());
    	}
    }

}