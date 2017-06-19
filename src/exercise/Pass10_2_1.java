package exercise;
import java.util.HashMap;
import lib.Input;
public class Pass10_2_1 {
	public static void main(String[] args){
		HashMap<String,String> pair = new HashMap<>();//順序のない集合、連想配列
		pair.put("dog"   , "いぬ");
		pair.put("cat"   , "ねこ");
		pair.put("mouse" , "ねずみ");
		pair.put("rabbit", "うさぎ");
		String input;
		while((input = Input.getString()) != null)
			System.out.println(pair.containsKey(input) ? pair.get(input) : '?');//pairに含まれていたらそれを、でなければ？を
	}
}
