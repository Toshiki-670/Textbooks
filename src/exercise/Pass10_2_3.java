package exercise;
import lib.Input;
public class Pass10_2_3 {
	public static void main(String[] args) {
		int in;
		while((in = Input.getInt()) != 0){
			String out = "?";
			if(in == 12 || in == 1 || in == 2)	out = "冬";
			else if(in >= 3 && in <= 5)			out = "春";
			else if(in >= 6 && in <= 8)			out = "夏";
			else if(in >= 9 && in <= 11)		out = "秋";
			System.out.println(out);
		}
	}
}
