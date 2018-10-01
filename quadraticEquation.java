import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
      	int a = s.nextInt(), b = s.nextInt(), c =s.nextInt();
      	double u = ((b*b)-4*a*c);
      	if(u==0) System.out.println(0);
      	else if(u>0) System.out.println(1);
      	else System.out.println(-1);
      	if(u>=0)
        {
          	if(a==0) System.out.println(c+" "+c);
          	else
            {
              	double root1 = (Math.sqrt(u) - b)/(2*a);
                double root2 = -(Math.sqrt(u) + b)/(2*a);
              	long r1 = Math.round(root1);
              	long r2 = Math.round(root2);
                System.out.println(r1 + " " + r2);
            }
          	
        }
      

	}
}
