package Session8Prectice;

public class MinValueInArray {

	public static void main(String[] args) {
		int []arr={10,20,30,40,50};
		System.out.println("min:"+min(arr));
	}
	public static int min(int []arr)
	{
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min=Math.min(min, arr[i]);
		}
		return min;
	}
	public static void display(int []arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
