package BinarySearchTree;

public class BinarySearchTree {
    Node root;

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.put("a", "a");
//        System.out.println( bst.get("a") );
        bst.put("b", "b");
//        System.out.println( bst.get("b") );
        bst.put("c", "c");
        bst.put("2", "2");
        bst.put("1", "1");
//        bst.put("9","a");
        bst.put("a", "a1");
        System.out.println(bst.get("a"));
        System.out.println(bst.get("b"));
        System.out.println(bst.get("c"));
        System.out.println(bst.get("2"));
        System.out.println(bst.get("1"));
        System.out.println(bst.get("a"));
        System.out.println(bst.get("a2"));


    }

    private static class Node {
        private String key;
        private String value;
        private Node leftNode;
        private Node rightNode;

    }

    String get(String key) {
        Node x = root;
        while (x != null) {
            if (key.compareTo(x.key) < 0) {
                x = x.leftNode;

            } else if (key.compareTo(x.key) > 0) {
                x = x.rightNode;
            } else {
                return x.value;
            }
        }

        return null;
    }


    void put(String key, String value) {
        Node tmpNode = new Node();
        tmpNode.key = key;
        tmpNode.value = value;

        if (root == null) {
            root = tmpNode;
            return;
        }

        Node x = root;
        while (true) {
            if (key.compareTo(root.key) < 0) {
                if (x.leftNode == null) {
                    x.leftNode = tmpNode;
                    break;
                }
                x = x.leftNode;
            } else if (key.compareTo(root.key) > 0) {
                if (x.rightNode == null) {
                    x.rightNode = tmpNode;
                    break;
                }
                x = x.rightNode;
            } else {
                x.value = value;
                break;
            }
        }
    }


//    void put(String key, String value){
//        root = put(root,key,value);
//
//    }
//
//    private Node put(Node root, String key, String value) {
//        if (root == null){
//            root = new Node();
//            root.key = key;
//            root.value = value;
//            return root;
//        }
//
//        if (key.compareTo(root.key) < 0 ) {
//            root.leftNode = put(root.leftNode, key, value);
//        } else
//        if (key.compareTo(root.key) > 0) {
//            root.rightNode = put(root.rightNode, key, value);
//        }
//        else {
//            root.value = value;
//        }
//
//        return root;
//    }


    void delete(String key){
        //toto este nevies
    }

}
