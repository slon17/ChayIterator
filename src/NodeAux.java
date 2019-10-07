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

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setNodeLeft(INode nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public void setNodeRight(INode nodeRight) {
        this.nodeRight = nodeRight;
    }

    @Override
    public IIterator<INode> getIterator() {
        return new weirdIterator();
    }

    private class weirdIterator implements IIterator<INode>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public INode next() {
            return null;
        }
    }
}
