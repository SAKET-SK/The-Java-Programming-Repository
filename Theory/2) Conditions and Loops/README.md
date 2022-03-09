Decision Making


Conditional statements are used to perform different actions based on different conditions.
The if statement is one of the most frequently used conditional statements.
If the if statement's condition expression evaluates to true, the block of code inside the if statement is executed. If the expression is found to be false, the first set of code after the end of the if statement (after the closing curly brace) is executed.
Syntax:
```
if (condition) {
   //Executes when the condition is true
}
```
Any of the following comparison operators may be used to form the condition:
< less than
> greater than
!= not equal to
== equal to
<= less than or equal to
>= greater than or equal to

For example:
Remember that you need to use two equal signs (==) to test for equality, since a single equal sign is the assignment operator.


if...else Statements


An if statement can be followed by an optional else statement, which executes when the condition evaluates to false.
For example:
As age equals 30, the condition in the if statement evaluates to false and the else statement is executed.

Nested if Statements


You can use one if-else statement inside another if or else statement.
For example:
You can nest as many if-else statements as you want.

else if Statements


Instead of using nested if-else statements, you can use the else if statement to check multiple conditions.
For example:
The code will check the condition to evaluate to true and execute the statements inside that block.
You can include as many else if statements as you need.

Logical Operators


Logical operators are used to combine multiple conditions.

Let's say you wanted your program to output "Welcome!" only when the variable age is greater than 18 and the variable money is greater than 500.
One way to accomplish this is to use nested if statements:
However, using the AND logical operator (&&) is a better way:
If both operands of the AND operator are true, then the condition becomes true.


The OR Operator


The OR operator (||) checks if any one of the conditions is true.
The condition becomes true, if any one of the operands evaluates to true.
For example:
The code above will print "Welcome!" if age is greater than 18 or if money is greater than 500.

The NOT !) logical operator is used to reverse the logical state of its operand. If a condition is true, the NOT logical operator will make it false.
Example:
!(age > 18) reads as "if age is NOT greater than 18".

