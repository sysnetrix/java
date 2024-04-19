# Hello world with Java :coffee:

This is a **"Hello world"** program code written in **Java** programming language.

## Source code

This is the source code of the program:

```java
public class HelloWorld 
{
  public static void main(String[] args) 
  {
    System.out.format("%s", helloWorld());
  }

  public static String helloWorld()
  {
    String helloWorld = "Hello world!";
    return helloWorld;
  }
}
```

Notice that `System.out.format("%s", helloWorld());` prints the string `"Hello world!"` on the screen.
It is simply calling the method **helloWorld()** which return the string Hello world! and it prints it to the screen.
