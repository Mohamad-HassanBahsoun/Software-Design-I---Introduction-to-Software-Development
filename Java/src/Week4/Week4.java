package Week4;

public class Week4 {

    //Priority Queues
    // API and elementary implementations
    // Priority queue remove the largest(or smallest) item
    // insert: insert a key into the priorty queue
    // deMax: return and remove the largest key
    // isEmpty: is the priority queue empty
    // When we insert a random key into an ordered array implementation of  PQ
    // the array accesses are linear, and the compares are logarithmic (Binary search)
    //-------------------------------------
    // Binary Heaps
    // Base don a complete binary tree: perfectly balanced, except for the bottom level
    // the height of a complete tree of N nodes is lg N
    // the height only increases when N is a power of 2
    // Heap ordered binary tree (array Imp): keys are in nodes
    // ^ the parents key is no small than the children key
    // largest key os at the root, and we generally start at the second index a1[]
    // parent of node k is at k/2
    // children of node k are at 2k and 2k+1
    // if the child's' key is larger than the parents we exchange the key in child with key in parent, repeat until order is restored.
    // ^ called swim
    // when we insert a new element we add it to the end, and then swim it up (1+lg N)
    // If a parent key becomes smaller than one or both of its children
    // to fix we swap it with the largest of the two children. called sinking
    // to delete the max we change the root with the end, remove the end, and then we sink the root back down
    // insert and delMax for a binary heap happen in log N time
    // Unordered 1 N, ordered N 1
    // an assumption we make is that the client does not change keys while on PQ
    //--------------------------------------------------
    // heapsort
    // create a max heap with all N keys, repeatedly remove the maximum key
    // we basically remove the maximum by placing it at the ned of the array and acting like its not there, by doing this
    // we are placing them into their correct spot thus having an ordered array at the end.
    // heap construction uses <= 2N compares and exchanges
    // heapsort uses <= 2N lg N compares and exchanges

    //Heapsort is optimal for both time and space
    // inner loop is longer than quicksort
    // makes poor use of cache memory
    // not stable
    //------------------------------------------------------------------------------
    //Symbol Tables
    //
    // Key value pair
    //     insert a value with a specified key
    //     given a key we want to search for the value
    // think about associated a value with one key
    // like each value gets whatever index is identified by that key
    // put (Key key, Vale val): like doing a[key]= val
    // delete(Key key): remove the key from teh table
    // get(Key key): value pared with key (null if key is absent) a[key]
    // contains(Key key): is there a value pared with this key
    // isempty, size, Iterable
    // we dont allow null values, we just return null if the key is not present in the table
    // put with overwrite the old value witha new value

    // Value will be type generic
    // Key will be of comparable type, use compareTo (more effecient if we can order)
    // if not comparable we assume generic type and use equals operation

    // Equality test (maybe nit needed) basically test for reflecitivty, symmetry, tansitivity, and nin-null
    //------------------------------------------------
    //elementary implemenntaions:
    // Linkedlist: maintaina LL of key-value pairs. search: scan through all keys until you find a match, Insert: scan through
    //              all keys until find a match , if no match you add it to teh front
    // Binary search in an ordered array: maintain an ordered aray of key-value paris
    //                                    use parallel arrays one for keys and one for values
    // Ordered symbol table API
    // put, get,delete, isempty, contains, size
    // min smallest key, max, the largest key,
    // floor largest key less than or equal to it
    // ceil smallest key greater than or equal
    // rank number of keys less than a said key
    // delete min, delete max,
    //------------------------------------------------------------
    // Binary search trees (symbol table imp i believe, the imp we used was also with linked list)
    // A BST is a binary tree in symmetric order
    // BT is either empty or two disjoint binary trees (left and right)
    // Symmetric means that every node has a key, larger than all keys in its left subtree, and smaller than al the keys in its right subtree
    // Node is composed of four fields: a ey and a value, reference to left and right subtree
    // get: number of compares is equal to 1 +depth of node we are searching for
    // put: key in tree then we reset value, if not we add.
    // number of compares is based on how the keys have been put in
    // best case is when the tree is balances, typical is sort of, worst case is if they for example are only on the right side
    // BST is kinds like quicksort
    // if N distinct keys are inserted into a BST in random order, the number of compares for a search/insert is ~2 ln N
    // the worst case height is N
    // -------------------------------------------
    // Ordered Operations
    // Minimum: smallest key in table, in a BST we move into the left sid eof the tree
    // Maximum: largest key in table, in BSR we move into the right side of the tree
    // Floor: largest key <= a given key: case 1 is to check the key at the root, and compare to see if we go left or to the right, then we check that, and so on and so forth
    // Ceil: smallest key >= a given key:
    // to remove a node with a given key we set the value to null, leave key in tree to guide searches (general way)
    // to delete the minimum we go th left unit we get a null left link, replace that node with its right link, update subtree counts
    // Hibbard deletion: Case 0 (0 children): delete by setting parent link to null
    //                  Case 1 (1 child) delete the node by replacing the parent link
    //                  Case 2 (2 children): take the node you want to delete go into the right child and ut it inplace of the node you want to delete and what was its parent is now its child
    //                                       and the lef to the deleted one is now the child of the one you replaced it with
    // -------------------------------------------------------------------------------------
    // Balanced Search Trees
    //
    //
    // 2-3 Tree: generalization of BSt to guarantee fast performance
    // Allow 1 or 2 keys per node
    //      2 node: one key wo children
    //      3 node: two keys three children
    // the order is the same for 2 node: left is smaller keys, right is larger
    // for 3 node its a bit different: if we have 2 keys E J , then left is keys smaller than E, right are keys larger that J, and the middle are keys that are between E and J
    // 2-3 search: compare search key against keys in node, find interval containing search key, follow that link recursivly
    // 2-3 insert (2node): take it where its supposed to go then make it a 2Node (was 1 key now 2 keys), and order it such that the smaller is on the left bigger on the right
    // 2-3 insert (3node): take it to where its supposed to go, then it become a temp 4 node, then we split it by taking the middle key and joining it witht he parent. parent wasa 2 node now its a three node
    // when inserting where ever we are to place it it becomes a 2 node then 3 node then temp 4 to split it then keep going
    //      even if the first one is one you make it a 2 then 3 then split and so on
    // Tree height
    //      Worst case: lg N
    //      Best case : lg 3 N
    // guaranteed logarithmic performance for search and insert
    //
    //
    // Red-black BST's
    // No node has two red links connected to it
    // every path from root to null link has the same number of back lines
    // read links lean left
    // from a 3 node the larger key becomes the root, the red links the other part of the 3node to the left right of root is ones greater than it, right of red link is onesbetween it and root, left of red is smaller than it.
    // search is the exact same code, but faster since its sorted in a different way
    // most of the other ops of bst benefits form the different balancing of teh trees
    // the insertion is what is really different, we want to keep the balanacing intact
    // sometimes we get the red leaning to the right so what we do is rotate left and rearrange some things
    // sometimes we need to lean the red to the right and
    // sometimes we get a node with two red links, so we flip colors by making them black no change of links just change colors, and then make the node that had two red links, its link to its parent becomes red
    // when ever we add a node we make its link red and rotate accordingly
    //
    // Inserting into a tree with one node
    //      Left: add to the left make the link red
    //      Right: add to right, make the link red, then rotate it right
    // if we have exactly 2 nodes and we insert  third one and we get 2 red links on left in a row, we rotate the top link to the right and color flip
    // if same as the line before this but we add it to the right of the left then we rotate the 2nd left and make it the bttom, then rotate top right then color flip


}
