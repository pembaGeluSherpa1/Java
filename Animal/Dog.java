package Animal;

public class Dog extends Animal {
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
