import java.util.*;

public class javapractice2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int L = 99; 
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello, " + name + ". How many photos do you want to upload?");
        int photos = input.nextInt();
        int[] yourPhoto = new int[photos];
        int[] alsoYourPhoto = new int[photos];
        for (int i = 0; i < photos; i++)
        {
            System.out.println("Please select your photos: ");
            int W = yourPhoto[i] = input.nextInt();
            int H = alsoYourPhoto[i] = input.nextInt();
            
            System.out.println("Photo " + ++i + ": " + W + "x" + H);
            i--;
        }
        for (int i = 0; i < photos; i++)
        {
            if(yourPhoto[i]>L && alsoYourPhoto[i]>L) 
            {
                if(yourPhoto[i] == alsoYourPhoto[i])
                    System.out.println("ACCPETED");
                else 
                    System.out.println("CROP IT");
            }
            else
            {
                System.out.println("CHOOSE ANOTHER PHOTO");
            }

        }
    }
}