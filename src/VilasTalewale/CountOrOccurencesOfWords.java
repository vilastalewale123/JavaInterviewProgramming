package VilasTalewale;

import java.util.HashMap;
import java.util.Map;

public class CountOrOccurencesOfWords {

	public static void main(String[] args) {
		String str = "I am learning learning java java java programming";
		
		String [] strArray = str.split(" ");
		
		System.out.println(strArray.toString());
		int count = 0;
		String ch;
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<strArray.length;i++) {
			ch = strArray[i];
			if(map.containsKey(ch)) {
				count = map.get(ch);
				map.put(ch, ++count);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(String item : map.keySet()) {
			System.out.println("count of words:"+item+"="+map.get(item));
		}
	}

}
