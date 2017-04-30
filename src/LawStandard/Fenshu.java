package LawStandard;


import java.util.ArrayList;
import java.util.List;


public class Fenshu {
	public static String ji = "零一二三四五六七八九十百";
	public static List<String> fen(String[] nums )
	{
		List<String> result = new ArrayList<>();
		int i = 0;
		int j=0;
		int length = nums.length;
		while(i < length)    
		{	
			if(j>100){
				return null;
			}
			j++;
			
			
			if(!ji.contains(nums[i]))
			{
				i = i+1;
				continue;
			}
			if( !nums[i].equals("百") && !nums[i].equals("十") && !nums[i].equals("零"))
			{
				if(i+1 < length && !ji.contains(nums[i+1]) && !nums[i+1].equals("条"))
				{
					i = i+2;
					continue;
				}
				
				if(i+1 == length)
				{
					result.add(nums[i]);
					break;
					
				}
				//浜屼簩
				if(i+1 < length && !nums[i+1].equals("百") && !nums[i+1].equals("十") && !nums[i+1].equals("零"))
				{
					result.add(nums[i]);
					i++;
					continue;
				}
				//浜屽崄****
				if(i+1 < length && nums[i+1].equals("十"))
				{
					if(i+2 < length && nums[i+2].equals("条"))
					{
						result.add(nums[i] + nums[i+1]);
						i = i+3;
						continue;
					}
					//浜屽崄
					if(i+2 == length)
					{
						result.add(nums[i] + nums[i+1]);
						break;
					}
					//浜屽崄浜�***
					if(i+2 < length && !nums[i+2].equals("百") && !nums[i+2].equals("十") && !nums[i+2].equals("零"))
					{
						//浜屽崄浜�
						if(i+3 == length)
						{
							result.add(nums[i]+nums[i+1]+nums[i+2]);
							break;
						}
						
						//浜屽崄浜屽崄***||浜屽崄浜岀櫨***
						if(i+3 < length && (nums[i+3].equals("百") ||nums[i+3].equals("十")))
						{
							result.add(nums[i]+nums[i+1]);
							i = i+2;
							continue;
						}
						//浜屽崄浜屼簩****
						if( i+3 < length && !nums[i+3].equals("百") && !nums[i+3].equals("十") && !nums[i+3].equals("零"))
						{
							result.add(nums[i]+nums[i+1]+nums[i+2]);
							i = i+3;
							continue;
						}
					}
					
				}
				//浜岀櫨*****
				if(i+1 < length && nums[i+1].equals("百"))
				{
					//浜岀櫨
					if(i+2 ==length )
					{
						result.add(nums[i]+nums[i+1]);
						break;
					}
					//浜岀櫨鍗�**
					if( i+2 < length && nums[i+2].equals("十"))
					{
						result.add(nums[i]+nums[i+1]);
						i = i+2;
						continue;
					}
					//浜岀櫨闆�***
					if(i+2 < length && nums[i+2].equals("零"))
					{
						result.add(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]);
						i = i+4;
						continue;
					}
					//浜岀櫨浜�|| 浜岀櫨浜岀櫨 || 浜岀櫨浜屼簩
					if(i+2 < length && (i+3 ==length || nums[i+3].equals("百") || (!nums[i+3].equals("百") && !nums[i+3].equals("十") && !nums[i+3].equals("零"))))
					{
						result.add(nums[i] + nums[i+1]);
						i = i+2;
						continue;
					}
					//浜岀櫨浜屽崄****
					if(i+2<length && i+3 < length && nums[i+3].equals("十"))
					{
						if(i+4 < length && nums[i+4].equals("条"))
						{
							result.add(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]);
							i = i+5;
							continue;
						}
						
						//浜岀櫨浜屽崄
						if( i+4 == length )
						{
							result.add(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]);
							break;
						}
						if(i+4 < length )
						{
							result.add(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]+nums[i+4]);
							i = i + 5;
							continue;
						}
					}
					
				}
				
			}
			//鍗�**
			if(nums[i].equals("十"))
			{
				
				if(i+1 < length && nums[i+1].equals("条"))
				{
					result.add(nums[i]);
					i = i+2;
					continue;
				}
				if(i+1 < length && !ji.contains(nums[i+1]) && !nums[i+1].equals("条"))
				{
					i = i+2;
					continue;
				}
				//鍗�
				if( i+1 == length)
				{
					result.add(nums[i]);
					break;
				}
				//鍗佸崄****
				if(i+1 < length && nums[i+1].equals("十"))
				{
					result.add(nums[i]);
					i = i+1;
					continue;
				}
				//鍗佷簩***
				if(i+1 < length && !nums[i+1].equals("百") && !nums[i+1].equals("十") && !nums[i+1].equals("零"))
				{
					//鍗佷簩
					if(i+2 == length)
					{
						result.add(nums[i] + nums[i+1]);
						break;
					}
					//鍗佷簩浜�***
					if(i+2 < length && !nums[i+2].equals("百") && !nums[i+2].equals("十") && !nums[i+2].equals("零"))
					{
						result.add(nums[i] + nums[i+1]);
						i = i+2;
						continue;
					}
					//鍗佷簩鍗�***
					if(i+2 < length && nums[i+2].equals("十"))
					{
						result.add(nums[i] + nums[i+1]);
						i = i+2;
						continue;
					}
					
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String[] temp = "零五条第二十条".split("");
		System.out.println(fen(temp));
	}

}


