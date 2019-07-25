import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class javapractice {

    public static void main(String[] args) {
    	
    	System.out.println("Enter any index into ArrayList:");
        Scanner index = new Scanner(System.in);
        int numLines = Integer.parseInt(index.nextLine());
        ArrayList<ArrayList> listArray = new ArrayList<ArrayList>();
        for(int i = 0;i<numLines;i++){
            int numOfIntegers = index.nextInt();
            ArrayList<Integer> intArrayList =  new ArrayList<Integer>();
            for(int j=0;j<numOfIntegers;j++){
                intArrayList.add(new Integer(index.nextInt()));
            }
            listArray.add(intArrayList);
            index.nextLine();
        }
        int nQueries = Integer.parseInt(index.nextLine());
        for(int i=0;i<nQueries;i++){
            int x = index.nextInt()-1;
            int y = index.nextInt()-1;
            index.nextLine();
            if(x<listArray.size() && y<listArray.get(x).size()){
                System.out.println(listArray.get(x).get(y));
            }else{
                    System.out.println("ERROR!");
                }
        }
    }
}