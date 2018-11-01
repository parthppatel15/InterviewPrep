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
	
	
	
}
