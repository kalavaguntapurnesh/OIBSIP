import java.util.*;
class Game
{
    public void play()
    {
        Random rand = new Random(); //usage of the random class for generating random numbers
        int num = rand.nextInt(100); // for generating the pseudo random number from the computer
        System.out.println("Random Number generated\n");
        int x = (int)(Math.ceil(Math.log(100)));
        System.out.println("You have just " + x + " chances to guess the number\n");
        int reward = 100; //Used for correct guess
        int i = 0;
        for( i = 0; i < x; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number you have guessed??? : \n");
            int k = sc.nextInt();
            if(k == num)
            {
                System.out.println("Wow! You won the game\n");
                System.out.println("Your score is " + reward);
                break;
            }
            else if(k > num)
            {
                if(k - num > 25)
                {
                    System.out.println("Your guess extremely High!!!\n");
                }
                else
                {
                    System.out.println("Your guess nearly high!!!\n");
                }
            }
            else
            {
                if(num - k > 25)
                {
                    System.out.println("Your guess is extremely low!!!\n");
                }
                else
                {
                    System.out.println("Your guess is nearly low!!!\n");
                }
            }
            reward = reward - 10; //decreasing reward for every wrong guess
        }
        if(i == x)
        {
            System.out.println("Sorry!!!You are unable to guess the number\n");
            System.out.println("The random number is " + num);
            reward = 0;
            System.out.println("Your reward is : " + reward);
        }
    }
}
public class Demo_2 {
    public static void main(String args[])
    {
        System.out.println("Welcome to the Number Guessing Game!!!\n");
        System.out.println("Enter your choice: 1.Play \n2.Exit \n");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option == 1)
        {
            Game g = new Game();
            g.play();
            System.out.println("Do you want to play again: Yes/No\n");
            String a = sc.next();
            while(a.equalsIgnoreCase("Yes"))
            {
                g.play();
                System.out.println("Do you want to play once again: Yes/No\n");
                a = sc.next();
            }
        }
        else {
            System.out.println("You are now exited!!!\n");
        }


    }
}
