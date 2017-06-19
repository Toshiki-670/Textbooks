package exercise;

import lib.Input;

public class Ex10_5 {
	public static void main(String[] args){
		int mul3 = 0;
		int elses = 0;
		int date;
		while((date = Input.getInt()) != 0)
			if(date % 3 == 0)
				mul3++;
			else
				elses++;
		System.out.println("3の倍数=" + mul3);
		System.out.println("その他=" + elses);
	}
}
