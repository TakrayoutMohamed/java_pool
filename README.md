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

# Access Modifiers in Java (we will back to this part to detail it)

In this tutorial, we're going over access modifiers in Java, which are used for setting the access level to classes, variables, methods, and constructors.

Simply put, there are four access modifiers: public, private, protected and default (no keyword).

Before we begin let's note that a top-level class can use public or default access modifiers only. At the member level, we can use all four.

## 1 Default 
When we don't use any keyword explicitly, Java will set a default access to a given class, method or property.
The default access modifier is also called package-private, which means that all members are visible within the same package but aren't accessible from other packages:

	package com.baeldung.accessmodifiers;

	public class SuperPublic {
		static void defaultMethod() {
			...
		}
	}

defaultMethod() is accessible in another class of the same package:

	package com.baeldung.accessmodifiers;

	public class Public {
		public Public() {
			SuperPublic.defaultMethod(); // Available in the same package.
		}
	}

However, it's not available in other packages.

## 2 Public

If we add the public keyword to a class, method or property then we're making it available to the whole world, i.e. all other classes in all packages will be able to use it. This is the least restrictive access modifier:

	package com.baeldung.accessmodifiers;

	public class SuperPublic {
		public static void publicMethod() {
			...
		}
	}

publicMethod() is available in another package:

	package com.baeldung.accessmodifiers.another;

	import com.baeldung.accessmodifiers.SuperPublic;

	public class AnotherPublic {
		public AnotherPublic() {
			SuperPublic.publicMethod(); // Available everywhere. Let's note different package.
		}
	}

## 3 Private

Any method, property or constructor with the private keyword is accessible from the same class only. This is the most restrictive access modifier and is core to the concept of encapsulation. All data will be hidden from the outside world:

	package com.baeldung.accessmodifiers;

	public class SuperPublic {
		static private void privateMethod() {
			...
		}
		
		private void anotherPrivateMethod() {
			privateMethod(); // available in the same class only.
		}
	}

In next example, we marked the privateId variable as private because we want to add some logic to the id generation. And, as we can see, we did the same thing with manager attribute because we don't want to allow direct modification of this field.

	public class Employee {
		private String privateId;
		private boolean manager;
		//...
	}

## 4 Protected

Between public and private access levels, there's the protected access modifier.

If we declare a method, property or constructor with the protected keyword, we can access the member from the same package (as with package-private access level) and in addition from all subclasses of its class, even if they lie in other packages:

	package com.baeldung.accessmodifiers;

	public class SuperPublic {
		static protected void protectedMethod() {
			...
		}
	}

protectedMethod() is available in subclasses (regardless of the package):

	package com.baeldung.accessmodifiers.another;

	import com.baeldung.accessmodifiers.SuperPublic;

	public class AnotherSubClass extends SuperPublic {
		public AnotherSubClass() {
			SuperPublic.protectedMethod(); // Available in subclass. Let's note different package.
		}
	}


# Access Modifiers in Java (Detailed)

## 1 Java ‘public’ Access Modifier

### When to Use the Public Access Modifier

Public classes and interfaces, along with public members, define an API. It's that part of our code that others can see and use to control the behavior of our objects.

However, overusing the public modifier violates the Object-Oriented Programming (OOP) encapsulation principle and has a few downsides:

 * It increases the size of an API, making it harder for clients to use
 * It's becoming harder to change our code because clients rely on it — any future changes might break their code

### Public Interfaces and Classes

#### Public Interfaces

A public interface defines a specification that can have one or more implementations. These implementations can be either provided by us or written by others.

For example, the Java API exposes the Connection interface to define database connection operations, leaving actual implementation to each vendor. At run-time, we get the desired connection based on the project setup:

	Connection connection = DriverManager.getConnection(url);

The getConnection method returns an instance of a technology-specific implementation.

#### Public Classes

We define public classes so that clients can use their members by instantiation and static referencing:

	assertEquals(0, new BigDecimal(0).intValue()); // instance member
	assertEquals(2147483647, Integer.MAX_VALUE); // static member

Moreover, we can design public classes for inheritance by using the optional abstract modifier. When we're using the abstract modifier, the class is like a skeleton that has fields and pre-implemented methods that any concrete implementation can use, in addition to having abstract methods that each subclass needs to implement.

For example, the Java collections framework provides the AbstractList class as a basis for creating customized lists:

	public class ListOfThree<E> extends AbstractList<E> {

		@Override
		public E get(int index) {
			//custom implementation
		}

		@Override
		public int size() {
			//custom implementation
		}

	}

So, we only have to implement the get() and size() methods. Other methods like indexOf() and containsAll() are already implemented for us

#### Nested Public Classes and Interfaces

Similar to public top-level classes and interfaces, nested public classes and interfaces define an API datatype. However, they are particularly useful in two ways:

They indicate to the API end user that the enclosing top-level type and its enclosed types have a logical relationship and are used together

They make our codebase more compact by reducing the number of source code files that we would've used if we'd declared them as top-level classes and interfaces

