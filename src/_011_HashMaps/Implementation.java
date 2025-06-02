package _011_HashMaps;


import java.util.LinkedList;

public class Implementation {

    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;   ////n
        private int N;
        private LinkedList<Node> buckets[];     ////N size

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i =0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di =0;

            for (int i =0;i<ll.size();i++){
                Node node = ll.get(i);
                if (node.key == key){
                    return di;
                }
                di++;
            }

            return -1;
        }

        private void rehash(){
            
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if (di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else {
                buckets[bi].add(new Node(key,value));
                n++;
            }

            double lambda = (double) n/N;
            if (lambda > 1.85){
                rehash();
            }
        }

    }
}
