package day31;

/*
Q3. Postorder Traversal

Problem Description
Given a binary tree, return the Postorder traversal of its nodes values.
 */

public class PostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Using Recursion - probably this code is wrong(will check it later)

//    ArrayList<Integer> ans=new ArrayList<Integer>();
//    public ArrayList<Integer> postorderTraversal(TreeNode A) {
//        if(A==null) return new ArrayList<>();
//        postorderTraversal(A.left);
//        postorderTraversal(A.right);
//        ans.add(A.val);
//        return ans;
//    }

    //Using Stack (Couldn't solve, this appreach is little bit confusing)

    // public ArrayList<Integer> postorderTraversal(TreeNode A) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     Stack<TreeNode> stack = new Stack<>();
    //     while(A!=null || !stack.isEmpty()){
    //         if(A!=null){
    //             stack.push(A);
    //             A = A.left;
    //         }else{
    //             TreeNode temp = stack.peek();
    //             if(temp.right==null){
    //                 ans.add(stack.peek().val);
    //                 stack.pop();
    //                 while(!stack.isEmpty() && temp==stack.peek().right){
    //                     temp = stack.pop();
    //                     ans.add(temp.val);
    //                 }
    //             }else{
    //                 A = A.right;
    //             }
    //         }
    //     }
    //     return ans;
    // }

}
