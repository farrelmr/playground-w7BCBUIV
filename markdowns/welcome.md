# Java 8 – Streams Cookbook

The origins of this article were my original blog post [Java 8 - Streams Cookbook](https://www.javabullets.com/java-8-streams-cookbook/). This article provided a single main method and a number of different Streams examples. This post re-writes the article interactively using tech.io.

Streams in Java 8 provide a declarative approach to Collections. The simplest analogy is the your Collection is a water butt, and when you turn the tap(faucet) you create a stream which you can then process.

The advantages of Streams are – 

1. Declarative
2. Parallelisable
3. Reduced Boilerplate – internal iteration

The Stream operations are either –

1. Intermediate – return streams
2. Terminal – produce result

# Cookbook

This Java template lets you get started quickly with a simple working example using Maven and JUnit. If it is your first contribution then you should have a look at the [Getting Started](https://tech.io/doc/getting-started-create-playground) document.

@[Cookbook]({"stubs": ["src/main/java/com/javabullets/Winner.java"], "command": "com.javabullets.WinnerTest#test"})

test 


```java runnable
// { autofold
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

public static void main(String[] args) {

// }
		Date today = new Date();
		System.out.println("Note the time includes the default timezone - " + today.toString());

		Date twentySevenFeb2017Date = new Date(117, 1, 27);
		System.out.println("Now deprecated new Date(day, month, year) - but note month starts at zero, and year 1900 - " + twentySevenFeb2017Date);

		Calendar twentySevenFeb2017Calendar = new GregorianCalendar(2017,1,27);
		System.out.println("Calendar - month starts at zero, and but year fixed - " + twentySevenFeb2017Calendar.getTime());

		DateFormat ddMMyyySDF = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("DateFormat not ThreadSafe - " + ddMMyyySDF.format(twentySevenFeb2017Date));
//{ autofold
}

}
//}
```

test


```java runnable
// { autofold
import com.javabullets.Winner;
import java.time.Duration;
import java.util.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.*;

public class Main {

public static void main(String[] args) {

// }

        // Filter and Map -
        List<String> winnersOfToursLessThan3500km = Winner.tdfWinners
                                                        .stream()
                                                        .filter(d -> d.getLengthKm() < 3500) // Separate out Tours less than 3500km
                                                        .map(Winner::getName) // Get names of winners
                                                        .collect(toList()); // Return a list
        // Winners of Tours Less than 3500km - [Alberto Contador, Cadel Evans, Bradley Wiggins, Chris Froome, Chris Froome]        
        System.out.println("Winners of Tours Less than 3500km - " + winnersOfToursLessThan3500km);
		
//{ autofold
}

}
//}
```
test
If you have liked this post, check out my personal blog which contains similar tutorials at [www.javabullets.com](http://www.javabullets.com)

