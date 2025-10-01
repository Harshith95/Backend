package LeetCode.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TenthLine {
	public static void main(String[] args) {
		String str = readFile();
		System.out.println("Str::" + str);
	}

	private static String readFile() {
		BufferedReader buff = null;
		String line = "";
		try {
			buff = Files.newBufferedReader(Paths.get("D:\\Work\\Workspace\\DataStruct\\src\\resources\\Tenline.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int i = 0;

		try {
			while ((line = buff.readLine()) != null) {
				i++;
				if (i == 10) {
					return line;
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;

	}
}
