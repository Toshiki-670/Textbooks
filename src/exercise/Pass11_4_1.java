package exercise;
import java.util.HashMap;
import lib.Input;
public class Pass11_4_1 {
	public static void main(String[] args){
		HashMap<String,Integer> codeList = new HashMap<>();//Product code, Yen
		codeList.put("a100", 100);
		codeList.put("a110", 200);
		codeList.put("b100", 100);
		codeList.put("b110", 200);
		codeList.put("b120", 200);
		codeList.put("c100", 300);
		codeList.put("c110", 300);
		codeList.put("d100", 400);
		int count = Input.getInt("商品の数量");
		String code = Input.getString("商品コード");
		int yen = codeList.containsKey(code) ? codeList.get(code) : 500;// get Yen from ProductCodeList
		System.out.println("合計金額=" + (count * yen) + "円");
	}
}
