//
// Generated by JTB 1.3.2
//

package st4tic.syntaxtree;

/**
 * Grammar production:
 * f0 -> <IDENTIFIER>
 * f1 -> ( ":" <IDENTIFIER> )+
 * f2 -> "("
 * f3 -> MathExpression()
 * f4 -> ( "," MathExpression() )*
 * f5 -> ")"
 * f6 -> "."
 */
public class JavaStaticMethods implements Node {
   public NodeToken f0;
   public NodeList f1;
   public NodeToken f2;
   public MathExpression f3;
   public NodeListOptional f4;
   public NodeToken f5;
   public NodeToken f6;

   public JavaStaticMethods(NodeToken n0, NodeList n1, NodeToken n2, MathExpression n3, NodeListOptional n4, NodeToken n5, NodeToken n6) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
   }

   public JavaStaticMethods(NodeToken n0, NodeList n1, MathExpression n2, NodeListOptional n3) {
      f0 = n0;
      f1 = n1;
      f2 = new NodeToken("(");
      f3 = n2;
      f4 = n3;
      f5 = new NodeToken(")");
      f6 = new NodeToken(".");
   }

   public void accept(st4tic.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(st4tic.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(st4tic.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(st4tic.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

