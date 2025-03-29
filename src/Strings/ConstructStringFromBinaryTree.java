package src.Strings;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class ConstructStringFromBinaryTree {
    public static String tree2str(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    private static void preorder(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        sb.append(node.val);

        if (node.left != null || node.right != null) {
            sb.append("(");
            preorder(node.left, sb);
            sb.append(")");

            if (node.right != null) {
                sb.append("(");
                preorder(node.right, sb);
                sb.append(")");
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);

        System.out.println(tree2str(root)); // Output: "1(2()(4))(3)"
    }
}


