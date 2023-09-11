# FacultateUniverisity Transilvania
Faculty : IESC
Study program IEC(english)

PROJECT 2 <Large Number Arithmetic in C++>
<Dan George Adrian,1,4LF521>

1.Specification defining the problem
1.1 Description of the code:

The code demonstrates the implementation of a custom data type, LargeNumber, in C++, which represents and performs arithmetic operations on large numbers with up to 200 digits. The numbers are internally stored as strings, and various arithmetic and relational operations (addition, subtraction, multiplication, less than, greater than, equal to) are defined for the LargeNumber class. The code provides an example usage of the LargeNumber class, allowing users to input their own numbers or use default ones, and performs arithmetic operations on them.


 ### 1.2 Description of requirments
-Class for the LargeNumber
-Functions for arithmetic operations (operators +, -, *)
and  relational operations (>, <, = =, etc.)


 ### 1.3 Functional specification
The functional requirments of the the program can be described as follows:
Input 2 numbers from keyboard


 ### 1.4 Tests and Options

Below there are few example of how the code and the programm works !
Sum:
 ![Captură de ecran 2023-09-11 233401](https://github.com/BaluIT-ist/Facultate/assets/122810689/e6643833-0a80-4180-929c-a07b3b9b9686)


OR

Multiply:
 
![Captură de ecran 2023-09-11 233730](https://github.com/BaluIT-ist/Facultate/assets/122810689/7d4a5aaa-0315-4211-8ea1-7104b3c5addb)




 ### 1.5 User Interface
 
 ![Captură de ecran 2023-09-11 235620](https://github.com/BaluIT-ist/Facultate/assets/122810689/1495fe26-4f6c-4100-bbe1-792ba29a3ae2)

 
Menu: 
 
 
 ![Menu](https://github.com/BaluIT-ist/Facultate/assets/122810689/54573e47-65e7-403a-b89b-90cb85e43cdf)

Menu for  : [4] Comparation
 

![Menu 2 ](https://github.com/BaluIT-ist/Facultate/assets/122810689/5b9c7086-847e-4d01-b88b-6c0e239016b2)





 ### 1.6 Relational Operators :
Less than (operator"<")
It simply compares the string representations (number) of the two objects using the < operator.
bool operator"<"
   - Description: Overloaded less-than operator for comparing two `LargeNumber` objects.
   - Parameters:
      const LargeNumber& other: The `LargeNumber` object to be compared.
   - Returns: `true` if the current `LargeNumber` is less than the other; otherwise, `false`.
Greater than (operator">"):
It compares the string representations (number) of the two objects using the > operator.
bool operator ">"
   - Description: Overloaded greater-than operator for comparing two `LargeNumber` objects.
   - Parameters:
      const LargeNumber& other: The `LargeNumber` object to be compared.
   - Returns: `true` if the current `LargeNumber` is greater than the other; otherwise, `false`.
Equality (operator"=="):
It checks if the string representations (number) of the two objects are equal using the == operator.
10. bool operator "==")
    - Description: Overloaded equality operator for comparing two `LargeNumber` objects for equality.
    - Parameters:
       const LargeNumber& other: The `LargeNumber` object to be compared.
    - Returns: `true` if the current `LargeNumber` is equal to the other; otherwise, `false`.


  ### 1.7 LargeNumber Class              

The `LargeNumber` class represents large numbers as strings and provides various mathematical operations such as addition, subtraction, multiplication, and comparison.

Besides Relational Operators there are also other members of the "LargeNumber" Class , such as : 
⦁	private string number
		Description: Stores the string representation of the large   		number.- 
		Access: Private
⦁	string getNumber()
   - Description: Retrieves the string representation of the large number.
   - Returns: A string containing the large number.
⦁	LargeNumber operator+(const LargeNumber& other) const
   - Description: Overloaded addition operator for adding two `LargeNumber` objects.
   - Parameters:
     - const LargeNumber& other: The `LargeNumber` object to be added.
   - Returns: A new `LargeNumber` object representing the sum of the two numbers.
⦁	LargeNumber operator-(const LargeNumber& other) const
   - Description: Overloaded subtraction operator for subtracting two `LargeNumber` objects.
   - Parameters:
     - const LargeNumber& other: The `LargeNumber` object to be subtracted.
   - Returns: A new `LargeNumber` object representing the difference between the two numbers.

⦁	LargeNumber operator*(const LargeNumber& other) const
   - Description: Overloaded multiplication operator for multiplying two `LargeNumber` objects.
   - Parameters:
     - const LargeNumber& other: The `LargeNumber` object to be multiplied.
   - Returns: A new `LargeNumber` object representing the product of the two numbers.


 ### 1.8 Enums

 

This enumeration, ComparationEnum, defines the set of comparison operations that can be performed in a program. It provides a way to represent the outcomes of comparisons between values.
 
The ChoiceEnum enumeration also defines a set of choices that can be used to specify various operations in a program. It provides a convenient way to select different types of operations or actions
