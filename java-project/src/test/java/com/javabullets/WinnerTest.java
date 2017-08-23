package com.javabullets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class WinnerTest {

	@Test
	public void test() throws FileNotFoundException {
//		try {
//			Winner.runExamples();
//			success(true);
//		} catch (AssertionError ae) {
//			success(false);
//			msg("Oops! 🐞", ae.getMessage());
//			msg("Hint 💡", "Did you properly accumulate all stars into 'totalStars'? 🤔");
//		}
	}

	private static void msg(String channel, String msg) {
		System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
	}

	private static void success(boolean success) {
		System.out.println(String.format("TECHIO> success %s", success));
	}

	// check if a string exists in a text file
	private static boolean existsInFile(String str, File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		try {
			while (scanner.hasNextLine()) {
				if (scanner.nextLine().contains(str))
					return true;
			}
			return false;
		} finally {
			scanner.close();
		}
	}
}