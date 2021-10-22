class Leaf implements Tree {
    @Override
    Tuple2<Tree<Tuple2>, Integer> addId(Tree tree, Integer index) {
        return new Tuple2<Tree<Tuple2>, Integer>(this,index)
    }
}
