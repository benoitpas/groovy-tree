package groovyTree
import org.junit.Test

class TestTree {

    Leaf leaf = new Leaf<String>()
    Node ne = new Node<String>("e", leaf, leaf)
    Node nd = new Node("d", leaf, leaf)
    Node nc = new Node("c", nd, ne)
    Node nb = new Node("b", leaf, leaf)
    Node na = new Node("a", nb, nc)

    @Test
    void testAddID() {
        Tree leaf = new Leaf<String>()
        def newNode = {String s, Integer i, Tree l,Tree r ->
            new Node(new Tuple2<String,Integer>(s,i),l,r)}
        Node expected = newNode("a", 4,
                newNode("b",0, leaf, leaf),
                newNode("c",3,
                    newNode("d",1, leaf, leaf),
                    newNode("e",2, leaf,leaf)))

        def withId = na.addId(0)
        assert expected == withId.first
    }


}
