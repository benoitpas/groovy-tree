class App {
    // Feel immediately at home with groovy
    // not annoying ';' like in Scala
    static void main(String[] args) {
        Leaf l = new Leaf()
        Node ne = new Node("e", l, l)
        Node nd = new Node("e", l, l)
        Node nc = new Node(nd,ne)
        Node nb = new Node("b", l, l)
        Node na = new Node("a", nb, nc)
    }
}
