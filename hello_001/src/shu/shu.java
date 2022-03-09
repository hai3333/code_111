package shu;

public class shu {
    public static void main(String[] args) {
        //创建二叉树
        BinaryTree binaryTree=new BinaryTree();
        // 创建节点
        Node root=new Node(1,"松江");
        Node node2= new Node(2,"无用");
        Node node3=new Node(3,"李继业");
        Node node4=new Node(4,"松两次");
        // 先手栋创建二叉树
        root.setLeft(node2);
        root.setRight(node3);
        node3.setRight(node4);
        binaryTree.setRoot(root);
        //bianli
        System.out.println("前序");
        binaryTree.postOrder();



    }
}

//定义树
class BinaryTree{
    private Node root;

    public void setRoot(Node root){
        this.root=root;
    }
    //qianxu
    public  void preOrder(){
        if(this.root!=null){
            this.root.preOrder();
        }else{
            System.out.println("二叉树空");
        }
    }
    //中
    public  void infixOrder(){
        if(this.root!=null){
            this.root.infixOrder();
        }else{
            System.out.println("二叉树空");
        }
    }
    // hou
    public  void postOrder(){
        if(this.root!=null){
            this.root.preOrder();
        }else{
            System.out.println("二叉树空");
        }
    }

}


class Node{
    private  int No;
    private String name;
    private Node left; //默认null
    private  Node right; //默认null
    public Node(int No, String name){
        this.No=No;
        this.name=name;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "No=" + No +
                ", name='" + name + '\'' +
                '}';
    }

    // 前序遍历
    public void preOrder(){
        System.out.println(this); //fu
        //递归向坐
        if(this.left!=null){
            this.left.preOrder();
        }
        if(this.right!=null){
            this.right.preOrder();
        }
    }
    // 中序遍历
    public void infixOrder(){
        //zuo
    if(this.left!=null){
        this.left.infixOrder();
    }
    //fu
        System.out.println(this);
    //you
        if(this.right!=null){
            this.right.infixOrder();
        }
    }
    // 后序遍历
    public void postOrder(){
        if(this.left!=null){
            this.left.postOrder();
        }
        if(this.right!=null){
            this.right.postOrder();
        }
        System.out.println(this);
    }

}
