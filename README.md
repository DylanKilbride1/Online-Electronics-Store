**Application Documentation**

**Software Patterns Usage**

1) **Strategy Pattern for Different Payment Methods**

I'm using the strategy pattern for the payments section as I will be providing the ability to pay 
using PayPal and credit/debit card. In future, I may add the ability to pay using some newer methods. and/or remove
some of the methods I'm currently using. The strategy pattern allows me to easily decide which payment algorithm I 
want to use at runtime, and also reduces the need for multiple nested if/else statements which would be difficult to test.
The strategy pattern also allows me to easily remove old or add new patterns with ease in future as it just requires 
the creation of new classes containing the relevant payment algorithm.