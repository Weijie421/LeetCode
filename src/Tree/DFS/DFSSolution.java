package Tree.DFS;

import Utils.TreeNode;

public class DFSSolution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = 1;
        int right = 1;
        if(root.left != null){
            left += maxDepth(root.left) + 1;
        }
        if(root.right != null){
            right += maxDepth(root.right) + 1;
        }
        return Math.max(left, right);
    }
}
