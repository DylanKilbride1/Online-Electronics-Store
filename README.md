**Application Documentation**

**Software Patterns Usage**

1.. **Strategy Pattern for Different Payment Methods**

I'm using the strategy pattern for the payments section as I will be providing the ability to pay 
using PayPal and credit/debit card. In future, I may add the ability to pay using some newer methods. and/or remove
some of the methods I'm currently using. The strategy pattern allows me to easily decide which payment algorithm I 
want to use at runtime, and also reduces the need for multiple nested if/else statements which would be difficult to test.
The strategy pattern also allows me to easily remove old or add new patterns with ease in future as it just requires 
the creation of new classes containing the relevant payment algorithm.

2.. **Template Pattern for product sorting algorithms**

I'm going to use the template pattern for the sorting algorithms as all algorithms will have some of the same code
such as checking for a empty list. Rather than having this code in all algorithms, I have created a template 
algorithm, which subclasses e.g. ascending sort, can inherit from and tailor the algorithm to its needs. It also allows 
for any additional sorting steps to be defined only once rather than repeating them in each algorithm.