package VilasTalewale;
import java.util.*;
public class FindDuplicateCharacters {

	public static void main(String[] args) {
		String str = "laptop";
		
		char ch[] = str.toCharArray();
		int count = 0;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++) {
			
			if(map.containsKey(ch[i])) {
				count = map.get(ch[i]);
				map.put(ch[i], ++count);
			}else {
				map.put(ch[i], 1);
			}
		}

		for(Character c: map.keySet()) {
			if(map.get(c)> 1) {
				System.out.println(c+":"+map.get(c));
			}
		}
	}

}
