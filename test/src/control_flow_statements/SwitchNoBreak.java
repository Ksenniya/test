package control_flow_statements;

import java.util.ArrayList;

public class SwitchNoBreak {

	public static void main(String[] args) {
		int month = 9;
		String monthString = "";
		ArrayList<String> list = new ArrayList();
		switch (month) {
		case 1:
			list.add("1");
		case 2:
			list.add("2");
		case 3:
			list.add("3");
		case 4:
			list.add("4");
		case 5:
			list.add("5");
		case 6:
			list.add("6");
		case 7:
			list.add("7");
		case 8:
			list.add("8");
		case 9:
			list.add("9");
		case 10:
			list.add("10");
			break;
		default:
			break;
		}
		if (list.isEmpty()) {
			System.out.println("empty list");
		} else {
			for (String i : list) {
				System.out.println(i);
			}
		}
	}
}
