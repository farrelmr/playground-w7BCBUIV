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

@[Cookbook]({"stubs": ["src/main/java/com/yourself/Winner.java"], "command": "com.yourself.WinnerTest#test"})

If you have liked this post, check out my personal blog which contains similar tutorials at [www.javabullets.com](http://www.javabullets.com)