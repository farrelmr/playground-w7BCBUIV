package com.javabullets;
// { autofold
import java.time.Duration;
import java.util.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.*;

public class WinnersMatching {
// }
    public void winnersMatching() {
        // matching - allMatch, noneMatch
        Optional<Winner> winner2012 = com.javabullets.Winner.tdfWinners
		                                  .stream()
										  .filter(w -> w.getName().contains("Wiggins"))
										  .findAny();
        // winner2012 - Bradley Wiggins
        System.out.println("winner2012 - " + winner2012.get());
        
        Optional<Integer> winnerYear2014 = com.javabullets.Winner.tdfWinners
		                                       .stream()
											   .map(Winner::getYear)
											   .filter(x -> x == 2014)
										       .findFirst();
        // winnerYear2014 - 2014
        System.out.println("winnerYear2014 - " + winnerYear2014.get());
	}
// { autofold
}
// }
