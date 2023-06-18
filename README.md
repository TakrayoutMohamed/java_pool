# java_pool
java journey

## Introduction to Java Primitives
The Java Programming Language features eight primitive data types.
In this tutorial, we'll look at what these primitives are and go over each type.

#  primitive data types :

thier is eight primitives defined in Java are int , byte, short,long , float ,double, boolean and char .
These aren't considered objects and represent raw values.
+ thier position in memory :
    they are stored directly on the stack 
+ declaration :
    int i;
    char c;
    long l;...
+ initialisation :
    i = 5;
    c = 'c';
    l = 555;...

|**type**   | **Size(bits)**| **min**  | **max**  | **exemple**  |
|:----------|:-------------:|---------:|---------:|-------------:|
| byte      | 8             |          |    ..    |    ..        |
| short     | 16            |          |    ..    |    ..        |
| int       | 32            |          |    ..    |    ..        |
| long      | 64            |          |    ..    |    ..        |
| float     | 32            |          |    ..    |    ..        |
| double    | 64            |          |    ..    |    ..        |
| char      | 16            |          |    ..    |    ..        |
| boolean   | 1             |          |    ..    |    ..        |



**2.1. int**
The first primitive data type we're going to cover is int. Also known as an integer, int type holds a wide range of non-fractional number values.

Specifically, Java stores it using 32 bits of memory. In other words, it can represent values from -2,147,483,648 (-231) to 2,147,483,647 (231-1).

In Java 8, it's possible to store an unsigned integer value up to 4,294,967,295 (232-1) by using new special helper functions.

We can simply declare an int:

`int x = 424_242;`

`int y;`

The default value of an int declared without an assignment is 0.

If the variable is defined in a method, we must assign a value before we can use it.

We can perform all standard arithmetic operations on ints. Just be aware that decimal values will be chopped off when performing these on integers

**2.2. byte**
byte is a primitive data type similar to int, except it only takes up 8 bits of memory. This is why we call it a byte. Because the memory size is so small, byte can only hold the values from -128 (-27) to 127 (27 – 1).

Here's how we can create byte:
`byte b = 100;`
` `
`byte empty;`

The default value of byte is also 0.

**2.3. short**
The next stop on our list of primitive data types in Java is short.

If we want to save memory and byte is too small, we can use the type halfway between byte and int: short.

At 16 bits of memory, it's half the size of int and twice the size of byte. Its range of possible values is -32,768(-215) to 32,767(215 – 1).

short is declared like this:

`short s = 20_020;`
` `
`short s;`
Also similar to the other types, the default value is 0. We can use all standard arithmetic on it as well.

**2.4. long**
Our last primitive data type related to integers is long.

long is the big brother of int. It's stored in 64 bits of memory, so it can hold a significantly larger set of possible values.
The possible values of a long are between -9,223,372,036,854,775,808 (-263) to 9,223,372,036,854,775,807 (263 – 1).

We can simply declare one:
`long l = 1_234_567_890;`
` `
`long l;`
As with other integer types, the default is also 0. We can use all arithmetic on long that works on int.

**2.5. float**
We represent basic fractional numbers in Java using the float type. This is a single-precision decimal number. This means that if we get past six decimal points, the number becomes less precise and more of an estimate.

In most cases, we don't care about the precision loss. But if our calculation requires absolute precision (e.g., financial operations, landing on the moon, etc.), we need to use specific types designed for this work.
This type is stored in 32 bits of memory just like int. However, because of the floating decimal point, its range is much different. It can represent both positive and negative numbers. The smallest decimal is 1.40239846 x 10-45, and the largest value is 3.40282347 x 1038.

We declare floats the same as any other type:
`float f = 3.145f;`
` `
`float f;`
And the default value is 0.0 instead of 0. Also, notice we add the f designation to the end of the literal number to define a float. Otherwise, Java will throw an error because the default type of a decimal value is double
We can also perform all standard arithmetic operations on floats. However, it's important to note that we perform floating point arithmetic very differently than integer arithmetic.
The default value is also 0.0 as it is with float. Similar to float, we attach the letter D to designate the literal as a double.

**2.7. boolean**
The simplest primitive data type is boolean. It can contain only two values: true or false. It stores its value in a single bit.

However, for convenience, Java pads the value and stores it in a single byte.
Here's how we declare boolean:
`boolean b = true;`
` `
`boolean b;`
Declaring it without a value defaults to false. boolean is the cornerstone of controlling our programs flow. We can use boolean operators on them (e.g., and, or, etc.).

