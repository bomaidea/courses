## HelloWorld.java

Create classic hello world program, print `Hello World!`.

use instructions:

```
$ java HelloWorld
Hello World!
```

Use the program `1-tests/HelloWorldTest` for test everything is ok.

## HelloHome.java

Draw with hard coded chars this tiny home.
So use many times the line `System.out.println("");` and the following chars: `/`, `\` (for do this char you have to write `\\`), `-`, `|`, `[` and `]`.

```
$ java HelloHome 
  /\
 /  \
/    \
------
| [] |
|    |
| [] |
------
```

Use the program `1-tests/HelloHomeTest`.

## HelloVar.java

Hard coded permitted, create a variable assign it a value and print it, then change the value and reprint it.  
Do this for each type and print his value.

use: 

```
$ java HelloVar
<x> is <type>
<y> changed
```

Create the program for each type of data.

Data types:
- boolean
- byte
- short 
- int
- long
- float 
- double
- char

Test: `1-tests/HelloVarsTest`

## HelloName.java

Create a program who need the name of the user as first parameter, and write a greet to the user with his name.
For read the first command line argument use the variable `args[0]`.

use:

```
$ java HelloName name
Hello name!
```

Test: `HelloNameTest`

## HelloNameErrors.java

Update the program `HelloName` for fix the bugs, remember to create a condition, if you whant to know how many arguments has been passed as command line arguments you can use `args.length`, it will give you an integer number wich corripsond to the number of arguments. Than there is the struct `if (<condition>) {} else {}` that you will need for execute your statements.

use:

```
$ java HelloName name
Hello name!
$ java HelloName
Please insert your name!
```

Test: `HelloNameErrorsTest` (this test will be the exact same as the `HelloNameTest`)

## HelloNameInteractive.java

Name have to be asked interactively.

```
$ java HelloNameInteractive
Your name: bob
Hello bob!
$ java HelloNameInteractive
Your name: 
Please insert your name: bob
Hello bob!
```

## BasicSum.java

Hard coded wanted!  
Sum two har coded vars and print result!

```
$ java BasicSum
The sum of the following two values <a>, <b> is <sum>.
```

## Sum.java

Sum the two numeric arguments of the program.

```
$ java Sum 
Missing data
$ java Sum 1
Missing data
$ java Sum 1 2
3
```

## SumErrors.java

Sum the two numeric arguments of the program, with error handeling.

```
$ java Sum
Missing both arguments
$ java Sum 1 
Missing second argument.
$ java Sum 1 2
3
$ java Sum a 2
First argument is not a number.
$ java Sum 1 a 
Second argument is not a number.
$ java Sum a b
First argument is not a number.
Second argument is not a number.
```

## SumErrorsInteractive.java

Sum the two arguments number or interractively.

```
$ java Sum 1 2
3
$ java Sum -i
First number: a
The given number is not a number.
First number: 1
Second number: 2
3
```
