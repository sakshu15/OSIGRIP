Import java.util.Random;
Import java.util.Scanner;

Class Game
{
    Int computer;
    Public Game()
    {
        Random rand = new Random();
        Computer = rand.nextInt(100);
        System.out.println(“Guess the number between 1 to 100”);
    }
    Public int computerNo()
    {
        Return computer;
    }
}

Class guessGame {
    Static int takeUserInput() {
        Int user;
        System.out.println(“Enter a number”);
        Scanner sc = new Scanner(System.in);
        User = sc.nextInt();
        Return user;
    }

    Static void isCorrectNumber(int I, int j) {
        If (I == j) {
            System.out.println(“ Hurrey!!! You guess Correct number.”);
        } else if (I > j) {
            System.out.println(“Your guessed number is bigger!”);
        } else {
            System.out.println(“Your guessed number is smaller!”);
        }
    }

    Public static void main(String[] args) {
        Int user = 0, computer = 0, itteration = 0;

        Game g = new Game();
        Do {
            User = takeUserInput();
            Computer = g.computerNo();

            isCorrectNumber(user, computer);
            itteration++;

        }
        While (user != computer);

        System.out.println(“You guessed the number in “ + itteration + “ Try’s.”);

    }
}
