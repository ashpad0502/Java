package Trees;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImpl {
    private static BinaryTreeNode root = null;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println();
            System.out.println("---Binary Tree---");
            System.out.println("1. Exit");
            System.out.println("2. Pre order Display");
            System.out.println("3. Insert");
            System.out.println("4. Delete");
            System.out.println("5. Number of elements in tree");
            System.out.println("6. Search for an element: ");
            System.out.println("Enter choice: ");
            ch = sc.nextInt();
            switch(ch) {
                case 1 -> System.exit(0);

                case 2 -> {
                            System.out.println();
                            display(BinaryTreeImpl.getRoot());
                            System.out.println();
                          }
                case 3 -> {
                            System.out.println("Enter element to insert: ");
                            insert(sc.nextInt());
                            System.out.println();
                          } 
                case 4 -> {
                            System.out.println("Enter element to delete: ");
                            delete(sc.nextInt());
                            System.out.println();
                          }
                case 5 ->   System.out.println("Number of elements: "+countElements(getRoot()));
                
                case 6 ->   {
                                System.out.println("Enter element to search: ");
                                search(sc.nextInt());
                                System.out.println();
                            }
            }
        }while(ch != 1);
        sc.close();
    }

    public static BinaryTreeNode getRoot() {
        return BinaryTreeImpl.root;
    }

    public static void setRoot(BinaryTreeNode root) {
        BinaryTreeImpl.root = root;
    }

    public static void display(BinaryTreeNode currentNode) {
        if(currentNode != null) {
            System.out.print(currentNode.getData()+" ");
            display(currentNode.getLeftNode());
            display(currentNode.getRightNode());
        }
    }

    public static void insert(int data) {
        BinaryTreeNode currentNode = getRoot();
        if(currentNode == null) {
            setRoot(new BinaryTreeNode(data));
        }
        else {
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(currentNode);
            while(!q.isEmpty()) {
                BinaryTreeNode temp = q.poll();
                if(temp.getLeftNode() == null) {
                    temp.setLeftNode(new BinaryTreeNode(data));
                }
                else if(temp.getRightNode() == null) {
                    temp.setRightNode(new BinaryTreeNode(data));
                }
                else {
                    if(data <= temp.getData()) {
                        q.offer(temp.getLeftNode());
                    }    
                    else {
                        q.offer(temp.getRightNode());
                    }
                }
            }
        }
    }

    public static void delete(int data) {
        BinaryTreeNode currentNode = getRoot();
        boolean foundItem = false;
        if(currentNode == null) {
            System.out.println("Empty tree, cannot delete");
        }
        else if(data == currentNode.getData() && currentNode.getLeftNode() == null && currentNode.getRightNode() == null) {
            setRoot(null);
            foundItem = true;
        }
        else {
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(currentNode);
            BinaryTreeNode prevNode = currentNode;
            if(!q.isEmpty()) {
                BinaryTreeNode temp = q.poll();
                if(data < temp.getData()) {
                    if(temp.getLeftNode() != null) {
                        q.offer(temp.getLeftNode());
                        prevNode = temp;
                    }
                }
                else if(data > temp.getData()) {
                    if(temp.getRightNode() != null) {
                        q.offer(temp.getRightNode());
                        prevNode = temp;
                    }
                }
                else {
                    if(temp.getLeftNode() != null) {
                        temp.getLeftNode().setRightNode(prevNode.getRightNode());
                        prevNode.setRightNode(temp.getLeftNode());
                        temp = null;
                    }
                }
            }
        }
        if(foundItem) {
            System.out.println("Item deleted");
        }
        else {
            System.out.println("Item to delete not found");
        }
    }

    public static int countElements(BinaryTreeNode currentNode) {
        int counter = 0;
        if(currentNode != null) {
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(currentNode);
            while(!q.isEmpty()) {
                BinaryTreeNode temp = q.poll();
                counter++;
                if(temp.getLeftNode() != null) {
                    q.offer(temp.getLeftNode());
                }
                if(temp.getRightNode() != null) {
                    q.offer(temp.getRightNode());
                }
            }
        }
        return counter;
    }

    public static void search(int data) {
        BinaryTreeNode currentNode = getRoot();
        if(currentNode == null) {
            System.out.println("Empty tree");
        }
        else {
            boolean found = false;
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(currentNode);
            while(!q.isEmpty()) {
                BinaryTreeNode temp = q.poll();
                if(temp.getData() == data) {
                    found = true;
                    break;
                }
                else {
                    if(temp.getLeftNode() != null) {
                        q.offer(temp.getLeftNode());
                    }
                    if(temp.getRightNode() != null) {
                        q.offer(temp.getRightNode());
                    }
                }
            }
            if(found) {
                System.out.println("Item found");
            }
            else {
                System.out.println("Item not found");
            }
        }
    }
}
