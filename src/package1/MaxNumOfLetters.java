package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxNumOfLetters 
{

	private int findMaxOccurance(String s) {
		char[] ch = s.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<ch.length;i++)
		{
			map.put(ch[i], map.getOrDefault(ch[i],0)+1);
		}
		System.out.println(map);
		List<Integer> list = new ArrayList<>();
		for(Map.Entry<Character,Integer> e : map.entrySet())
		{
			list.add(e.getValue());
		}
		Collections.sort(list);
		int max = list.get(list.size()-1);
		return max;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(findMaxOccurance("vrowrqt"), 2);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(findMaxOccurance("abcde"), 1);
	}

}
