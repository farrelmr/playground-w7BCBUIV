# Java 8 – Streams Cookbook
 
The origins of this article were my original blog post [Java 8 - Streams Cookbook](https://www.javabullets.com/java-8-streams-cookbook/). This article provided a number of examples using Java 8 Streams from the original article, and allows them to be run using tech.io.

Streams in Java 8 provide a declarative approach to Collections. The simplest analogy is the your Collection is a water butt, and when you turn the tap(faucet) you create a stream which you can then process.

The advantages of Streams are – 

1. Declarative
2. Parallelisable
3. Reduced Boilerplate – internal iteration

The Stream operations are either –

1. Intermediate – return streams
2. Terminal – produce result

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

# Filter And Map

There are 3 steps in converting the tdfWinners list to a list of winners of tours greater than or less than 3500km -

* filter - Here we use a lambdas - for less than -

```java
filter(d -> d.getLengthKm() < 3500)
```

* filter - Here we use a lambdas - for more than -

```java
.filter(d -> d.getLengthKm() >= 3500)
```

* We then use the map method and collect method to store to a list


@[Winners Of Tours Greater Than or Less Than 3500km long]({"stubs": ["src/main/java/com/javabullets/WinnersOfToursGreaterOrLessThan3500km.java"], "command": "com.javabullets.WinnerTest#winnersOfToursGreaterOrLessThan3500km"})

# Limit, Distinct and Skip

* limit - limit the number of records to be returned
* distinct - only return distinct records
* skip - skip every n records

@[Limit, Distinct and Skip]({"stubs": ["src/main/java/com/javabullets/WinnersLimitDistinctSkip.java"], "command": "com.javabullets.WinnerTest#winnersLimitDistinctSkip"})


If you have liked this post, check out my personal blog which contains similar tutorials at [www.javabullets.com](http://www.javabullets.com). 

You can also provide me feedback at martin at javabullets.com
