class Program1
{
	public static void accesscell(int arr[],int index)
	{
		System.out.println("Access value of selected index is : "+arr[index]);
	}

	public static void insertelement(int arr[],int index,int valueToBeInserted)
	{
		arr[index]=valueToBeInserted;
		System.out.println("Inserted value : "+arr[index]);
	}

	public static void traverseArray(int arr[])
	{
		System.out.println("traverseArray : ");

		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("main() starts....");
		int arr[]={10,20,30,40,50};
		traverseArray(arr);
		accesscell(arr,3);
		insertelement(arr,4,5);
		System.out.println("main() ends.....");
	}
}