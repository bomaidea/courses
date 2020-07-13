# Procedural Coding - First Look

## Hello World (chapter 1)

All coders have to execute a ritual every time the start with something new.
The ritual is just about create a program who says `HelloWorld!`.

So create and open a new file called `HelloWorld.java`. The first part of the name is the actual name of the program and the end is the file type, our case is Java.
In the file write the following lines as bellow, please write you do not copy/paste, this will help you remember what you have to write.

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```

Now we have to check if our code will print on the screen `Hello World!`. In java you have to compile your program for the machine. The compiling process will transform the code from uman readable code to machine readable code.  
For do this execute the following command.

```sh
javac HelloWorld.java
```

This command should return notthing, remember with computer there is the role _no news, good news_, this mean if the compiler does not tell you anything it should be everything ok!  
Now run your program as follow.

```sh
java HelloWorld
Hello World!
```

This time it should print Hello World, because with the program we created, we told the computer to write the string.
Now that we runned our first program we have to analise what we have done.

In the first line of code you can see 3 words, one is `public` this
means that the program is public and it can be executed from your 
computer. But we will see it better in the next chapter.  
Then there is the word `class` in java for the moment it will means
you that is a program.  
And the last word if you look it twice, you will notice that is the
first part of the name of program. It have to be like this, otherwise you will
get an error after. Then you see that there is a `{` this means that 
it will be followed by a code block. 

The code block is delimited by `{}` and is indented, this mean that 
befor each line inside it is one tab right. This is a good practice
that you will see by every coder, because it makes the code more 
readable.

The whole second line we will take as it is, but we have to notice that at the end of it there is on other `{`, so it's following another block of code.
The third line is `System.out.println("Hello World!")`, this mean that the computer have to print _Hello World!_ in your shell.
After each line of code, that will not be followed by a code block you
must to add a `;`, so the compiler can understand that the instruction
is finished.

Now delete the file you created and do the first two exercises:

- HelloWorld
- HelloHome

## Variables (chapter 2)

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

Exercise `HelloVars`

## Interraction with the program (chapter 3)

The basics programs are command line programs, but all of the programs we know, could have some configurable parameters, so we need to find a system for interract with the program.

With the command line programs there are 2 ways of interact, one with arguments so giving all paramters when calling the program, like in the example bellow:

```sh
$ mv fileA.txt fileB.txt
```

The command is `mv` the first argument is `fileA.txt` and the second is `fileB.txt`. The other way of interract with the program is interactive mode, the interactive programs are those who ask you something, for example the command bellow:

```sh
$ rm fileB.txt
Are you shoure you want delete fileA.txt? [y/n]
```

The command is `rm` then we have an argument that is the file and then there is the interractive mode, so it asks you if you are shore you whant to delete the file. In the square brakets it the programs tells you which are the allowed answers.

### Arguments

For interract with java programs throught arguments you have to write arguments after colling the program, like as follow:

```sh
$ java HelloWorld Arg1 Arg2
```

Now is the time to understand a piece of the second line of your first code:

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```

Where you see `String[] args` is a declaration of an array of variables, this mean that there are many variables of the same type (`String`) in this variables there are the arguments you inserted as follow.

```
["Arg1", "Arg2"]
```

The system will automatically take yours arguments from the command line and then insert them in this array. For access them you just need to call the array (`args`) with the position index of your desired argument, like `args[0]`.

The first argument will be always at index `0`, the second at `1` and so on. With computer you start counting always from 0.

*Exercise:* HelloName

When you tested this exercise you may noticed there is an error. Just bellow you will se a riproduction of the bug you probably generated.

```sh
$ java HelloName Bob
Hello Bob!
$ java HelloName
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at HelloName.main(HelloName.java:10)
```

If you use your program correctly it will work perfectly, otherways it will throw an Exception that is an error. For avoid this kind of erros you have to check if the user has inserted his name, than if the user inserted his name write `Hello <name>!`, otherwise tell the user to insert his username, with a better error message than a system error or a program error.

For execute checks in your code you have to chose between two options, so if you have the name write the sentece else write the error. Try in the next exercise to figure out how to fix your program.

*Exercise:* HelloNameError

