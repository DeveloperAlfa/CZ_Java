import java.util.Scanner;
public class Solution {


	public static void main(String[] args) 
    {
      	int start, end, step;
      	Scanner s = new Scanner(System.in);
      	start = s.nextInt();
      	end = s.nextInt();
      	step = s.nextInt();
      	while(start<=end)
        {
          	System.out.println(start+"\t"+ftoc(start));
          	start+=step;
        }
		
	}
  	public static int ftoc(int farheneit)
    {
      	double c = 5/9.0*(farheneit-32);
      	return (int)c;
    }

}
