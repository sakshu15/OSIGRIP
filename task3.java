Import java.util.Scanner;

Class BankAccount {
    Int balance;
    Int prevTransaction;
    String customerName;
    String customerId;
    Int flag = 0;

    BankAccount(String cName, String cId) {
        customerName = cName;
        customerId = cId;
    }

    Public final void clrscr() {
        Try {
            Try {
            Final String os = System.getProperty(“os.name”);

            If (os.contains(“Windows”)) {
                Runtime.getRuntime().exec(“cls”);
            } else {
                Runtime.getRuntime().exec(“clear”);
            }
        } catch (final Exception e) {
            New ProcessBuilder(“cmd”, “/c”, “cls”).inheritIO().start().waitFor();
        } 
    } catch (final Exception es) {
    }

    }

    Void checkId() {
        Clrscr();
        System.out.println(“Welcome “ + customerName);
        System.out.println();
        System.out.print(“Please enter the Customer ID or PIN: “);
        Scanner id = new Scanner(System.in);
        String chk = id.nextLine();
        If (chk.equals(customerId)) {
            Clrscr();
            showMenu();
        } else {
            System.out.println(“=================================”);
            System.out.println(“Wrong Login!!”);
            System.out.println(“=================================”);
            System.out.println(“Please Enter the valid Credtional”);

            If (flag < 3) {
                Flag++;
                checkId();
            }
        }
    }

    Void deposit(int amount) {
        If (amount != 0) {
            Balance = balance + amount;
            prevTransaction = amount;
        }
    }

    Void withdraw(int amount) {
        If (this.balance > amount) {
        	System.out.println(amount+” rs succesfully  withdrawed from your account”);
            Balance = balance – amount;
            prevTransaction = -amount;
            System.out.println(“Available balance in your account is “+ balance);
        } else {
            Clrscr();
            System.out.println(“=================================”);
            System.out.println(“Sufficient Balance not available for the withdrawl!”);
            System.out.println(“=================================”);
        }
        
    }

    Void getPrevTransaction() {
        If (prevTransaction > 0) {
            System.out.println(“Deposited: “ + prevTransaction);
        } else if (prevTransaction < 0) {
            System.out.println(“Withdraw: “ + Math.abs(prevTransaction));
        } else {
            System.out.println(“No Transaction Occurred “);
        }
    }

    Public void transfer(double amount, BankAccount acc) {
        If (this.balance < amount) {
            Clrscr();
            System.out.println(“=================================”);
            System.out.println(“Transfer Fails due to insufficient balance!”);
            System.out.println(“=================================”);
        } else {
            This.balance -= amount;
            Acc.balance += amount;
            System.out.println(“Account of “ + this.customerName + “ becomes $” + this.balance);
            System.out.println(“Account of “ + acc.customerName + “ becomes $” + acc.balance);
            System.out.println(“\n”);
        }
    }

    Private void showMenu() {
        Char option;
        Scanner sc = new Scanner(System.in);
        System.out.println(“Welcome “ + customerName);
        System.out.println(“Your ID is  “ + customerId);
        Do {
            System.out.println(“\n”);
            System.out.println(“\n”);
            System.out.println(“A. Check Balance”);
            System.out.println(“B. Deposit”);
            System.out.println(“C. Withdraw”);
            System.out.println(“D. Previous Transaction”);
            System.out.println(“E. Transfer”);
            System.out.println(“F. Exit”);

            System.out.println(“=================================”);
            System.out.println(“Enter the option”);
            System.out.println(“=================================”);
            Option = sc.next().charAt(0);
            Option = Character.toUpperCase(option);
            System.out.println(“\n”);

            Switch (option) {
                Case ‘A’:
                    Clrscr();
                    System.out.println(“================”);
                    System.out.println(“Balance “ + balance);
                    System.out.println(“================”);
                    System.out.println(“\n”);
                    Break;

                Case ‘B’:
                    Clrscr();
                    System.out.println(“================”);
                    System.out.println(“Enter the amount to deposit”);
                    System.out.println(“================”);
                    Int amount = sc.nextInt();
                    Deposit(amount);
                    System.out.println(“\n”);
                    Break;
                
                Case ‘C’:
                    Clrscr();
                    System.out.println(“================”);
                    System.out.println(“Enter the amount to withdraw”);
                    System.out.println(“================”);
                    Int amount2 = sc.nextInt();
                    Withdraw(amount2);
                    System.out.println(“\n”);
                    Break;

                Case ‘D’:
                    Clrscr();
                    System.out.println(“================”);
                    getPrevTransaction();
                    System.out.println(“================”);
                    System.out.println(“\n”);
                    Break;

                Case ‘E’:
                    Clrscr();
                    System.out.println(“***************”);
                    System.out.println(“To whom”);
                    BankAccount bb = new BankAccount(“Raj”, “1002”);
                    System.out.println(bb.customerName);
                    System.out.println(“***************”);
                    System.out.println(“Amount to Transfer”);
                    Double am = sc.nextDouble();
                    System.out.println(“***************”);
                    Transfer(am, bb);
                    Break;

                Case ‘F’:
                    Clrscr();
                    System.out.println(“***************”);
                    Break;
                
                Default:
                    Clrscr();
                    System.out.println(“Invalid Option!!! Please Enter Again”);
            }

        } while (option != ‘F’);
        System.out.println(“ThankYou For using our services”);

    }
}

Public class ATM {
    Public static void main(String[] args) {
        BankAccount ba = new BankAccount(“Sangameshwar”, “1001”);
        Ba.checkId();
    }

}
