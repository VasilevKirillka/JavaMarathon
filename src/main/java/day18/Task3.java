package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root=new Node(20);  // корень(корневой узел)

        int [] numbers={14,23,11,16 ,22,9, 27,5,15,18,24,150,17,8,1, 32}; // создадим массив, все числа которого нужно поместить в это двоичное дерево
        for (int number : numbers){ // пройдемся по масиву numbers
            addNode(number, root); // для каждого числа вызывать метод addNode, который принимает число(number), которое нужно вставитьв дерево, и корень(root)
        }
        dfs(root);
    }
    private static void dfs(Node node){ //  метод поиска в глубину
        if(node == null){return;}
        dfs(node.getLeft()); // вызываем левое поддерево
        System.out.print(node.getValue() + " "); // выводим значени левого поддерева
        dfs(node.getRight()); // вызываем правое поддерево
        //System.out.print(node.getValue() + " "); //  выводим значени правого поддерева
    }
    private static void addNode(int insetValue, Node root){ // число которуе нужно встатвить и корень
        if(root == null){
            throw new IllegalArgumentException("Корневой узел должен быть не null");
        }
        Node nextNode = root; // указывает на корневой узел
        Node current = null; //

        while (nextNode !=null){
            current= nextNode;

            if(insetValue < current.getValue()){ // если вставляемое значение меньше значения текущего узла
                nextNode = current.getLeft(); // то мы уходим в левое поддерево
            } else {
                nextNode = current.getRight(); // иначе уходим в правое поддерево
            }
        }
        if(insetValue < current.getValue()){
            current.setLeft(new Node(insetValue));
        } else {
            current.setRight(new Node(insetValue));
        }

    }
}

class Node{ // класс узел
    private int value; // какое то занечение/ По умолчанию 1
    private Node left; // левый сын(узел). По умолчанию null
    private Node right; // правый сын(узел). По умолчанию null

    public Node(int value) { // для значения создаем конструктор
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {  // для узлов сеттеры
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}