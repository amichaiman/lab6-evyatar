public class ExprTree {
    private ExprTreeNode root;
    /* used for building tree */
    private String expression;
    /* original expression in prefix, as sent by user*/
    private String originalExpression;

    public ExprTree(){
        /* calls GC */
        root = null;
    }
    public void build(String expression){
        this.expression = expression;
        originalExpression = expression;
        root = buildInner();
    }
    private ExprTreeNode buildInner(){
        ExprTreeNode cur = new ExprTreeNode(expression.charAt(0));
        /* digit indicates leaf */
        if (Character.isDigit(expression.charAt(0))){
            /* remove node's digit from string */
            expression = expression.substring(1);
            return cur;
        }
        /* remove node's character from string */
        expression = expression.substring(1);
        cur.setLeft(buildInner());
        cur.setRight(buildInner());

        return cur;
    }
    public void expression(){
        expressionInner(root);
    }

    private void expressionInner(ExprTreeNode root) {
        if (root == null){
            return;
        }
        System.out.print("(");
        expressionInner(root.getLeft());
        System.out.print(root.getKey());
        expressionInner(root.getRight());
        System.out.print(")");
    }

    public float evaluate(){
        return evaluateInner(root);
    }

    private float evaluateInner(ExprTreeNode cur) {
        if (Character.isDigit(cur.getKey())){
            return cur.getKey()-'0';
        }
        float leftValue = evaluateInner(cur.getLeft());
        float rightValue = evaluateInner(cur.getRight());

        switch (cur.getKey()){
            case '*':
                return leftValue*rightValue;
            case '+':
                return leftValue+rightValue;
            case '-':
                return leftValue-rightValue;
            case '/':
                return leftValue/rightValue;
        }
        return 0;
    }

    public void clear(){
        root = null;
    }
    public void showStructure( ){
        /* print original string in O(1) */
        System.out.println(originalExpression);
    }
}