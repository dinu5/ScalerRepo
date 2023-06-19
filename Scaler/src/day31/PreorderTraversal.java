package day31;

/*
Q2. Preorder Traversal

Problem Description
Given a binary tree, return the preorder traversal of its nodes values.
 */

public class PreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Using Recursion

    // ArrayList<Integer> ans=new ArrayList<>();
    // public ArrayList<Integer> preorderTraversal(TreeNode A) {
    //     if(A==null) return new ArrayList<>();
    //     ans.add(A.val);
    //     preorderTraversal(A.left);
    //     preorderTraversal(A.right);
    //     return ans;
    // }

    //Using Stack

//    public ArrayList<Integer> preorderTraversal(TreeNode A) {
//        ArrayList<Integer> ans=new ArrayList<>();
//        Stack<TreeNode> stack=new Stack<>();
//        while(A!=null || !stack.isEmpty()){
//            if(A!=null){
//                ans.add(A.val);
//                stack.push(A);
//            }
//            
//            if(A!=null && A.left!=null){
//                A = A.left;
//            }else{
//                A = stack.peek();
//                A = A.right;
//                stack.pop();
//            }
//        }
//        return ans;
//    }
	
}