**2.8. char**
The final primitive data type to look at is char.

Also called a character, char is a 16-bit integer representing a Unicode-encoded character. Its range is from 0 to 65,535. In Unicode, this represents __\u0000__ to __\uffff__.

For a list of all possible Unicode values, check out sites such as Unicode Table.

Let's now declare a char:

`char c = 'a';`
` `
`char c = 65;`
` `
`char c;`

When defining our variables, we can use any character literal, and they will get automatically transformed into their Unicode encoding for us. A character's default value is ‘/u0000'.

**2.9. Overflow**
The primitive data types have size limits. But what happens if we try to store a value that's larger than the maximum value?

We run into a situation called overflow.

When an integer overflows, it rolls over to the minimum value and begins counting up from there.

Floating point numbers overflow by returning Infinity:

	int i = Integer.MAX_VALUE;
	int j = i + 1;
	// j will roll over to -2_147_483_648

	double d = Double.MAX_VALUE;
	double o = d + 1;
	// o will be Infinity

Underflow is the same issue except it involves storing a value smaller than the minimum value. When the numbers underflow, they return 0.0.


**2.10. Autoboxing**
Each primitive data type also has a full Java class implementation that can wrap it. For instance, the Integer class can wrap an int. There is sometimes a need to convert from the primitive type to its object wrapper.

Luckily, Java can perform this conversion for us automatically, a process called Autoboxing:

	Character c = 'c';

	Integer i = 1;













#   Objects vs. Primitives

Java provides two types of data representation: primitive types and reference types.
In this section, we'll discuss the differences between the two with regards to initialization.

Java has eight built-in data types, referred to as Java primitive types; variables of this type hold their values directly.

<h5> Reference</h5> types hold references to objects (instances of classes). Unlike primitive types that hold their values in the memory where the variable is allocated, references don't hold the value of the object they refer to.

Instead, a reference points to an object by storing the memory address where the object is located.

Note that Java doesn't allow us to discover what the physical memory address is. Rather, we can only use the reference to refer to the object.

Let's look at an example that declares and initializes a reference type out of our User class:

    @Test
    public void whenIntializedWithNew_thenInstanceIsNotNull() {
        User user = new User();
    
        assertThat(user).isNotNull();
    }

As we can see, a reference can be assigned to a new object by using the keyword new, which is responsible for creating the new User object.
## 4.Creating Objects
Unlike with primitives, objects creation is a bit more complex. This is because we're not just adding the value to the field; instead, we trigger the initialization using the new keyword. This, in return, invokes a constructor and initializes the object in memory.
Let's discuss constructors and the new keyword in further detail.
The new keyword is responsible for allocating memory for the new object through a constructor.
A constructor is typically used to initialize instance variables representing the main properties of the created object.
If we don't supply a constructor explicitly, the compiler will create a default constructor which has no arguments, and just allocates memory for the object.
A class can have many constructors, as long as their parameters lists are different (overload). Every constructor that doesn't call another constructor in the same class has a call to its parent constructor, whether it was written explicitly or inserted by the compiler through super().
Let's add a constructor to our User class:

	public User(String name, int id) {
		this.name = name;
		this.id = id;
	}

Now we can use our constructor to create a User object with initial values for its properties:

	User user = new User("Alice", 1);

## 5. Variable Scope
In the following sections, we'll look at the different types of scopes that a variable in Java can exist within, and how this affects the initialization process

# 5.1. Instance and Class Variables

Instance and class variables don't require us to initialize them. As soon as we declare these variables, they're given a default value:

|**type**   | **Default value**|
|:----------|:----------------:|
| boolean   | false                |
| byte,short,int,long     | 0               |
| float, double       | 0.0          	   |
| char      | '\u0000'               |
| Reference Type     | null               |

	@Test
	public void whenValuesAreNotInitialized_thenUserNameAndIdReturnDefault() {
		User user = new User();
	
		assertThat(user.getName()).isNull();
		assertThat(user.getId() == 0);
	}

# 5.2. Local Variables
Local variables must be initialized before use, as they don't have a default value and the compiler won't let us use an uninitialized value
For example, the following code generates a compiler error:

	public void print(){
		int i;
		System.out.println(i);
	}

## 6. The Final Keyword
The final keyword applied to a field means that the field's value can no longer be changed after initialization. In this way, we can define constants in Java.
Let's add a constant to our User class:

	private static final int YEAR = 2000;

