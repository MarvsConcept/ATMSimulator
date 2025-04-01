# ATM Simulator

## Overview
This is a simple ATM simulator written in Java that allows users to interact with a virtual bank account. Users can check their balance, deposit money, withdraw money, and exit the application.

## Features
- **Check Balance**: View the current account balance.
- **Deposit Money**: Add funds to the account.
- **Withdraw Money**: Withdraw funds if sufficient balance is available.
- **Exit**: Terminate the ATM simulation.

## Technologies Used
- Java
- Scanner (for user input handling)

## How to Run
1. Clone this repository or download the source code.
2. Open a terminal and navigate to the project directory.
3. Compile the Java program:
   ```sh
   javac ATMSim.java
   ```
4. Run the program:
   ```sh
   java ATMSim
   ```
5. Follow the on-screen menu to interact with the ATM Simulator.

## Code Structure
- **Account Class**: Manages account balance, deposits, and withdrawals.
- **ATMSim Class**: Handles user interactions through a menu-driven interface.

## Example Usage
```
-----Marvs ATM Simulator-----

1. Check balance
2. Deposit
3. Withdraw
4. Exit

Enter your choice (1 - 4):
```
- If the user selects **1**, it displays the current balance.
- If the user selects **2**, they enter an amount to deposit, and the balance updates accordingly.
- If the user selects **3**, they enter an amount to withdraw, and the transaction succeeds if funds are available.
- If the user selects **4**, the program exits.

## Error Handling
- Prevents negative initial balances.
- Ensures deposits and withdrawals are positive values.
- Handles insufficient balance scenarios gracefully.

## Author
**Marvellous Adekunle**


