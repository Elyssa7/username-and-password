import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username,password;
        System.out.println("Please enter your username.");
        username = input.nextLine();
        System.out.println("Please enter your password.");
        password = input.nextLine();
        if (username.equals("melisa") && password.equals("2004")) {
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Your username or password is wrong, please try again.");
        }
        }
    }
