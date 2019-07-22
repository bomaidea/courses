# course 1 - java

In this course you will learn the basics of coding, we are going 
to practice with java, beacuse is a C-Like programming language.
Java is also a Multi-Platform programming language so it can be
runned under Linux, Mac OS X and Microsoft Windows.

Before start learing to code, is important to understand how to 
basically use java.

## set 1 - preparing for java

You have to install java, there are two kind of java installation, 

- JRE - Java Runtime Environment:
This is required for run java programs.
- JDK - Java Development Kit:  
This is requried for develop java programs. (it does include JRE)

For install them you must to go on the Java Page in Oracle offical
website, download them and instal them.

After you had installed them open a shell and write the following
command, that should return an output similar as bellow.

```sh
user@host:~$ java -version
openjdk version "11.0.3" 2019-04-16
OpenJDK Runtime Environment (build 11.0.3+7-Ubuntu-1ubuntu219.04.1)
OpenJDK 64-Bit Server VM (build 11.0.3+7-Ubuntu-1ubuntu219.04.1, mixed mode, sharing)
user@host:~$ javac -version
javac 11.0.3
```

If those are good, create a file `HelloWorld.java` with vim.
Then write in it the following code:

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```

In the first line of code you can see 3 words, one is `public` this
means that the program is public and it can be executed from your 
computer. But we will se it better in the next sets.  
Then there is the word `class` in java for the moment it will means
you that is a program.  
And the last word if you look it twice, you will notice that is the
firt part of the program. It have to be like this, otherwise you will
get an error after. Then you see that there is a `{` this means that 
it will be followed by a code block. 

The code block is delimited by `{}` and is indented, this mean that 
befor each line inside it is one tab right. This is a good practice
that you will see by every coder, because it makes the code more 
readable.

Then there is an other line, with `public` this has the same meaning 
as above.  
The is `static` that for the moment you must to take as it is.  
Then there is `void` that means that is a method, so is a code block.
Then there is `main` and is the name of the method, when java run the
program starts this method.  
And then there is `String[] args` that means that the input of the
method, we will learn it in the next set.

Now you have to compile the program and run it. Compile the program
means make it understandable for your computer.

Compile your program use:

```
javac HelloWorld.java
```

This will create a file `HelloWorld.class`(`javac` is the java 
compiler program). For run the program use:

```
java HelloWorld
```

The output will be just:

```
Hello World!
```
