package exercise;
public class Pass10_2_5 {
	public static void main(String[] args) {
		String[] name = {"田中", "前田", "鈴木", "中村", "田辺", "浦川", "島田", "岩田"};
		int[] drinking = {7, 0, 3, 3, 2, 0, 0, 6};
		int[] smoking = {60, 10, 0, 20, 10, 0, 30, 0};
		for(int n = 0; n < name.length; n++)
			System.out.println(name[n] + check(drinking[n], smoking[n]));
	}
	private static String check(int d, int s){
		String set = "(" + d + ", " + s + ")\t";
		if(d == 0 && s == 0) set += "安全";
		else if(d == 0 && s >= 1 && s <= 20 || d >= 1 && d <= 3 && s == 0) set += "注意";
		else if(d >= 1 && d <= 3 && s >= 1 && s <= 20) set += "要指導";
		else if(d >= 4 || s >= 21) set += "要検査";
		return set;
	}
}
