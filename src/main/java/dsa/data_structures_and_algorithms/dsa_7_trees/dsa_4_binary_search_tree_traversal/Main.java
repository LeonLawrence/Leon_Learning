package dsa.data_structures_and_algorithms.dsa_7_trees.dsa_4_binary_search_tree_traversal;

public class Main {

    public static void main(String[] args) {

        Tree intTree = new Tree();

        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);


        intTree.traverseInOrder();
    }
}
