package Session8Prectice;

public class RotationNumber {

	public static void main(String[] args) {
		System.out.println(count(12345));
		System.out.println(rotation(1234567,2));
	}
	public static int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public static int rotation(int num,int rot)
	{
		int cod=count(num);
		rot=rot%cod;
		if(rot<0)
			rot+=cod;
		int ans=num;
		for (int i = 0; i < rot; i++) {
			int rem=num%10;
			ans=(rem*(int)Math.pow(10, cod-1))+(num/10);
			num=ans;
			
		}
		return ans;
		
	}
	

}
