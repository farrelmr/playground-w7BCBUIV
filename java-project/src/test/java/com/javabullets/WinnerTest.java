package com.javabullets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class WinnerTest {

	@Test
	public void winnersOfToursGreaterOrLessThan3500km() {
		WinnersOfToursGreaterOrLessThan3500km winnersOfToursGreaterOrLessThan3500km = new WinnersOfToursGreaterOrLessThan3500km();
		winnersOfToursGreaterOrLessThan3500km.winnersOfToursGreaterOrLessThan3500km();
	}
	
	@Test
	public void winnersLimitDistinctSkip() {
		WinnersLimitDistinctSkip winnersLimitDistinctSkip = new WinnersLimitDistinctSkip();
		winnersLimitDistinctSkip.winnersLimitDistinctSkip();
	}	
	
	@Test
	public void winnersMatching() {
		WinnersMatching winnersMatching = new WinnersMatching();
		winnersMatching.winnersMatching();
	}
	
	@Test
	public void winnersReducing() {
		WinnersReducing winnersReducing = new WinnersReducing();
		winnersReducing.winnersReducing();
	}
	
	@Test
	public void winnersGroupby() {
		WinnersGroupby winnersGroupby = new WinnersGroupby();
		winnersGroupby.winnersGroupby();
	}	
	
	@Test
	public void winnersGrouping() {
		WinnersGrouping winnersGrouping = new WinnersGrouping();
		winnersGrouping.winnersGrouping();
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