public class main {

    public static void main (String [ ] args) {
        INode aux1 = new NodeAux(1, null, null);
        INode aux2 = new NodeAux(2, null, null);
        INode firstNode = new NodeMain(3, aux1, null, aux2, null);
        ((NodeAux) aux1).setNodeRight(firstNode);
        ((NodeAux) aux2).setNodeRight(firstNode);

        INode aux3 = new NodeAux(4, firstNode, null);
        INode aux4 = new NodeAux(5, firstNode, null);
        INode secondNode = new NodeMain(6, aux3, null, aux4, null);
        ((NodeAux) aux3).setNodeRight(secondNode);
        ((NodeAux) aux4).setNodeRight(secondNode);

        INode aux5 = new NodeAux(7, null, null);
        INode aux6 = new NodeAux(8, null, null);
        INode thirdNode = new NodeMain(9, aux5, null, aux6, null);
        ((NodeAux) aux5).setNodeRight(thirdNode);
        ((NodeAux) aux6).setNodeRight(thirdNode);

    }
}
