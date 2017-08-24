package com.javabullets;
// { autofold
import java.time.Duration;
import java.util.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.*;

public class WinnersReducing {
// }
    public void winnersReducing() {
        // reducing - 0 --> initial value
        int totalDistance = com.javabullets.Winner.tdfWinners
		                       .stream()
							   .map(Winner::getLengthKm)
							   .reduce(0, Integer::sum);
        // totalDistance - 38767
        System.out.println("totalDistance - " + totalDistance);
        
        Optional<Integer> shortestYear = com.javabullets.Winner.tdfWinners
		                                    .stream()
											.map(Winner::getLengthKm)
											.reduce(Integer::min);
        // shortestYear - 3360
        System.out.println("shortestYear - " + shortestYear.get());
        
        Optional<Integer> longestYear = com.javabullets.Winner.tdfWinners
		                                   .stream()
										   .map(Winner::getLengthKm)
										   .reduce(Integer::max);
        // longestYear - 3661
        System.out.println("longestYear - " + longestYear.get());
        
        Optional<Winner> fastestWinner = com.javabullets.Winner.tdfWinners
		                                    .stream()
											.min(Comparator.comparingDouble(Winner::getAveSpeed));
        System.out.println("fastestTDF - " + fastestWinner.get());
        
        // shorthand
        OptionalDouble fastestTDF = com.javabullets.Winner.tdfWinners
		                                    .stream()
											.mapToDouble(Winner::getAveSpeed).min();
        // fastestTDF - 39.0
        System.out.println("fastestTDF - " + fastestTDF.getAsDouble());
	}
// { autofold
}
// }
