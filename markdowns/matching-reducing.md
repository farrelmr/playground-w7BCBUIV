# Java 8 - Streams Cookbook - Matching and Reducing
 
The origins of this article were my original blog post [Java 8 - Streams Cookbook](https://www.javabullets.com/java-8-streams-cookbook/). This article provided a number of examples using Java 8 Streams from the original article, and allows them to be run using tech.io.

# Base List

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

# Matching

Matching allows you to apply a filter, then select which result to return.

In this example we return any result that meets our filter criteria using the findAny method -

```java
Optional<Winner> winner2012 = com.javabullets.Winner.tdfWinners
                                .stream()
    						    .filter(w -> w.getName().contains("Wiggins"))
								.findAny();
// winner2012 - Bradley Wiggins
System.out.println("winner2012 - " + winner2012.get());
```

We can also use findFirst to return the first record meeting this criteria - 

```java
Optional<Integer> winnerYear2014 = com.javabullets.Winner.tdfWinners
		                              .stream()
									  .map(Winner::getYear)
									  .filter(x -> x == 2014)
									  .findFirst();
// winnerYear2014 - 2014
System.out.println("winnerYear2014 - " + winnerYear2014.get());
```

# Matching Example

@[Matching Example]({"stubs": ["src/main/java/com/javabullets/WinnersMatching.java"], "command": "com.javabullets.WinnerTest#winnersMatching"})


# Reducing

Reducing takes a stream of values and outputs a single value.

In the first example we are processing the stream() to return the total distance of all the Tour de France's in the tdfWinners List. The summation is done using reduce(0, Integer::sum) -

```java
// reducing - 0 --> initial value
int totalDistance = com.javabullets.Winner.tdfWinners
                       .stream()
					   .map(Winner::getLengthKm)
					   .reduce(0, Integer::sum);
// totalDistance - 38767
System.out.println("totalDistance - " + totalDistance);
```

In the fastestWinner example we use a Comparator to compare average speeds to determine the fastest Tour de France -

```java
Optional<Winner> fastestWinner = com.javabullets.Winner.tdfWinners
		                            .stream()
									.min(Comparator.comparingDouble(Winner::getAveSpeed));
System.out.println("fastestTDF - " + fastestWinner.get());
```

There are also shorthand utility methods for the reducing action -

```java
.mapToDouble(Winner::getAveSpeed).min()
```

@[Reducing Example]({"stubs": ["src/main/java/com/javabullets/WinnersReducing.java"], "command": "com.javabullets.WinnerTest#winnersReducing"})


If you have liked this post, check out my personal blog which contains similar tutorials at [www.javabullets.com](http://www.javabullets.com). 

You can also provide me feedback at martin at javabullets.com
