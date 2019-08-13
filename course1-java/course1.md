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
computer. But we will see it better in the next sets.  
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
There is `static` that for the moment you must to take as it is.  
Then there is `void` that means that is a method, so is a code block.
Then there is `main` and is the name of the method, when java run the
program starts this method.  
And then there is `String[] args` that means that the input of the
method, we will learn it in the next set.  
Then there is the line `System.out.println("Hello World!")` that is
the line that print __Hello World!__ in your shell.
After each line of code, that will not be followed by a code block you
must to add a `;`, so the compiler can understand that the instruction
is finished.

Now you have to compile the program and run it. Compile the program
means make it understandable for your computer.

Compile your program using:

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

## set 1 - variables

The most important things in programs are data, so you need a system 
to store data in your program. For this there are variables. You must
to immagine those as boxes, that can keep inside a value (your data).

Java is a highly tipized programming language, this means that each
kind of data needs a specific kind of box. This because it is a C-Like
language.

For declare a variable you must to write the data type, the variable
name and then the you must to initialze it, with an equal (`=`) and
set it a value (the name cannot be an java reserved word, you will get
an compilation error). 

### Variables names

The names of the varibles have to start with a letter (upper or lower
case) and can contains the undrescore (`_`), letters and numbers.

It's good practice use a significant name of the variable and if it has more then one word in his name, you should write it in 
lowerCamelCase, that means, that you should write all the words 
together, without spaces, or scpecial chars in between, with the first
letter lower case and all the other word with capital letter (like:
`exampleVariableWithLowerCamelCase`).

Now we will see the kinds of datas.

### Integers numbers

There are many integer numbers, because it depends from the size of 
the number you need. 

- byte [ -128 ; 127 ]
- short [ -32'768 ; 32`767 ]
- int [ -2'147'483'648 ; 2'147'483'647 ]
- long [ -9'223'372'036'854'775'808 ; 9'223'372'036'854'775'807 ] 

In those cases the declaration is like the following code.

```
byte byteVariable = 0;
short shortVariable = 0;
int intVariable = 0;
long longVariable = 0;
```

### Floating Point Numbers

Those are the numbers with the floating point (like `0.5`, `2.1`).  
For those types there are two differents data types:

- float 
- doule (has the double of the capacity of a float)

```
float floatVariable = 0.5;
double doubleVariable = 2.1;
```

### Boolean

To store a binary value, like (`0` or `1`, _true_ or _false_, _yes_ 
or _no_). In java it can handle only `true` or `false`.

```
boolean trueBooleanVariable = true;
boolean falseBooleanVariable = false;
```

### Charcters

In java there is a data type for single characters, it's `char`. To 
declare it you must to use the apos:

```
char charVariable = 'a';
```

If you whant to insert an apos in the variable or you want to insert a
break, or you whant to insert a unicode exeadecimal character you can
use the back-slash, like:

```
char normalChar = 'i';
char aposChar = '\'';
char currigeReturnChar = '\n';
char unicodeChar = '\0x0f0f'
```

### String (composite data type)

If you have interger numbers, floating point numbers, booleans and 
chars you may need Strings, to write words and sentences. So the java
developers have written also the String. So is not a native data type,
but is used very offen. It is a composition of chars.

```
String stringVariable = "my sentence, or my word";
```

To insert special chars it works as char, so you can use `\n` for 
curriege return or `\"`.

### Usage of variables.

Variables can be declared in any part of your code. Can be printed, and
their value can be changed any time. But their type can't be changed.

File `VariableExecise.java`

```
public class VariableExecise {
	public static void main(String[] args) {
		int intVal = 0;
		System.out.println("Should print 0:");
		System.out.println(intVal);
		intVal = 1;
		System.out.println("Should print 1:");
		System.out.println(intVal);
	}
}
```

Now compile has you learned before and run it. The output should be:

```
Sould print 0:
0
Sould print 1:
1
``` 
