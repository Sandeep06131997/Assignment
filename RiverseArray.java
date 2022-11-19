package Session8Prectice;

public class RiverseArray {

	public static void main(String[] args) 
	{
		int []arr={10,20,30,40,50};
		display(arr);
		System.out.println("riverse");
		reverse(arr,1,4);
		display(arr);
	}
	public static void  display(int []arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	public static void reverse(int []arr,int i,int j)
	{
		 j=arr.length-1;
		while(i<j)
		{
		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
		i++;
		j--;
		}
	}

}
