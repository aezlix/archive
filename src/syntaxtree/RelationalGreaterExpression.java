//
// Generated by JTB 1.3.2
//

package st4tic.syntaxtree;

/**
 * Grammar production:
 * f0 -> RelationalLessExpression()
 * f1 -> [ ( ">" | ">=" ) RelationalLessExpression() ]
 */
public class RelationalGreaterExpression implements Node {
   public RelationalLessExpression f0;
   public NodeOptional f1;

   public RelationalGreaterExpression(RelationalLessExpression n0, NodeOptional n1) {
      f0 = n0;
      f1 = n1;
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

