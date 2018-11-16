// Source:  https://www.baeldung.com/java-binary-tree
// https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

public class ImplementBST{

	public static void main(String[] args) {
		System.out.println("Implementing a BST");
		BST bst = new BST(); 

		/* Let's create a BST as follows: 
		              40 
		             /  \ 
		           20    60 
		          /  \   /  \ 
		        10   30  50  70 

		 */

		bst.insert(40); 
		bst.insert(20); 
		bst.insert(10); 
		bst.insert(30); 
		bst.insert(60); 
		bst.insert(50); 
		bst.insert(70); 
		
		System.out.println("The in-order traversal of the BST");
		bst.inorderTraverse(); 
		System.out.println();
		
		System.out.println("----------------------------------");
		
		
		System.out.println("The pre-order traversal of the BST");
		bst.preorderTraverse(); 
		System.out.println();
		
		System.out.println("The post-order traversal of the BST");
		bst.postorderTraverse(); 
	
	
	} 
} 


