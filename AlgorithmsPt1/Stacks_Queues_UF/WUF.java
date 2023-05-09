package AlgorithmsPt1.Stacks_Queues_UF;

public class WUF {

    private int [] id;
    private int [] sz;

    public WUF(int N){
        id = new int[N];
        sz = new int[N];

        for(int i = 0; i < N; i++){
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int find(int p){
        // Will find the root of p
        while (id[p] != p){
             p = id[p];
        }
        return p;
    }

    public boolean connected(int p, int q){
        return (find(p) == find(q));
    }

    public void union(int p, int q){
        if(connected(p,q)){
            return;
        }

        int i = find(p);
        int j = find(q);

        if(sz[i]> sz[j]){
            id[j] = i;
            sz[i] += sz[j];

        }else if(sz[j]>= sz[i]) {
            id[i] = j;
            sz[j] += sz[i];
        }
    }


}
