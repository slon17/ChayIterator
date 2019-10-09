public interface INode<T>{
    IIterator<T> getIterator();
    int getValue();
    void setAux(INode node);
    void setAux2(INode node);
}
