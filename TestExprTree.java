public class TestExprTree {
    public static void main(String[] args) {
        ExprTree tree1 = new ExprTree();
        ExprTree tree2 = new ExprTree();
        ExprTree tree3 = new ExprTree();
        ExprTree tree4 = new ExprTree();
        ExprTree tree5 = new ExprTree();
        ExprTree tree6 = new ExprTree();

        tree1.build("+34");
        tree2.build("*+34/52");
        tree3.build("-/*9321");
        tree4.build("*4+6-75");
        tree5.build("/02");
        tree6.build("7");

        tree1.expression();
        System.out.println(" = " +tree1.evaluate());

        tree2.expression();
        System.out.println(" = " +tree2.evaluate());

        tree3.expression();
        System.out.println(" = " +tree3.evaluate());

        tree4.expression();
        System.out.println(" = " +tree4.evaluate());

        tree5.expression();
        System.out.println(" = " +tree5.evaluate());

        tree6.expression();
        System.out.println(" = " +tree6.evaluate());
    }
}
