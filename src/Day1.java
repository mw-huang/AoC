import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1
{
    public static void main(String[] args)
    {
        int frequency = 0;
        ArrayList<Integer> freqList = new ArrayList<Integer>();
        int twice = 0;
        boolean found = false;

        freqList.add(0);
        while(!found)
        {
            System.out.println(freqList.get(freqList.size()-1));
            File input = new File("C:\\Users\\Michael Huang\\Desktop\\AoC\\src\\Day1Input");
            try
            {
                Scanner scanner = new Scanner(input);
                while (scanner.hasNext())
                {
                    char[] temp = scanner.next().toCharArray();
                    if (temp[0] == '+')
                    {
//                        System.out.println(temp);
//                        System.out.println();
                        int i = 1;
                        while (i != temp.length)
                        {
                            frequency += (temp[i] - '0') * Math.pow(10, temp.length - i - 1);
                            i++;
                        }
                        //System.out.println(frequency);
                    }
                    else
                    {
//                        System.out.println(temp);
//                        System.out.println();
                        int i = 1;
                        while (i != temp.length)
                        {
                            frequency -= (temp[i] - '0') * Math.pow(10, temp.length - i - 1);
                            i++;
                        }
                        //System.out.println(frequency);
                    }
                        for (int i = 0; i < freqList.size(); i++)
                        {
                        //System.out.print(freqList.get(i) + " ");
//                        System.out.println(frequency);
//                        System.out.println(freqList.get(i));
//                        System.out.println();
                            if (frequency == freqList.get(i))
                            {

                                twice = frequency;
                                found = true;
                                break;
                            }
                        }
                        //System.out.println();
                        freqList.add(frequency);

                }
            } catch (FileNotFoundException e)
            {
                System.out.println("File not found");
            }
        }
        System.out.println(found);
        System.out.println("First frequency reached twice = " + twice);
        System.out.println("Frequency = " + frequency);
    }
}
