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