Constants must be initialized either when they're declared or in a constructor.

## 7. Initializers in Java
In Java, an initializer is a block of code that has no associated name or data type and is placed outside of any method, constructor, or another block of code.
Java offers two types of initializers, static and instance initializers. Let's see how we can use each of them.
# 7.1. Instance Initializers
We can use these to initialize instance variables.
To demonstrate, we'll provide a value for a user id using an instance initializer in our User class:

	{
		id = 0;
	}

# 7.2. Static Initialization Block
A static initializer, or static block, is a block of code which is used to initialize static fields. In other words, it’s a simple initializer marked with the keyword static:

	private static String forum;
	static {
		forum = "Java";
	}

## 8. Order of Initialization
When writing code that initializes different types of fields, we have to keep an eye on the order of initialization.
In Java, the order for initialization statements is as follows:
 * static variables and static initializers in order
 * instance variables and instance initializers in order
 * constructors

## 9. Object Life Cycle
Now that we've learned how to declare and initialize objects, let's discover what happens to objects when they're not in use.
Unlike other languages where we have to worry about object destruction, Java takes care of obsolete objects through its garbage collector.
**All objects in Java are stored in our program's heap memory.** in fact, the heap represents a large pool of unused memory allocated for our Java application.
On the other hand, the garbage collector is a Java program that takes care of automatic memory management by deleting objects that are no longer reachable.
For a Java object to become unreachable, it has to encounter one of the following situations:

* The object no longer has any references pointing to it.
* All references pointing to the object are out of scope.


In conclusion, an object is first created from a class, usually using the keyword new. Then the object lives its life, and provides us with access to its methods and fields.
Finally, when it's no longer needed, the garbage collector destroys it.

## 10. Other Methods for Creating Objects

In this section, we’ll take a brief look at ***methods other than the new keyword for creating objects, and learn how to apply them, specifically reflection, cloning, and serialization***
1. __Reflection__ 
**__Reflection__ is a mechanism we can use to inspect classes,fields, and methods at run-time.** Here is an example of creating our User object using reflection:

	@Test
	public void whenInitializedWithReflection_thenInstanceIsNotNull() throws Exception {
		User user = User.class.getConstructor(String.class, int.class).newInstance("Alvares", 2);
		assertThat(user).isNotNull();
	}

In this case, we're using reflection to find and invoke a constructor of the User class.

