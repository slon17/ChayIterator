public class main {

    public static void main (String [ ] args) {
        INode aux1 = new NodeAux(1, null, null);
        INode aux2 = new NodeAux(2, null, null);
        INode firstNode = new NodeMain(3, aux1, null, aux2, null);
        ((NodeAux) aux1).setNodeRight((NodeMain) firstNode);
        ((NodeAux) aux2).setNodeRight((NodeMain) firstNode);


        INode aux3 = new NodeAux(4, (NodeMain) firstNode, null);
        INode aux4 = new NodeAux(5, (NodeMain) firstNode, null);

        firstNode.setAux(aux3);
        firstNode.setAux2(aux4);



        INode secondNode = new NodeMain(6, aux3, null, aux4, null);
        ((NodeAux) aux3).setNodeRight((NodeMain) secondNode);
        ((NodeAux) aux4).setNodeRight((NodeMain) secondNode);

        INode aux5 = new NodeAux(7, null, null);
        INode aux6 = new NodeAux(8, null, null);
        secondNode.setAux(aux5);
        secondNode.setAux2(aux6);



        INode thirdNode = new NodeMain(9, aux5, null, aux6, null);
        ((NodeAux) aux5).setNodeRight((NodeMain) thirdNode);
        ((NodeAux) aux6).setNodeRight((NodeMain) thirdNode);

        IIterator nodeIterator = firstNode.getIterator();
        System.out.println("Camino:");
        while (nodeIterator.hasNext()) {
            INode emp = (INode) nodeIterator.next();
            System.out.print(emp.getValue()+" ");
            nodeIterator= emp.getIterator();
        }

    }
}
