import java.util.Scanner; 
class ATM { 
    public static void main(String args[]) { 
        int pin = 1234; 
        int balance = 10000; 
        int addAmount = 0; 
        int takeAmount = 0; 
        String name; 
        Scanner scanner = new Scanner(System.in); 
 
        // Take input from the user 
        System.out.println("Enter your pin number:"); 
        int password = scanner.nextInt(); 
 
        if (password == pin) { 
            System.out.println("Enter your name:"); 
            name = scanner.next(); 
            System.out.println("Welcome " + name); 
 
            while (true) { 
                System.out.println("Press 1 to check your balance"); 
                System.out.println("Press 2 to add amount"); 
                System.out.println("Press 3 to take amount"); 
                System.out.println("Press 4 to take receipt"); 
                System.out.println("Press 5 to Exit"); 
 
                int opt = scanner.nextInt(); 
                switch (opt) { 
                    case 1: 
                        System.out.println("Your current balance is " + balance); 
                        break; 
                    case 2: 
                        System.out.println("How much amount do you want to add to your account?"); 
                        addAmount = scanner.nextInt(); 
                        System.out.println("SUCCESSFUL"); 
                        balance = addAmount + balance; 
                        break; 
                    case 3: 
                        System.out.println("How much amount do you want to take?"); 
                        takeAmount = scanner.nextInt(); 
                        if (takeAmount > balance) { 
                            System.out.println("Your balance is insufficient"); 
                            System.out.println("Try less than your available balance"); 
                        } else { 
                            System.out.println("Successfully taken"); 
                            balance = balance - takeAmount; 
                        } 
                        break; 
                    case 4: 
                        System.out.println("Welcome to All-in-One Mini ATM"); 
                        System.out.println("Available balance is " + balance); 
                        System.out.println("Amount deposited " + addAmount); 
                        System.out.println("Amount taken " + takeAmount); 
                        System.out.println("Thanks for coming"); 
                        break; 
                    case 5: 
                        System.out.println("Exiting..."); 
                        System.exit(0); 
                    default: 
                        System.out.println("Invalid Option! Please try again."); 
                } 
            } 
        } else { 
            System.out.println("Wrong PinCode! Please Try Again."); 
        } 
    } 
}
