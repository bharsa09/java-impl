import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static class HashMap<K,V>{

        private class HMNode{
            K key;
            V value;
            HMNode(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int size; // n {numbers of element};

        private LinkedList<HMNode>[] buckets; //N=buckets.length

        public HashMap(){
            initBucket(4);
            size=0;
        }

        private void initBucket(int N) {
            buckets=new LinkedList[N];

            for(int i=0;i< buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }

        public void put(K key ,V value){
            int bi=hashfn(key);
            int di=getIndexWithInBucket(key,bi);

            if(di != -1){
                //update
                HMNode node=buckets[bi].get(di);
                node.value=value;
            }else{
                //insert
                HMNode node=new HMNode(key,value);
                buckets[bi].add(node);
                size++;
            }

            double lambda=size * 1.0 /buckets.length;

            if(lambda>2.0){
               rehash();
            }


        }

        private void rehash() {

            LinkedList<HMNode>[] old=buckets;

            initBucket(old.length);
            size=0;

            for(int i=0;i< old.length;i++){
                for(HMNode node:old[i]){
                    put(node.key,node.value);
                }
            }
        }

        public boolean containsKey(K key){
            int bi=hashfn(key);
            int di=getIndexWithInBucket(key,bi);

            if(di != -1){
                return true;
            }
            return false;
        }

        public V get(K key){
            int bi=hashfn(key);
            int di=getIndexWithInBucket(key,bi);

            if(di != -1){
                return buckets[bi].get(di).value;
            }
            return null;
        }

        public V remove(K key){
            int bi=hashfn(key);
            int di=getIndexWithInBucket(key,bi);

            if(di != -1){
                size--;
                return buckets[bi].remove(di).value ;
            }
            return null;
        }

        private int hashfn(K key) {
            int hc=key.hashCode();
            return Math.abs(hc) % buckets.length ;
        }

        private int getIndexWithInBucket(K key, int bi) {
            int di=0;

            for(HMNode node: buckets[bi]){
                if(node.key.equals(key)){
                    return di;
                }
                di++;
            }

            return -1;
        }

        int size(){
            return size;
        }

        public ArrayList<K> keySet() throws Exception{
            ArrayList<K> arr=new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                for(HMNode node : buckets[i]){
                    arr.add(node.key);
                }
            }
            return arr;
        }


    }


}
