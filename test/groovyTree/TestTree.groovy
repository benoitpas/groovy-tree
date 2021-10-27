package groovyTree
import org.junit.Test

class TestTree {

    Leaf l = new Leaf<String>()
    Node ne = new Node<String>("e", l, l)
    Node nd = new Node("e", l, l)
    Node nc = new Node("c", nd, ne)
    Node nb = new Node("b", l, l)
    Node na = new Node("a", nb, nc)

    @Test
    void testAddID() {
        Node withId = na.addId(0)
        assert withId == 'bar'
    }


}
