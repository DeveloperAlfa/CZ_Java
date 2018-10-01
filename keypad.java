public class solution {

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here
      return keyPadHelper("", n+"");

	}
  public static String[] keyPadHelper(String prev, String nums)
  {
    if(nums.length()==0)
    {
      String[] a = {prev};
      return a;
    }
    if(nums.charAt(0)=='2') 
    {
      String[] a = keyPadHelper(prev+'a', nums.substring(1));
      String[] b = keyPadHelper(prev+'b', nums.substring(1));
      String[] c = keyPadHelper(prev+'c', nums.substring(1));
      String[] ans = new String[a.length+b.length+c.length];
      int k = 0; 
      for(int i = 0; i < a.length ; i++)
      {
        ans[k++] = a[i];
      }
      for(int i = 0; i < b.length ; i++)
      {
        ans[k++] = b[i];
      }
      for(int i = 0; i < c.length ; i++)
      {
        ans[k++] = c[i];
      }
      return ans;
    }
    if(nums.charAt(0)=='3') 
    {
      String[] d = keyPadHelper(prev+'d', nums.substring(1));
      String[] e = keyPadHelper(prev+'e', nums.substring(1));
      String[] f = keyPadHelper(prev+'f', nums.substring(1));
      String[] ans = new String[d.length+e.length+f.length];
      int k = 0; 
      for(int i = 0; i < d.length ; i++)
      {
        ans[k++] = d[i];
      }
      for(int i = 0; i < e.length ; i++)
      {
        ans[k++] = e[i];
      }
      for(int i = 0; i < f.length ; i++)
      {
        ans[k++] = f[i];
      }
      return ans;
    }
    if(nums.charAt(0)=='4') 
    {
      String[] g = keyPadHelper(prev+'g', nums.substring(1));
      String[] h = keyPadHelper(prev+'h', nums.substring(1));
      String[] i1 = keyPadHelper(prev+'i', nums.substring(1));
      String[] ans = new String[g.length+h.length+i1.length];
      int k = 0; 
      for(int i = 0; i < g.length ; i++)
      {
        ans[k++] = g[i];
      }
      for(int i = 0; i < h.length ; i++)
      {
        ans[k++] = h[i];
      }
      for(int i = 0; i < i1.length ; i++)
      {
        ans[k++] = i1[i];
      }
      return ans;
    }
    if(nums.charAt(0)=='5') 
    {
      String[] a = keyPadHelper(prev+'j', nums.substring(1));
      String[] b = keyPadHelper(prev+'k', nums.substring(1));
      String[] c = keyPadHelper(prev+'l', nums.substring(1));
      String[] ans = new String[a.length+b.length+c.length];
      int k = 0; 
      for(int i = 0; i < a.length ; i++)
      {
        ans[k++] = a[i];
      }
      for(int i = 0; i < b.length ; i++)
      {
        ans[k++] = b[i];
      }
      for(int i = 0; i < c.length ; i++)
      {
        ans[k++] = c[i];
      }
      return ans;
    }
    if(nums.charAt(0)=='6') 
    {
      String[] a = keyPadHelper(prev+'m', nums.substring(1));
      String[] b = keyPadHelper(prev+'n', nums.substring(1));
      String[] c = keyPadHelper(prev+'o', nums.substring(1));
      String[] ans = new String[a.length+b.length+c.length];
      int k = 0; 
      for(int i = 0; i < a.length ; i++)
      {
        ans[k++] = a[i];
      }
      for(int i = 0; i < b.length ; i++)
      {
        ans[k++] = b[i];
      }
      for(int i = 0; i < c.length ; i++)
      {
        ans[k++] = c[i];
      }
      return ans;
    }
    if(nums.charAt(0)=='7') 
    {
      String[] a = keyPadHelper(prev+'p', nums.substring(1));
      String[] b = keyPadHelper(prev+'q', nums.substring(1));
      String[] c = keyPadHelper(prev+'r', nums.substring(1));
      String[] d = keyPadHelper(prev+'s', nums.substring(1));
      String[] ans = new String[a.length+b.length+c.length+d.length];
      int k = 0; 
      for(int i = 0; i < a.length ; i++)
      {
        ans[k++] = a[i];
      }
      for(int i = 0; i < b.length ; i++)
      {
        ans[k++] = b[i];
      }
      for(int i = 0; i < c.length ; i++)
      {
        ans[k++] = c[i];
      }
      for(int i = 0; i < d.length ; i++)
      {
        ans[k++] = d[i];
      }
      return ans;
    }
    if(nums.charAt(0)=='8') 
    {
      String[] a = keyPadHelper(prev+'t', nums.substring(1));
      String[] b = keyPadHelper(prev+'u', nums.substring(1));
      String[] c = keyPadHelper(prev+'v', nums.substring(1));
      String[] ans = new String[a.length+b.length+c.length];
      int k = 0; 
      for(int i = 0; i < a.length ; i++)
      {
        ans[k++] = a[i];
      }
      for(int i = 0; i < b.length ; i++)
      {
        ans[k++] = b[i];
      }
      for(int i = 0; i < c.length ; i++)
      {
        ans[k++] = c[i];
      }
      return ans;
    }
    if(nums.charAt(0)=='9') 
    {
      String[] a = keyPadHelper(prev+'w', nums.substring(1));
      String[] b = keyPadHelper(prev+'x', nums.substring(1));
      String[] c = keyPadHelper(prev+'y', nums.substring(1));
      String[] d = keyPadHelper(prev+'z', nums.substring(1));
      String[] ans = new String[a.length+b.length+c.length+d.length];
      int k = 0; 
      for(int i = 0; i < a.length ; i++)
      {
        ans[k++] = a[i];
      }
      for(int i = 0; i < b.length ; i++)
      {
        ans[k++] = b[i];
      }
      for(int i = 0; i < c.length ; i++)
      {
        ans[k++] = c[i];
      }
      for(int i = 0; i < d.length ; i++)
      {
        ans[k++] = d[i];
      }
      return ans;
    }
    return new String[0];
    
    
    
  }
	
}
