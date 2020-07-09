# Testing

Imagine any program have you ever used, it will be probably built of thousands of thousands of lines of code.
So find errors in the code is very hard, because of this is good practice to execute automated test, of all functionality every time you change something. 

For the first programs we will write you the code for testing, then you will write also them. 

For execute testing we have to add some libraries, the libraries are, download them from maven repository on the following links (Download from the links the JAR files):

- hamcrest-core (v1.3) https://mvnrepository.com/artifact/org.hamcrest/hamcrest-core/1.3
- junit(v 4.13) https://mvnrepository.com/artifact/junit/junit/4.13

Now you have to decide a location for your personal java libraries on you computer, for example `/urs/local/jlib`, the put the JAR files in the directory.
Now you have to tell Java you have added those libraries, so add to your shell profile file (it shuold be `.profile` or `.bashrc`) the following line.

```
export CLASSPATH=$CLASSPATH:/usr/local/jlib/*.jar
```

For execute the tests, you have to compile the tests, so move in the tests folder `x-tests` and execute the compilation for all Java files:

```
javac *.java
```

Then copy you program file in test directory, compile it and then run the following code:

```
java org.junit.runner.JUnitCore HelloWorldTest
```

All test files ends with Test, so insert the name of your program and `Test`.

