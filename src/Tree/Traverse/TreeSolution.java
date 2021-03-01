package Tree.Traverse;

import Utils.TreeNode;

import java.util.*;

public class TreeSolution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
//        midTraverseInorderTraversal(root, ret);
        midTraverseInorderTraversalIteration(root, ret);
        return ret;
    }
    //iteration
    private void midTraverseInorderTraversalIteration(TreeNode root, List<Integer> ret){
        Deque<TreeNode> stack = new LinkedList<>();
        if(root == null){
            return;
        }
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ret.add(root.val);
            root = root.right;
        }
    }
    //recursion
    private void midTraverseInorderTraversal(TreeNode root, List<Integer> ret){
        if(root == null){
            return;
        }
        if(root.left != null){
            midTraverseInorderTraversal(root.left, ret);
        }
        ret.add(root.val);
        if(root.right != null){
            midTraverseInorderTraversal(root.right, ret);
        }
    }
}
