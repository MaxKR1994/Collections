package Tree.SimpleTree;

public class Tree {
    public static void main(String[] args) {
        TreeN root = new TreeN(20,
                new TreeN(7,
                        new TreeN(4,null,new TreeN(6)),
                        new TreeN(9,null,null)),
                new TreeN(35,
                        new TreeN(31,new TreeN(28),null),
                        new TreeN(40, new TreeN(38), new TreeN(52))));
    }
    static class TreeN {
        int value;
        TreeN left;
        TreeN right;

        public TreeN(int value, TreeN left, TreeN right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public TreeN(int value) {
            this.value = value;
        }

        public int sumRecursive(TreeN root){
            int sum = value;
            if (left != null){
                sum += left.sumRecursive(root.left);
            }
            if (right != null){
                sum += right.sumRecursive(root.right);
            }
            return sum;
        }
    }
}