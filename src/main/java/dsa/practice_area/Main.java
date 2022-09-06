package dsa.practice_area;

public class Main {
    public static void main(String[] args) {
        Node firstNode = new Node("I am a Node!");
        Node secondNode = new Node("I am a second Node!");

        firstNode.setNextNode(secondNode);
        System.out.println(firstNode.next.data);

        System.out.println(firstNode.getNextNode().data);

    }
}
