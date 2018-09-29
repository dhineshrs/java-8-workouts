## java-8-workouts

### New Features in Java 8 

1) Changes in Interface - Default and static methods
2) Functional Interface
3) Lambda Expressions
4) Method References
5) Stream API
6) Optional type

## 1) Changes in Interface - Default and static methods

## 2) Functional Interfaces
A functional interface is an interface that **contains only one abstract method**. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A functional interface **can have any number of default methods**. *Runnable, ActionListener, Comparable are some of the examples* of functional interfaces.
Before Java 8, we had to create **anonymous inner class objects or implement these interfaces**.

# @FunctionalInterface Annotation
**@FunctionalInterface** annotation is used to **ensure that the functional interface can’t have more than one abstract method**. In case more than one abstract methods are present, the **compiler flags an ‘Unexpected @FunctionalInterface annotation’** message. However, it is **not mandatory to use this annotation**.

# java.util.function Package:
The java.util.function package in Java 8 contains many builtin functional interfaces like

    1) Predicate: The Predicate interface has an abstract method test which gives a Boolean value as a result for the specified argument. 
                 Its prototype is
                 public Predicate {
                    public boolean test(T  t);
                  } 
        
    2) BinaryOperator: The BinaryOperator interface has an abstract method apply which takes two argument and returns a result of same                            type. Its prototype is
                      public interface BinaryOperator {
                            public T apply(T x, T y);
                      }  
**Important Points/Observations**
1. A functional interface has only one abstract method but it can have multiple default methods.
2. @FunctionalInterface annotation is used to **ensure an interface can’t have more than one abstract method**. The use of this             annotation is optional.
3. The java.util.function package contains many builtin functional interfaces in Java 8.

## Why you should embrace functional programming in Java 8
Java is **not a pure OOP language anymore**, but **a hybrid between OOP and functional programming** It's a game changer, and our OOP   mindset has to be changed to embrace these changes.
<br /> **But why should we embrace these changes?** Why should we use time and effort getting comfortable with the functional styles when we can solve the problems in pure OOP?

-	The functional styles introduced in Java 8, **helps us reduce the gap between the business logic and the code.** It allows them to **tell the story together in a natural flow on a higher level.** **Instead of saying how you want things done, you can say what you want done.
-	A lot of boilerplates can be removed, which results in cleaner and more concise code.
-	Higher-order functions allows us to:
    1. Send functions into other functions.
    2. Create functions inside other functions.
    3. Return functions from other functions.
-	Thanks to lambdas, we can now do lazy evaluations. When sending a lambda expression as a method argument, the java compiler will         evaluate it when it's called in the method. This is different from normal method arguments, which are evaluated straight away.
-	Lambda makes writing unit tests fun! It allows us to create lightweight unit tests that are clean, small and quick to write. We can     stub the code we're testing, using lambdas. This allows us to test how all sorts of scenarios will affect the code


## 3) Lambda Expressions
Java lambda expressions are new in Java 8. Java lambda expressions are Java's first step into functional programming. A Java lambda expression is thus a **function which can be created without belonging to any class**. A Java lambda expression can be passed around as if it was an object and executed on demand.

### Lambda Parameters
- Zero Parameters 
- One Parameter
- Multiple Parameters
- Parameter Types

## 5) Stream API
A stream represents a sequence of elements and supports different kind of operations to perform computations upon those elements:
  <br /> List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

  <br /> myList.stream()
      <br />    .filter(s -> s.startsWith("c"))
      <br />    .map(String::toUpperCase)
      <br />     .sorted()
      <br />     .forEach(System.out::println);
- *Stream operations are either* **intermediate or terminal**.
- **Intermediate operations** *return a stream so we can chain multiple intermediate operations** without using semicolons.
- **Terminal operations** are either void or return a non-stream result. 
- In the above example **filter, map and sorted are intermediate operations** whereas forEach is a terminal operation.
- Such a chain of stream operations as seen in the example above is also known as **operation pipeline**

Most stream operations accept some kind of lambda expression parameter, a functional interface specifying the exact behavior of the operation. Most of those operations must be both **non-interfering and stateless**. What does that mean?
<br />  A function is non-interfering when it does not modify the underlying data source of the stream, e.g. in the above example no lambda expression does modify myList by adding or removing elements from the collection.
<br /> A function is stateless when the execution of the operation is deterministic, e.g. in the above example no lambda expression depends on any mutable variables or states from the outer scope which might change during execution.

### Different kind of streams
Streams can be created from various data sources, especially collections. Lists and Sets support new methods stream() and parallelStream() to either create a sequential or a parallel stream. **Parallel streams are capable of operating on multiple threads**
