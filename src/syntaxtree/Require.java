//
// Generated by JTB 1.3.2
//

package st4tic.syntaxtree;

/**
 * Grammar production:
 * f0 -> "require"
 * f1 -> ( <IDENTIFIER> )+
 */
public class Require implements Node {
   public NodeToken f0;
   public NodeList f1;

   public Require(NodeToken n0, NodeList n1) {
      f0 = n0;
      f1 = n1;
   }

   public Require(NodeList n0) {
      f0 = new NodeToken("require");
      f1 = n0;
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

