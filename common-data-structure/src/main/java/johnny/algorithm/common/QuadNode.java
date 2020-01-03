package johnny.algorithm.common;

public class QuadNode {
    public boolean val;
    public boolean isLeaf;
    public QuadNode topLeft;
    public QuadNode topRight;
    public QuadNode bottomLeft;
    public QuadNode bottomRight;

    public QuadNode() {}

    public QuadNode(boolean _val, boolean _isLeaf, QuadNode _topLeft, QuadNode _topRight, QuadNode _bottomLeft, QuadNode _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
}
