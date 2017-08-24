package com.javabullets;
// { autofold
import java.time.Duration;
import java.util.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.*;

public class WinnersGrouping {
// }
    public void winnersGrouping() {
        // grouping
        Map<String, List<Winner>> winnersByNationality = com.javabullets.Winner.tdfWinners
		                                                    .stream()
															.collect(groupingBy(Winner::getNationality));
        // winnersByNationality - {Great Britain=[Bradley Wiggins, Chris Froome, Chris Froome, Chris Froome], Luxembourg=[Andy Schleck], Italy=[Vincenzo Nibali], Australia=[Cadel Evans], Spain=[Óscar Pereiro, Alberto Contador, Carlos Sastre, Alberto Contador]}
        System.out.println("winnersByNationality - " + winnersByNationality);
		
        Map<String, Long> winsByNationalityCounting = com.javabullets.Winner.tdfWinners
		                                                 .stream()
														 .collect(groupingBy(Winner::getNationality, counting()));
        // winsByNationalityCounting - {Great Britain=4, Luxembourg=1, Italy=1, Australia=1, Spain=4}
        System.out.println("winsByNationalityCounting - " + winsByNationalityCounting);
	}
// { autofold
}
// }
