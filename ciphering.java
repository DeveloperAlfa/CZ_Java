public class solution {

	public static void printAllPossibleCodes(String input) {
		// Write your code here
		String[] k = getCode(input);
      	for(int i = 0; i < k.length; i++)
        {
          System.out.println(k[i]);
        }
	}
  public static  String[] getCode(String input){
		// Write your code here
      if(input.length()==0) {
        String[] a = {""};
        return a;
      }
      if(input.length()==1) 
      {
        String[] a = {(char)(input.charAt(0)-'1'+'a')+""};
        return a;
      }
      String[] rec = getCode(input.substring(1));
      String[] rec2 = getCode(input.substring(2));
      String ans[];
      char c1 =(char) (input.charAt(0)-'0'+'a'-1), c2 = (char)((input.charAt(0)-'0')*10 + input.charAt(1)-'1' + 'a');
      if((input.charAt(0)-'0')*10 + input.charAt(1)-'1'<26)
      {
        ans = new String[rec.length + rec2.length];
        int k = 0;
        for(int i = 0; i < rec.length; i++)
        {
          ans[k++] = c1+rec[i];
        }
        for(int i = 0; i < rec2.length; i++)
        {
          ans[k++] = c2+rec2[i];
        }
        return ans;
      }
      else
      {
       ans = new String[rec.length];
        int k = 0;
        for(int i = 0; i < rec.length; i++)
        {
          ans[k++] = c1+rec[i];
        }
        return ans; 
      }
		
	}
}
