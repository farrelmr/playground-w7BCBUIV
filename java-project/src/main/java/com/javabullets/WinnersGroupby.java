package com.javabullets;
// { autofold
import java.time.Duration;
import java.util.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.*;

public class WinnersGroupby {
// }
    public void winnersGroupby() {
        // groupingby - make a map whose keys are names
        Map<String, List<Winner>> namesVsWinner = com.javabullets.Winner.tdfWinners
		                                             .stream()
													 .collect(groupingBy(Winner::getName));
        // namesVsWinner - {Bradley Wiggins=[Bradley Wiggins], Carlos Sastre=[Carlos Sastre], Cadel Evans=[Cadel Evans], Óscar Pereiro=[Óscar Pereiro], Chris Froome=[Chris Froome, Chris Froome, Chris Froome], Andy Schleck=[Andy Schleck], Alberto Contador=[Alberto Contador, Alberto Contador], Vincenzo Nibali=[Vincenzo Nibali]}
        System.out.println("namesVsWinner - " + namesVsWinner);
		
        // join strings
        String allTDFWinnersTeamsCSV = com.javabullets.Winner.tdfWinners
		                                             .stream()
													 .map(Winner::getTeam)
													 .collect(joining(", "));
        // allTDFWinnersTeams Caisse d'Epargne–Illes Balears, Discovery Channel, Team CSC, Astana, Team Saxo Bank, BMC Racing Team, Team Sky, Team Sky, Astana, Team Sky, Team Sky
        System.out.println("allTDFWinnersTeams " + allTDFWinnersTeamsCSV);
	}
// { autofold
}
// }
