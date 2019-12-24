import java.util.*;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int value;
    public TreeNode(int value){
        this.value = value;
    }
}

public class BinaryTree {
    public Node find(Node root, int value){
        if(root == null)
            return root;
        if(root.value == value)
            return root;
        Node node = find(root.left, value);
        if(node != null)
            return node;
        return find(root.right, value);
    }
}

class Solution {
    public void _preOrder(TreeNode root, List<Integer> list){
        if(root != null){
            list.add(root.val);
            _preOrder(root.left, list);
            _preOrder(root.right, list);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        _preOrder(root, list);
        return list;
    }
}
}