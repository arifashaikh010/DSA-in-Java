import java.util.*;

public class HashMapCode {
    static class HashMap<K,V>{   //K,V-generics
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;          //n
        private int N;          //N-buckets.length
        private LinkedList<Node> buckets[];   //access-modifier Data_type arr[] //N=buckets.length

        @SuppressWarnings("unchecked")   //this is unchecked type ERROR     //to use array of linkedlist without any error
        public HashMap(){
            this.N=4;
            this.buckets= new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc=key.hashCode();  //hc-hashcode .. hashCode()-performs hashing and change the form of object
            return Math.abs(hc) % N;   //to make it positive
        }

        private int searchInLL(K key, int bi){
            //loop on LL
            LinkedList<Node> ll = buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")   //this is unchecked type ERROR     //to use array of linkedlist without any error
        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }

            //add nodes in new bucket
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value){     //TC:O(lambda) => TC:O(1)
            //1.find bucket index using HashFunction
            int bi=hashFunction(key);        //bi-bucket index  0 to 3(size()-1)

            //2.loop on LL and return index for key
            int di=searchInLL(key,bi);          //di-data index  //result-valid idx(if exists)/ -1(doexn't exists)

            if(di!=-1){                               //already exists
                //update
                Node node = buckets[bi].get(di);
                node.value=value;
            }else{                               //doexn't exists
                //add new node
                buckets[bi].add(new Node(key, value));
                n++;
            }

            //REHASHING
            double lambda=(double)n/N;
            if(lambda>2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){    //TC:O(1)
            //1.find bucket index using HashFunction
            int bi=hashFunction(key);        //bi-bucket index  0 to 3(size()-1)

            //2.loop on LL and return index for key
            int di=searchInLL(key,bi);          //di-data index  //result-valid idx(if exists)/ -1(doexn't exists)

            if(di!=-1){        
                return true;    //non -1 value => key exists
            }else{ 
                return false;
            }
        }

        public V remove(K key){   //TC:O(1)
            //1.find bucket index using HashFunction
            int bi=hashFunction(key);        //bi-bucket index  0 to 3(size()-1)

            //2.loop on LL and return index for key
            int di=searchInLL(key,bi);          //di-data index  //result-valid idx(if exists)/ -1(doexn't exists)

            if(di!=-1){             
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else{ 
                return null;
            }
        }

        public V get(K key){       //TC:O(1)
            //1.find bucket index using HashFunction
            int bi=hashFunction(key);        //bi-bucket index  0 to 3(size()-1)

            //2.loop on LL and return index for key
            int di=searchInLL(key,bi);          //di-data index  //result-valid idx(if exists)/ -1(doexn't exists)

            if(di!=-1){         
                Node node = buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }

        public ArrayList<K> keySet(){             //store keys in the arraylist and return  
            ArrayList<K> keys=new ArrayList<K>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;          //0==0 => return True, x==0 => return False
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();  //NOT using 'inbuilt' hashMap using the one which I have created in thi program
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",5);

        ArrayList<String> keys = hm.keySet();
        System.out.println("Keys in the HashMap are : ");
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println("\nPopulation of India : "+hm.get("India"));
        System.out.println("Remove India : "+hm.remove("India"));
        System.out.println("Get Population of India : "+hm.get("India"));
    }
}
// Output:
// Keys in the HashMap are : 
// Nepal
// US
// India
// China

// Population of India : 100
// Remove India : 100
// Get Population of India : null