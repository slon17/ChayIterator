public class NodeAux implements INode<INode> {

    private int dato;
    private INode nodeLeft;
    private INode nodeRight;

    public NodeAux(int dato, INode nodeLeft, INode nodeRight) {
        this.dato = dato;
        this.nodeLeft = nodeLeft;
        this.nodeRight = nodeRight;
    }

    public int getDato() {
        return dato;
    }

    public INode getNodeLeft() {
        return nodeLeft;
    }

    public INode getNodeRight() {
        return nodeRight;
    }

    @Override
    public IIterator<INode> getIterator() {
        return null;
    }
}
