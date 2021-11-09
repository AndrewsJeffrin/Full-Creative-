public class CountWords
{ 
    public static void main(String args[]) 
    { 
        String str="This is Andrews Jeffrin ";

	str=str.trim();

        int count=1;
        
	System.out.print("Length of the String ="+str.length(););

        for(int i=0;i<length;i++)
        {
        	if(str.charAt(i)==' ')
        	{
        		count++;
        	}
        }
        System.out.println("The string contains "+ count + " words.");          
    } 
}