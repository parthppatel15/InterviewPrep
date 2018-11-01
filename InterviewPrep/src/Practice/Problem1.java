package Practice;

public class Problem1 
{
	public int[] nums;
	public int target; 
	
	public int[] twoSums(int[] nums, int target)
	{
		int[] index = {0,1}; 
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = i + 1; j < nums.length; j++)
			{
				if(nums[i] + nums[j] == target)
				{
					index[0] = i;
					index[1] = j; 
					break;
				}
				 
			}
		}
		return index;
		
	}
	
	public static void main(String[] args)
	{
		Problem1 test = new Problem1();
		int testarr[] = {1,4,5,7};
		int	target = 6;
		int[] total = test.twoSums(testarr, target);
		for(int i = 0; i <total.length;i++)
		{
			System.out.println(total[i]);
		}
		
		
	}
	
}
