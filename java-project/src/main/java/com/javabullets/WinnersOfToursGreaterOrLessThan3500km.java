package com.javabullets;
// { autofold
import java.time.Duration;
import java.util.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.*;

public class WinnersOfToursGreaterOrLessThan3500km {
// }
    public void winnersOfToursGreaterOrLessThan3500km() {


        // Filter and Map -
        List<String> winnersOfToursLessThan3500km = com.javabullets.Winner.tdfWinners
                                                        .stream()
                                                        .filter(d -> d.getLengthKm() < 3500) // Separate out Tours less than 3500km
                                                        .map(Winner::getName) // Get names of winners
                                                        .collect(toList()); // Return a list

        // Winners of Tours Less than 3500km - [Alberto Contador, Cadel Evans, Bradley Wiggins, Chris Froome, Chris Froome]        
        System.out.println("Winners of Tours Less than 3500km - " + winnersOfToursLessThan3500km);
		
        List<String> winnersOfToursGreaterThan3500km = com.javabullets.Winner.tdfWinners
                                                         .stream()
                                                         .filter(d -> d.getLengthKm() >= 3500)
                                                         .map(Winner::getName)
                                                         .collect(toList());
        // Winners of Tours Greater than 3500km - [Óscar Pereiro, Alberto Contador, Carlos Sastre, Andy Schleck, Vincenzo Nibali, Chris Froome]
        System.out.println("Winners of Tours Greater than 3500km - " + winnersOfToursGreaterThan3500km);
    }
// { autofold
}
// }
