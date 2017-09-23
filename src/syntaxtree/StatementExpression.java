//
// Generated by JTB 1.3.2
//

package st4tic.syntaxtree;

/**
 * Grammar production:
 * f0 -> VariableDeclaration()
 *       | VariableAssign()
 *       | JavaStaticMethods()
 *       | IfExpression()
 *       | WhileExpression()
 */
public class StatementExpression implements Node {
   public NodeChoice f0;

   public StatementExpression(NodeChoice n0) {
      f0 = n0;
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

