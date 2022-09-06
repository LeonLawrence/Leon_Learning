package dsa.data_structures_and_algorithms.dsa_7_trees.dsa_3_binary_search_tree_insertion;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }
}
