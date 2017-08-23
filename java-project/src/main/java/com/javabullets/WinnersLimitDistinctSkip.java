package com.javabullets;
// { autofold
import java.time.Duration;
import java.util.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.*;

public class WinnersLimitDistinctSkip {
// }
    public void winnersLimitDistinctSkip() {
        // limit -
        List<Winner> winnerObjectsOfToursLessThan3500kmLimit2 = tdfWinners
                                                                  .stream()
                                                                  .filter(d -> d.getLengthKm() < 3500)
                                                                  .limit(2)
                                                                  .collect(toList());
        // winnerObjectsOfToursLessThan3500kmLimit2 [Alberto Contador, Cadel Evans]
        System.out.println("winnerObjectsOfToursLessThan3500kmLimit2 " + winnerObjectsOfToursLessThan3500kmLimit2);
        
        List<String> firstTwoWinnersOfToursLessThan3500km = tdfWinners
                                                              .stream()
                                                              .filter(d -> d.getLengthKm() < 3500)
                                                              .map(Winner::getName)
                                                              .limit(2)
                                                              .collect(toList());
        // firstTwoWinnersOfToursLessThan3500km - [Alberto Contador, Cadel Evans]
        System.out.println("firstTwoWinnersOfToursLessThan3500km - " + firstTwoWinnersOfToursLessThan3500km);
        // filter by distinct
        List<String> distinctTDFWinners = tdfWinners
                                             .stream()
                                             .map(Winner::getName)
                                             .distinct()
                                             .collect(toList());
        System.out.println("distinctTDFWinners - " + distinctTDFWinners);
        
        
        long numberOfDistinceWinners = tdfWinners
                                          .stream()
                                          .map(Winner::getName)
                                          .distinct()
                                          .count();
        // numberOfDistinceWinners - 8
        System.out.println("numberOfDistinceWinners - " + numberOfDistinceWinners);
        
        // skip records
        List<Winner> skipEveryOtherTDFWinner = tdfWinners
                                                 .stream()
                                                 .skip(2)
                                                 .collect(toList());
        // skipEveryOtherTDFWinner - [Carlos Sastre, Alberto Contador, Andy Schleck, Cadel Evans, Bradley Wiggins, Chris Froome, Vincenzo Nibali, Chris Froome, Chris Froome]
        System.out.println("skipEveryOtherTDFWinner - " + skipEveryOtherTDFWinner);
    }
// { autofold
}
// }
