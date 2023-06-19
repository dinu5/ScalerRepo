package day31;

public class InorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Using recursion

    // ArrayList<Integer> ans=new ArrayList<>();
    // public ArrayList<Integer> inorderTraversal(TreeNode A) {
    //     if(A==null) return new ArrayList<>();
    //     inorderTraversal(A.left);
    //     ans.add(A.val);
    //     inorderTraversal(A.right);
    //     return ans;
    // }

    //Using Stack

//    public ArrayList<Integer> inorderTraversal(TreeNode A) {
//        ArrayList<Integer> ans=new ArrayList<>();
//        Stack<TreeNode> stack=new Stack<>();
//        TreeNode temp = A;
//        while(temp!=null || !stack.isEmpty()){
//            if(temp!=null){
//                stack.push(temp);
//                temp = temp.left;
//            }else{
//                temp = stack.peek();
//                ans.add(temp.val);
//                stack.pop();
//                temp = temp.right;
//            }
//        }
//        return ans;
//    }

}
