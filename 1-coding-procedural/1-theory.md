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
