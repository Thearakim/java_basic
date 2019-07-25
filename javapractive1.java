import java.util.*;

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType()
    {
        return "Someone ordered Fast Food!";
    }
}

class Cake implements Food {
    public String getType()
    {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String a) 
    {
        if(a.equals("cake"))
            return new Cake();
        else if(a.equals("pizza"))
            return new Pizza();
        else
            return null;

    }
}

public class javapractive1 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        FoodFactory obj = new FoodFactory();
        System.out.println("What do you want to eat? cake or pizza?");
        Food obj1 = obj.getFood(input.nextLine());

        System.out.println("The factory returned " + obj1.getClass());
        System.out.println(obj1.getType());

    }
}