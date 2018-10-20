import java.util.*;
public class MainModifyString
{
    public void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=SC.nextLine();
        modifyString str=new modifyString(s);
        while(true)
        {
            System.out.println("1.Add String 2.Replace String 3.Delete String 4.Quit");
            int choice=SC.nextInt();
            if (choice==4)
            {
                break;
            }
            else
            {
                switch(choice)
                {
                    case 1:
                    System.out.println("Enter string to be added and at which index");
                    String add=SC.next();
                    int index=SC.nextInt();
                    String newstring = str.addString(index,add);
                    System.out.println(newstring);
                    break;
                    case 2:
                    System.out.println("Enter string to be replaced");
                    String ori=SC.next();
                    String repl=SC.next();
                    String replace=str.replaceString(ori,repl);
                    System.out.println(replace);
                    break;
                    case 3:
                    System.out.println("Enter string to be deleted");
                    String del=SC.next();
                    String delete=str.deleteString(del);
                    System.out.println(delete);
                    break;
                }
            }
        }
    }
}