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

Hard coded permitted, create a variable assign it a value and print it.  
Do this for each type and print his value.

use: 

```
$ java HelloVar
Hello World!
The var contains: <x> of type <type>
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

## HelloName.java

Name have to be passed as program argument.

use:

```
$ java HelloName name
Hello name!
```

## HelloNameErrors.java

Name have to be passed as program argment, check all possible errors.

use:

```
$ java HelloName name
Hello name!
$ java HelloName
Please insert your name!
```

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