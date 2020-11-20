package aUnionFind;

public class QuickUnion {
    private int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // p and q are connected iff they have the same root id
    public boolean isConnected(int p, int q) {
        return getRootIdRecursively(p) == getRootIdRecursively(q);
    }

    // union
    public void union(int p, int q) {
        int pRootId = getRootIdRecursively(p);
        int qRootId = getRootIdRecursively(q);
        id[pRootId] = qRootId;
    }


    // get root id
    public int getRootIdRecursively(int i) {
        if (id[i] == i) return i;
        return getRootIdRecursively(id[i]);
    }

    public int getRootIdIteratively(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }
}
