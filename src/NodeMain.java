import java.util.ArrayList;

public class NodeMain implements INode<INode> {

    private int dato;
    private INode nodeUpLeft;
    private INode nodeUpRight;
    private INode nodeDownLeft;
    private INode nodeDownRight;
    private ArrayList<INode> visitedNodes;

    public NodeMain(int dato, INode nodeUpLeft, INode nodeUpRight, INode nodeDownLeft, INode nodeDownRight) {
        this.dato = dato;
        this.nodeUpLeft = nodeUpLeft;
        this.nodeUpRight = nodeUpRight;
        this.nodeDownLeft = nodeDownLeft;
        this.nodeDownRight = nodeDownRight;
        this.visitedNodes=new ArrayList<>();
    }

    public NodeMain() {
        this.visitedNodes=new ArrayList<>();
    }

    @Override
    public int getValue(){
        return dato;
    }

    @Override
    public void setAux(INode node) {
        setNodeUpRight(node);
    }

    @Override
    public void setAux2(INode node) {
        setNodeDownRight(node);
    }

    public void addVisited(INode node){
        visitedNodes.add(node);
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

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setNodeUpLeft(INode nodeUpLeft) {
        this.nodeUpLeft = nodeUpLeft;
    }

    public void setNodeUpRight(INode nodeUpRight) {
        this.nodeUpRight = nodeUpRight;
    }

    public void setNodeDownLeft(INode nodeDownLeft) {
        this.nodeDownLeft = nodeDownLeft;
    }

    public void setNodeDownRight(INode nodeDownRight) {
        this.nodeDownRight = nodeDownRight;
    }

    public int getAuxAmount(){
        int i = 0;
            if(nodeUpLeft!=null){
                i++;
            }
            if(nodeDownRight!=null){
                i++;
            }
            if(nodeDownLeft!=null){
                i++;
            }
            if(nodeUpRight!=null){
                i++;
            }
            return i;
    }

    @Override
    public IIterator<INode> getIterator() {
        return new weirdIterator();
    }

    private class weirdIterator implements IIterator<INode>{
        int visited=0;


        @Override
        public boolean hasNext() {
            if(visitedNodes.size()<getAuxAmount()) return true;
            else return false;
        }

        @Override
        public INode next() {
            INode next=null;
                if(nodeUpLeft!=null && !visitedNodes.contains(nodeUpLeft)){
                    next=nodeUpLeft;

                }
                else if(nodeDownLeft!=null && !visitedNodes.contains(nodeDownLeft)){
                    next=nodeDownLeft;
                }
                else if(nodeUpRight!=null && !visitedNodes.contains(nodeUpRight)){
                    next=nodeUpRight;
                    NodeAux aux =(NodeAux) nodeUpRight;
                    NodeMain aux2 = (NodeMain) aux.getNodeRight();
                    aux2.addVisited(nodeUpRight);
                }
                else if(nodeDownRight!=null){
                    next=nodeDownRight;
                    NodeAux aux =(NodeAux) nodeUpRight;
                    NodeMain aux2 = (NodeMain) aux.getNodeRight();
                    aux2.addVisited(next);
                }
            visitedNodes.add(next);
            return next;
        }
    }
}
