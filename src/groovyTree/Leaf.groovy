package groovyTree

class Leaf<T> implements Tree<T> {
    Tuple2<Tree<Tuple2>, Integer> addId(Integer index) {
        return new Tuple2<Tree<Tuple2>, Integer>(this,index)
    }

    @Override
    String toString() {
        return ""
    }
}