An example is the Map.Entry interface from the core Java API:

	for (Map.Entry<String, String> entry : mapObject.entrySet()) { }

Making Map.Entry a nested interface strongly relates it to the java.util.Map interface and has saved us from creating another file inside the java.util package.

### Public Methods

Public methods enable users to execute ready-made operations. An example is the public toLowerCase method in the String API:

	assertEquals("alex", "ALEX".toLowerCase());

We can safely make a public method static if it doesn't use any instance fields. The parseInt method from the Integer class is an example of a public static method:

	assertEquals(1, Integer.parseInt("1"));

Constructors are usually public so that we can instantiate and initialize objects, although sometimes they might be private like in singletons.

### Public Fields

Public fields allow changing the state of an object directly. The rule of thumb is that we shouldn't use public fields. There are several reasons for this, as we're about to see

#### Thread-Safety

Using public visibility with non-final fields or final mutable fields is not thread-safe. We can't control changing their references or states in different threads.

#### Taking Actions on Modifications

We have no control over a non-final public field because its reference or state can be set directly.

Instead, it's better to hide the fields using a private modifier and use a public setter:

	public class Student {

		private int age;
		
		public void setAge(int age) {
			if (age < 0 || age > 150) {
				throw new IllegalArgumentException();
			}
		
			this.age = age;
		}
	}

#### Changing the Data Type

Public fields, mutable or immutable, are part of the client's contract. It's harder to change the data representation of these fields in a future release because clients may need to refactor their implementations.

By giving fields private scope and using accessors, we have the flexibility to change the internal representation while maintaining the old data type as well

	public class Student {

		private StudentGrade grade; //new data representation
	
		public void setGrade(int grade) {        
			this.grade = new StudentGrade(grade);
		}

		public int getGrade() {
			return this.grade.getGrade().intValue();
		}
	}

The only exception for using public fields is the use of static final immutable fields to represent constants:

	public static final String SLASH = "/";


## 2 Java ‘private’ Access Modifier

The private access modifier is important because it allows encapsulation and information hiding, which are core principles of object-oriented programming. Encapsulation is responsible for bundling methods and data, while information hiding is a consequence of encapsulation — it hides an object's internal representation.

The first thing to remember is that elements declared as private can be accessed only by the class in which they're declared.

### Fields

Now, we'll see some simple code examples to better understand the subject.

First, let's create an Employee class containing a couple of private instance variables:

	public class Employee {
		private String privateId;
		private boolean manager;
		//...
	}

In this example, we marked the privateId variable as private because we want to add some logic to the id generation. And, as we can see, we did the same thing with manager attribute because we don't want to allow direct modification of this field.

### Construclors

Let's now create a private constructor:

	private Employee(String id, String name, boolean managerAttribute) {
		this.name = name;
		this.privateId = id + "_ID-MANAGER";
	}

By marking our constructor as private, we can use it only from inside our class.

Let's add a static method that will be our only way to use this private constructor from outside the Employee class:

	public static Employee buildManager(String id, String name) {
		return new Employee(id, name, true);
	}

Now we can get a manager instance of our Employee class by simply writing:

	Employee manager = Employee.buildManager("123MAN","Bob");

And behind the scenes, of course, the buildManager method calls our private constructor.

### Methods

Let's now add a private method to our class:

	private void setManager(boolean manager) {
		this.manager = manager;
	}

And let's suppose, for some reason, we have an arbitrary rule in our company in which only an employee named “Carl” can be promoted to manager, although other classes aren't aware of this. We'll create a public method with some logic to handle this rule that calls our private method:

	public void elevateToManager() {
		if ("Carl".equals(this.name)) {
			setManager(true);
		}
	}

### private in Action

Let's see an example of how to use our Employee class from outside:

	public class ExampleClass {

		public static void main(String[] args) {
			Employee employee = new Employee("Bob","ABC123");
			employee.setPrivateId("BCD234");
			System.out.println(employee.getPrivateId());
		}
	}

After executing ExampleClass, we'll see its output on the console:

	BCD234_ID

In this example, we used the public constructor and the public method changeId(customId) because we can't access the private variable privateId directly.

Let's see what happens if we try to access a private method, constructor, or variable from outside our Employee class:

	public class ExampleClass {

		public static void main(String[] args) {
			Employee employee = new Employee("Bob","ABC123",true);
			employee.setManager(true);
			employee.privateId = "ABC234";
		}
	}

We'll get compilation errors for each of our illegal statements:

	The constructor Employee(String, String, boolean) is not visible
	The method setManager(boolean) from the type Employee is not visible
	The field Employee.privateId is not visible

### Classes

There is one special case where we can create a private class — as an inner class of some other class.

Otherwise, if we were to declare an outer class as private, we'd be forbidding other classes from accessing it, making it useless:

	public class PublicOuterClass {

		public PrivateInnerClass getInnerClassInstance() {
			PrivateInnerClass myPrivateClassInstance = this.new PrivateInnerClass();
			myPrivateClassInstance.id = "ID1";
			myPrivateClassInstance.name = "Bob";
			return myPrivateClassInstance;
		}

		private class PrivateInnerClass {
			public String name;
			public String id;
		}
	}

