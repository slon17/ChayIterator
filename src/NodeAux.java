import java.util.ArrayList;

public class NodeAux implements INode<INode> {

    private int dato;
    private NodeMain nodeLeft;
    private NodeMain nodeRight;


    public NodeAux(int dato, NodeMain nodeLeft, NodeMain nodeRight) {
        this.dato = dato;
        this.nodeLeft = nodeLeft;
        this.nodeRight = nodeRight;

    }

    public NodeAux() {

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

    public void setNodeLeft(NodeMain nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public void setNodeRight(NodeMain nodeRight) {
        this.nodeRight = nodeRight;
    }

    public int getMainAmount(){

        int i = 0;
        if(nodeLeft!=null){
            i++;
        }
        if(nodeRight!=null){
            i++;
        }

        return i;

    }
    @Override
    public int getValue(){
        return dato;
    }

    @Override
    public void setAux(INode node) {

    }

    @Override
    public void setAux2(INode node) {

    }


    @Override
    public IIterator<INode> getIterator() {
        return new weirdIterator() ;
    }

    private class weirdIterator implements IIterator<INode> {
        int visited=0;
        ArrayList<INode> visitedNodes=new ArrayList<>();
        @Override
        public boolean hasNext() {

            if(nodeRight!=null || nodeLeft!=null) {
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public INode next() {

            INode next=new NodeMain();

            if(nodeRight!=null){
                if(nodeRight.getNodeDownLeft()!=null && nodeRight.getNodeDownLeft()!= NodeAux.this){
                    next=(INode) nodeRight.getNodeDownLeft();
                    nodeRight.addVisited(next);
                }

                else {
                    next=nodeRight;
                }
            }


            return (INode) next;
        }
    }
}
