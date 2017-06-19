package exercise;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import lib.Input;
public class Pass10_2_2 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> list = new LinkedHashMap<>();
		list.put(500, 1000);
		list.put(100, 700);
		list.put(50, 500);
		list.put(0, 300);
		int input = Input.getInt();
		for(Entry<Integer, Integer> e : list.entrySet()){
			if(input >= e.getKey()){
				System.out.println(e.getValue());break;
			}
		}
	}
}
