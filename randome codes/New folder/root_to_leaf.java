import java.util.*;

public class root_to_leaf {
    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree();

        Scanner sc = new Scanner(System.in);
        try {
            int k = sc.nextInt();
            bt.RootToLeafSum(bt.root,0,k,"");
        } catch(Exception e)
	    {
	        sc.close();
	    }
    }
    // public static void main(String args[]) {
    //     BinaryTree bt = new BinaryTree();
    //     Scanner sc = new Scanner(System.in);
    //     int k = sc.nextInt();
    //     bt.RootToLeafSum(bt.root,0,k,"");


    //     // sc.close();
    // }

}

class BinaryTree {
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int ali)
		{
			data = ali;
		}
	}
	
	Node root;
	Scanner sc = new Scanner(System.in);
	public BinaryTree()
	{
		root = create();
	}
	private Node create()
	{
		Node nn = new Node(sc.nextInt());
		if(sc.nextBoolean())
		{
			nn.left = create();
		}
		if(sc.nextBoolean())
		{
			nn.right = create();
		}
		return nn;
	}
	
	public void RootToLeafSum(Node nn, int sum, int target, String ans)
	{
		if(nn==null)
		{
			return;
		}
		if(nn.left==null && nn.right==null)
		{
			if(nn.data + sum==target)
			{
				System.out.println(ans+nn.data);
			}
			return;
		}
		if(sum>target)
		{
			return;
		}
		RootToLeafSum(nn.left, sum + nn.data, target, ans+ nn.data+" ");
		RootToLeafSum(nn.right,sum + nn.data, target, ans+ nn.data+" ");
	}
}