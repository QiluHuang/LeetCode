package aUnionFind;

public class WeightedQuickUnion {
    int[] id;
    int[] size;

    public WeightedQuickUnion(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    // p and q are connected iff they have the same root id
    public boolean isConnected(int p, int q) {
        return getRootId(p) == getRootId(q);
    }

    // union
    public void union(int p, int q) {
        int pRootId = getRootId(p);
        int qRootId = getRootId(q);

        if (pRootId == qRootId) return;

        if (size[pRootId] > size[qRootId]) {
            id[qRootId] = pRootId;
            size[pRootId] += size[qRootId];
        } else {
            id[pRootId] = qRootId;
            size[qRootId] += size[pRootId];
        }
    }

    public int getRootId(int currId) {
        while (currId != id[currId]) {
            currId = id[currId];
        }
        return currId;
    }
}
