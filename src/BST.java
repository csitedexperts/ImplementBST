public class BST {
	// Root of BST 
	Node root; 
	// Constructor 
	BST() {  
		root = null;  
	} 
	public boolean isEmpty() {
		return root == null;
	}

	// This method mainly calls insertRec() 
	void insert(int data) { 
		root = insertRec(root, data); 
	} 

	/* A recursive function to insert a new data in the BST */
	Node insertRec(Node root, int data) { 
		/* If the tree is empty, return a new node */
		if (root == null) { 
			root = new Node(data); 
			return root; 
		} 
		/* Otherwise, recur down the tree */
		if (data < root.data) 
			root.left = insertRec(root.left, data); 
		else if (data > root.data) 
			root.right = insertRec(root.right, data); 

		/* return the (unchanged) node pointer */
		return root; 
	} 

	/*	Searching in BST: 

	Depth-first search is a type of traversal that goes deep 
	as much as possible 
	in every child before exploring the next sibling.

	There are several ways to perform a depth-first search: 
	in-order, pre-order and post-order.

	 */	
	// This method mainly calls InorderRec() 
	void inorderTraverse()  { 
		traverseInOrder(root); 
	} 

	/*
	The in-order traversal consists of first visiting 
	the left sub-tree, then the root node, 
	and finally the right sub-tree:
	Technique to remember: 
	In-order => Print the node in between the left and right nodes
	 */		

	// A utility function to do in-order traversal of BST 
	void traverseInOrder(Node node) { 
		if (node != null) { 
			traverseInOrder(node.left); 
			System.out.print(node.data + " "); 
			traverseInOrder(node.right); 
//	In-order => Print the node IN-BETWEEN the left and right nodes
					
		} 
	} 
	// This method mainly calls PreorderRec() 
	void preorderTraverse()  { 
		traversePreOrder(root); 
	} 
	/* 	Pre-order traversal visits first the root node, 
	 * then the left subtree, and finally the right subtree:
	 * 
	 * Pre-order => The root node will be first
	 */	
	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.data);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
//			Pre-order => Print the node BEFORE the left and right nodes

		}
	}

	// This method mainly calls PostorderRec() 
	void postorderTraverse()  { 
		traversePostOrder(root); 
	} 

	/*
    Post-order traversal visits the left subtree, the right subtree, and the root node at the end:

	 */
	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			
			System.out.print(" " + node.data);
//			Pre-order => Print the node AFTER the left and right nodes
		}
	}
	
	// This method deletes the current node with the given data
	public void delete(int data) {
	    root = deleteRecursive(root, data);
	}
	
	private Node deleteRecursive(Node current, int data) {
	    if (current == null) {
	        return null;
	    }
	 
	    if (data == current.data) {
	        // Node to delete found
	        // ... code to delete the node will go here
	    } 
	    if (data < current.data) {
	        current.left = deleteRecursive(current.left, data);
	        return current;
	    }
	    current.right = deleteRecursive(current.right, data);
	    return current;
	}

}

