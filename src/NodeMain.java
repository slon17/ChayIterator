public class NodeMain implements INode<INode> {

    private int dato;
    private INode nodeUpLeft;
    private INode nodeUpRight;
    private INode nodeDownLeft;
    private INode nodeDownRight;

    public NodeMain(int dato, INode nodeUpLeft, INode nodeUpRight, INode nodeDownLeft, INode nodeDownRight) {
        this.dato = dato;
        this.nodeUpLeft = nodeUpLeft;
        this.nodeUpRight = nodeUpRight;
        this.nodeDownLeft = nodeDownLeft;
        this.nodeDownRight = nodeDownRight;
    }

    public int getDato() {
        return dato;
    }

    public INode getNodeUpLeft() {
        return nodeUpLeft;
    }

    public INode getNodeUpRight() {
        return nodeUpRight;
    }

    public INode getNodeDownLeft() {
        return nodeDownLeft;
    }

    public INode getNodeDownRight() {
        return nodeDownRight;
    }

    @Override
    public IIterator<INode> getIterator() {
        return null;
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
