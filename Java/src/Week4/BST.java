package Week4;

public class BST<Key extends Comparable<Key>, Value> {
     private Node root;

     private class Node{
         private Key key;
         private Value val;
         private Node left,right;

         public Node(Key key, Value val){
             this.key=key;
             this.val=val;
         }
     }

     public void put(Key key, Value val){
         root = put(root,key,val);
     }

    public Node put(Node x, Key key, Value val) { // this recursibvly keeps going till we get to null and place the ndoe there
        if (x == null) { // basically if there is no tree the root is nnull then
                            // we make this the root
            return new Node(key, val);
        }
        int cmp = key.compareTo(x.key); // compare the key we wan to add to the key we are at
        if (cmp < 0)
            x.left = put(x.left,key,val); // go into the left if null, place, if not continue
        else if(cmp>0)
            x.right = put(x.right,key,val); // go into the right
        else
            x.val = val; // replace it cause it exists
        return x;
    }

     public Value get(Key key){
         Node x = root;
         while(x!= null){
             int cmp = key.compareTo((x.key));
             if(cmp<0){
                 x=x.left;
             }else if(cmp>0) {
                 x = x.right;
             }else {
                 return x.val;
             }
         }
        return null;
     }

     public Key floor(Key key){
         Node x = floor(root, key);
         if(x == null){
             return null;
         }
         return x.key;
     }
     private Node floor(Node x, Key key){
         if(x == null){
             return null;
         }
         int cmp = key.compareTo(x.key);
         if(cmp == 0) return x;
         if(cmp<0) return floor(x.left,key);
         Node t = floor(x.right,key);
         if(t != null) return t;
         else return x;
     }
}
