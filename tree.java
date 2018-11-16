import java.util.*;


public class Solution {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */

	public static void printZigZag(BinaryTreeNode<Integer> root) {
		

		// Write your code here		
      	ArrayDeque<BinaryTreeNode<Integer>> q1, q2;
      	q1 = new ArrayDeque<>();
      	q2 = new ArrayDeque<>();
      	int turn = 0;
      	ArrayList<Integer> list = new ArrayList<Integer>();
      	q1.push(root);
      	while(q1.size()>0)
        {
          if(turn==0)
          {
           	while(q1.size()>0)
            {
              if(q1.peek().left!=null) q2.add(q1.peek().left);
              if(q1.peek().right!=null) q2.add(q1.peek().right);
              list.add(q1.peek().data);
              q1.remove();
            }
            for(int i: list) System.out.print(i+" ");
            turn = 1;
          }
          else
          {
            while(q1.size()>0)
            {
              if(q1.peek().left!=null) q2.add(q1.peek().left);
              if(q1.peek().right!=null) q2.add(q1.peek().right);
              list.add(q1.peek().data);
              q1.remove();
            }
            for(int i = list.size()-1; i>=0; i--) System.out.print(list.get(i)+" ");
            turn = 0;
          }
          q1.clear();
          q1.addAll(q2);
          q2.clear();
          list.clear();
          System.out.println();
        }
      
	}


}
