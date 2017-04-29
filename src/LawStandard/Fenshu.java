package LawStandard;


import java.util.ArrayList;
import java.util.List;

public class Fenshu {
	public static String ji = "零一二三四五六七八九十百";
	public static List<String> fen(String[] nums )
	{
		List<String> result = new ArrayList<>();
		int i = 0;
		int length = nums.length;
		while(i < length)    
		{	//二*****    
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
				//二
				if(i+1 == length)
				{
					result.add(nums[i]);
					break;
					
				}
				//二二
				if(i+1 < length && !nums[i+1].equals("百") && !nums[i+1].equals("十") && !nums[i+1].equals("零"))
				{
					result.add(nums[i]);
					i++;
					continue;
				}
				//二十****
				if(i+1 < length && nums[i+1].equals("十"))
				{
					if(i+2 < length && nums[i+2].equals("条"))
					{
						result.add(nums[i] + nums[i+1]);
						i = i+3;
						continue;
					}
					//二十
					if(i+2 == length)
					{
						result.add(nums[i] + nums[i+1]);
						break;
					}
					//二十二****
					if(i+2 < length && !nums[i+2].equals("百") && !nums[i+2].equals("十") && !nums[i+2].equals("零"))
					{
						//二十二
						if(i+3 == length)
						{
							result.add(nums[i]+nums[i+1]+nums[i+2]);
							break;
						}
						
						//二十二十***||二十二百***
						if(i+3 < length && (nums[i+3].equals("百") ||nums[i+3].equals("十") ))
						{
							result.add(nums[i]+nums[i+1]);
							i = i+2;
							continue;
						}
						//二十二二****
						if( i+3 < length && !nums[i+3].equals("百") && !nums[i+3].equals("十") && !nums[i+3].equals("零"))
						{
							result.add(nums[i]+nums[i+1]+nums[i+2]);
							i = i+3;
							continue;
						}
					}
					
				}
				//二百*****
				if(i+1 < length && nums[i+1].equals("百"))
				{
					//二百
					if(i+2 ==length )
					{
						result.add(nums[i]+nums[i+1]);
						break;
					}
					//二百十***
					if( i+2 < length && nums[i+2].equals("十"))
					{
						result.add(nums[i]+nums[i+1]);
						i = i+2;
						continue;
					}
					//二百零****
					if(i+2 < length && nums[i+2].equals("零"))
					{
						result.add(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]);
						i = i+4;
						continue;
					}
					//二百二 || 二百二百 || 二百二二
					if(i+2 < length && (i+3 ==length || nums[i+3].equals("百") || (!nums[i+3].equals("百") && !nums[i+3].equals("十") && !nums[i+3].equals("零"))))
					{
						result.add(nums[i] + nums[i+1]);
						i = i+2;
						continue;
					}
					//二百二十****
					if(i+2<length && i+3 < length && nums[i+3].equals("十") )
					{
						if(i+4 < length && nums[i+4].equals("条"))
						{
							result.add(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]);
							i = i+5;
							continue;
						}
						
						//二百二十
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
			//十***
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
				//十
				if( i+1 == length)
				{
					result.add(nums[i]);
					break;
				}
				//十十****
				if(i+1 < length && nums[i+1].equals("十"))
				{
					result.add(nums[i]);
					i = i+1;
					continue;
				}
				//十二***
				if(i+1 < length && !nums[i+1].equals("百") && !nums[i+1].equals("十") && !nums[i+1].equals("零"))
				{
					//十二
					if(i+2 == length)
					{
						result.add(nums[i] + nums[i+1]);
						break;
					}
					//十二二****
					if(i+2 < length && !nums[i+2].equals("百") && !nums[i+2].equals("十") && !nums[i+2].equals("零"))
					{
						result.add(nums[i] + nums[i+1]);
						i = i+2;
						continue;
					}
					//十二十****
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
		String[] temp = "中华人民共的还是电脑的三十八条".split("");
		System.out.println(fen(temp));
	}

}


