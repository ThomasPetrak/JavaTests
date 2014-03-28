package test;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> name = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++)
			name.add(20 + 4 * i);

		for (int num : name)
			System.out.println(num);
		System.out.println(name.get(0));
	}

}
