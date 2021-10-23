import groovyTree.*

class App {
    // Feel immediately at home with groovy
    // not annoying ';' like in Scala
    //
    // interpreted !!!! Need to run a lot more to get types right, better to use TDD
    static void main(String[] args) {
        Leaf l = new Leaf<String>()
        Node ne = new Node<String>("e", l, l)
        Node nd = new Node("e", l, l)
        Node nc = new Node("nc", nd, ne)
        Node nb = new Node("b", l, l)
        Node na = new Node("a", nb, nc)

        println(na)
    }
}
