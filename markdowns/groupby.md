# Java 8 – Java 8 - Streams Cookbook - groupby, join and grouping
 
The origins of this article were my original blog post [Java 8 - Streams Cookbook](https://www.javabullets.com/java-8-streams-cookbook/). This article provided a single main method and a number of different Streams examples. This post re-writes the article interactively using tech.io.

# Cookbook

The lists we are using is a list of Tour de France winners -

```java
public static final List<Winner> tdfWinners = Arrays.asList(
new Winner(2006, "Spain", "Óscar Pereiro", "Caisse d'Epargne–Illes Balears", 3657, Duration.parse("PT89H40M27S"), 8),
new Winner(2007, "Spain", "Alberto Contador", "Discovery Channel", 3570, Duration.parse("PT91H00M26S"), 4),
new Winner(2008, "Spain", "Carlos Sastre", "Team CSC", 3559, Duration.parse("PT87H52M52S"), 5),
new Winner(2009, "Spain", "Alberto Contador", "Astana", 3459, Duration.parse("PT85H48M35S"), 7),
new Winner(2010, "Luxembourg", "Andy Schleck", "Team Saxo Bank", 3642, Duration.parse("PT91H59M27S"), 12),
new Winner(2011, "Australia", "Cadel Evans", "BMC Racing Team", 3430, Duration.parse("PT86H12M22S"), 2),
new Winner(2012, "Great Britain", "Bradley Wiggins", "Team Sky", 3496, Duration.parse("PT87H34M47S"), 14),
new Winner(2013, "Great Britain", "Chris Froome", "Team Sky", 3404, Duration.parse("PT83H56M20S"), 14),
new Winner(2014, "Italy", "Vincenzo Nibali", "Astana", 3661, Duration.parse("PT89H59M06S"), 19),
new Winner(2015, "Great Britain", "Chris Froome", "Team Sky", 3360, Duration.parse("PT84H46M14S"), 16),
new Winner(2016, "Great Britain", "Chris Froome", "Team Sky", 3529, Duration.parse("PT89H04M48S"), 14 )
);
```

# groupingBy

The groupingBy method allows us to collect the results into a Map. In this case we are grouping liss of Tour de France winners by the winners name -

```java
// groupingby - make a map whose keys are names
Map<String, List<Winner>> namesVsWinner = com.javabullets.Winner.tdfWinners
		                                     .stream()
											 .collect(groupingBy(Winner::getName));
```

We can also collect Tour de France winners to csv -

```java
String allTDFWinnersTeamsCSV = com.javabullets.Winner.tdfWinners
		                                             .stream()
													 .map(Winner::getTeam)
													 .collect(joining(", "));
```

@[Groupby and Collect Example]({"stubs": ["src/main/java/com/javabullets/WinnersGroupby.java"], "command": "com.javabullets.WinnerTest#winnersGroupby"})


# Grouping

Grouping allows us to collect results according to a criteria.

For instance if we want to group Tour de France winners by Nationality then we would write -

```java
Map<String, List<Winner>> winnersByNationality = com.javabullets.Winner.tdfWinners
                                                    .stream()
													.collect(groupingBy(Winner::getNationality));
```

Or we can count the number of winners from each nationality -

```java
Map<String, Long> winsByNationalityCounting = com.javabullets.Winner.tdfWinners
                                                 .stream()
												 .collect(groupingBy(Winner::getNationality, counting()));
```

@[Grouping]({"stubs": ["src/main/java/com/javabullets/WinnersGrouping.java"], "command": "com.javabullets.WinnerTest#winnersGrouping"})

If you have liked this post, check out my personal blog which contains similar tutorials at [www.javabullets.com](http://www.javabullets.com). 

You can also provide me feedback at martin at javabullets.com