In this example, we created a private inner class inside our PublicOuterClass by specifying the private access modifier.

Because we used the private keyword, if we, for some reason, try to instantiate our PrivateInnerClass from outside the PublicOuterClass, the code won't compile and we'll see the error:

	PrivateInnerClass cannot be resolved to a type


## 3 Java ‘protected’ Access Modifier

While elements declared as private can be accessed only by the class in which they're declared, the protected keyword allows access from sub-classes and members of the same package.

By using the protected keyword, we make decisions about which methods and fields should be considered internals of a package or class hierarchy, and which are exposed to outside code.

### Declaring protected Fields, Methods, and Constructors

First, let's create a class named FirstClass containing a protected field, method, and constructor:

	public class FirstClass {

		protected String name;

		protected FirstClass(String name) {
			this.name = name;
		}

		protected String getName() {
			return name;
		}
	}


With this example, by using the protected keyword, we've granted access to these fields to classes in the same package as FirstClass and to sub-classes of FirstClass.

### Accessing protected Fields, Methods, and Constructors

#### From the Same Package

Now, let's see how we can access protected fields by creating a new GenericClass declared in the same package as FirstClass:

	public class GenericClass {

		public static void main(String[] args) {
			FirstClass first = new FirstClass("random name");
			System.out.println("FirstClass name is " + first.getName());
			first.name = "new name";
		}
	}

As this calling class is in the same package as FirstClass, it's allowed to see and interact with all the protected fields, methods, and constructors.

#### From a different Package

Let's now try to interact with these fields from a class declared in a different package from FirstClass:

	public class SecondGenericClass {

		public static void main(String[] args) {
			FirstClass first = new FirstClass("random name");
			System.out.println("FirstClass name is "+ first.getName());
			first.name = "new name";
		}
	}

As we can see, we get compilation errors:


	The constructor FirstClass(String) is not visible
	The method getName() from the type FirstClass is not visible
	The field FirstClass.name is not visible

That's exactly what we were expecting by using the protected keyword.  This is because SecondGenericClass is not in the same package as FirstClass and does not subclass it.

#### From a Sub-Class

Let's now see what happens when we declare a class extending FirstClass but declared in a different package:

	public class SecondClass extends FirstClass {
		
		public SecondClass(String name) {
			super(name);
			System.out.println("SecondClass name is " + this.getName());
			this.name = "new name";
		} 
	}

As expected, we can access all the protected fields, methods, and constructors. This is because SecondClass is a sub-class of FirstClass.


### protected Inner Class

In the previous examples, we saw protected fields, methods, and constructors in action. There is one more particular case — a protected inner class.

Let's create this empty inner class inside our FirstClass:

package com.baeldung.core.modifiers;

	public class FirstClass {

		// ...

		protected static class InnerClass {

		}
	}

As we can see, this is a static inner class, and so can be constructed from outside of an instance of FirstClass. However, as it is protected, we can only instantiate it from code in the same package as FirstClass.

#### From the same Package

To test this, let's edit out GenericClass

	public class GenericClass {

		public static void main(String[] args) {
			// ...
			FirstClass.InnerClass innerClass = new FirstClass.InnerClass();
		}
	}

As we can see, we can instantiate the InnerClass without any problem because GenericClass is in the same package as FirstClass

#### From a Different Package

Let's try to instantiate an InnerClass from our SecondGenericClass which, as we remember, is outside FirstClass' package:

	public class SecondGenericClass {

		public static void main(String[] args) {
			// ...

			FirstClass.InnerClass innerClass = new FirstClass.InnerClass();
		}
	}

As expected, we get a compilation error:

	The type FirstClass.InnerClass is not visible

#### From a Sub-Class

Let's try to do the same from our SecondClass

	public class SecondClass extends FirstClass {
		
		public SecondClass(String name) {
			// ...
	
			FirstClass.InnerClass innerClass = new FirstClass.InnerClass();
		}     
	}

We were expecting to instantiate our InnerClass with ease. However, we are getting a compilation error here too:

	The constructor FirstClass.InnerClass() is not visible

Let's take a look at our InnerClass declaration:

	protected static class InnerClass {
	}

The main reason we are getting this error is that the default constructor of a protected class is implicitly protected. In addition, SecondClass is a sub-class of FirstClass but is not a sub-class of InnerClass.  Finally, we also declared SecondClass outside FirstClass' package.

For all these reasons, SecondClass can't access the protected InnerClass constructor.

If we wanted to solve this issue and allow our SecondClass to instantiate an InnerClass object, we could explicitly declare a public constructor:

	protected static class InnerClass {
		public InnerClass() {
		}
	}

By doing this, we no longer get a compilation error, and we can now instantiate an InnerClass from SecondClass

# done !!










