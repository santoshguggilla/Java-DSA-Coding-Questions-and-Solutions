package Leetcode;

public class BSTGreaterSum {
	private static TreeNode root;
	 static int cumulativeSum=0;
    public BSTGreaterSum() {
        BSTGreaterSum.root = null;
    }
	public static void main(String[] args) {
		int[] list = {4,1,6,0,2,5,7,3,8};
		BSTGreaterSum converter = new BSTGreaterSum();

        for (int data : list) {
        	converter.insert(data);
        };

        
        BSTGreaterSum.bstToGst(root);

        // Print the converted BST (in-order should show the updated values)
        converter.printInOrder(root);
	}
	 public void insert(int data) {
	        root = insertRecursive(root, data);
	    }

	    private TreeNode insertRecursive(TreeNode currentNode, int data) {
	        if (currentNode == null) {
	            return new TreeNode(data);
	        }

	        if (data < currentNode.val) {
	            currentNode.left = insertRecursive(currentNode.left, data);
	        } else if (data > currentNode.val) {
	            currentNode.right = insertRecursive(currentNode.right, data);
	        } else {
	            // handle duplicates (optional: throw an exception or ignore)
	        }

	        return currentNode;
	    }
	 public void printInOrder(TreeNode root) {
	        if (root != null) {
	            printInOrder(root.left);
	            System.out.print(root.val + " ");
	            printInOrder(root.right);
	        }
	    }
	
	public static TreeNode bstToGst(TreeNode root) {
        reverseInOrderTraversal(root);
         return root;
    }

    public static void reverseInOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        reverseInOrderTraversal(node.right);

        cumulativeSum += node.val;
        node.val = cumulativeSum;

        reverseInOrderTraversal(node.left);
    }

}
 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