2. __cloning__
The next method, **cloning, is a way to create an exact copy of an object**. For this, our User class must implement the Cloneable interface:

	public class User implements Cloneable { //... }

Now we can use the clone() method to create a new clonedUser object that has the same property values as the user object:

	@Test
	public void whenCopiedWithClone_thenExactMatchIsCreated() throws CloneNotSupportedException {
		User user = new User("Alice", 3);
		User clonedUser = (User) user.clone();

		asserThat(clonedUser).isEqualTo(user);
	}

We can also use the sun.misc.Unsafe class to allocate memory for an object without calling a constructor:
	User u = (User) unsafeInstance.allocateInstance(User.class);


# how the compilers work:

## Introduction

Programming languages were created to allow developers to write human-readable source code. However, computers work with machine code, which people can hardly write or read. Thus, compilers translate the programming language’s source code to machine code dedicated to a specific machine.

In this article, we’ll analyze the compilation process phases. Then, we’ll see the differences between compilers and interpreters. Finally, we’ll introduce examples of a few compilers of modern programming languages.


## Compilation Phases:

As we already mentioned, the compilation process converts high-level source code to a low-level machine code that can be executed by the target machine. Moreover, an essential role of compilers is to inform the developer about errors committed, especially syntax-related ones.
The compilation process consists of several phases:

 * Lexical analysis
 * Syntax analysis
 * Semantic analysis
 * Intermediate code generation
 * Optimization
 * Code generation
in this section, we will discuss each phase in detail.

1. Lexical Analysis

the first stage of the compilation process is lexical analysis. During this phase , the compiler splits source code into fragments called lexemes. A lexeme is an abstruct unit of a specific language's lexical system. Let's analyze a simple exemple:
	String greeting = "hello";

is the above statement, we have five lexemes:
 * String
 * greeting 
 * = 
 * "hello"
 * ;

After splitting code into lexemes, a sequence of tokens is created. The sequence of tokens is a final product of lexical analysis. Thus, lexical analysis is also often called tokenization. A token is an object that describes a lexeme. It gives information about the lexeme’s purpose, such as whether it’s a keyword, variable name, or string literal.
Moreover, it stores the lexeme’s source code location data.

2. Syntax Analysis

During syntax analysis, the compiler uses a sequence of tokens generated in the first stage. Tokens are used to create a structure called an **abstract syntax tree** (AST), which is a tree that represents the logical structure of a program.
In this phase, the compiler checks a grammatic structure of the source code and its syntax correctness. Meanwhile, any syntax errors result in a compilation error, and the compiler informs the developer about them.

In brief, syntax analysis is responsible for two tasks:
 * It checks source code for any syntax error .
 * it generates an abstract syntax tree that the next stage uses.

3. Semantic Analysis 

In this stage, the compiler uses an abstract syntax tree to detect any semantic errors, for exemple :
  * assigning the wrong type to a variable
  * declaring variables with the same name in the same scope
  * using an undeclared variable
  * using language’s keyword as a variable name
Semantic analysis can be divided into three steps:
 * Type checking – inspects type match in assignment statements, arithmetic operations, functions, and method calls.
 * Flow control checking – investigates if flow control structures are used correctly and if classes and objects are correctly accessed.
 * Label checking – validates the use of labels and identifiers.

To achieve all the above goals, during semantic analysis, the compiler makes a complete traversal of the abstract syntax tree. Semantic analysis finally produces an annotated AST that describes the values of its attributes.

 4. Intermediate Code Generation

During the compilation process, a compiler can generate one or more intermediate code forms.

**Intermediate code is machine-independent**. Thus, there is no need for unique compilers for every different machine. Besides, optimization techniques are easier to apply to intermediate code than machine code. Intermediate code has two forms of representation:

 + * High-Level – similar to the source language. In this form, we can easily boost the performance of source code. However, it’s less preferred for enhancing the performance of the target machine.
 + * Low-Level – close to the machine’s machine code. It’s preferred for making machine-related optimizations.

5. Optimization

**In the optimization phase, the compiler uses a variety of ways to enhance the efficiency of the code.**
Certainly, the optimization process should follow three important rules:

 + * The resulting code can’t change the original meaning of the program.
 + * Optimization should focus on consuming fewer resources and speeding up the operation of the software.
 + * The optimization process shouldn’t significantly impact the overall time of compilation.

Let’s see a few examples of optimization techniques:

  + + Function inlining – replacing the function call with its body.
  + + Dead code elimination – compiler gets rid of code that is never executed, or if executed, its returned result isn’t used.
  + + Loop fusion – executing, in one loop, operations from the adjacent loops that have the same iteration conditions.
  + + Instruction combining – instructions realizing similar operations are combined into one; for example, x = x + 10; x = x – 7; could be replaced with x = x + 3;

6. Code Generation

 Finally, the compiler converts the optimized intermediate code to the machine code dedicated to the target machine. The final code should have the same meaning as source code and be efficient in terms of memory and CPU resource usage. Furthermore, the code generation process must also be efficient.

7. Practical Exemple

In the below flowchart, we can see an example of the compilation process of a simple statement.
![alt text](./readmeImages/Compilation-Flow-Example-Algorithm-Flowchart-Example.webp?raw=true "compilation process")

## Compiler vs Interpreter

As we already know, the compiler converts high-level source code to low-level code. Then, the target machine executes low-level code. On the other hand, the interpreter analyzes and executes source code directly. An interpreter usually uses one of several techniques:

 * Analyzes (parses) the source code and executes it directly.
 * Converts high-level source code into intermediate code and executes it immediately.
 * Explicitly executes stored precompiled code generated by a compiler. In this case, the compiler belongs to the interpreter system


Let’s see a brief comparison between an interpreter and a compiler:


|**Compiler**   | **INTERPRETER**|
|:----------|:-------------:|
| Converts the code but doesn’t execute it.| Executes code directly.|
|  Implementing a compiler requires knowledge about the target machine | No need for knowledge about the target machine, since an interpreter executes the code. |
| Each instruction is translated only once | The same instruction can be analyzed multiple times.|
| The compiled program is faster to run.|Interpreted programs are slower to run, but take less time to interpret than to compile and run.|
| Consumes more memory due to intermediate code generation |Usually executes input code directly, thus it consumes less memory.|
| Compiled language examples: Java, C++, Swift, C#    | Interpreted language examples: Ruby, Lisp, PHP, PowerShell|












