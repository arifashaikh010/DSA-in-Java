import java.util.Comparator;
import java.util.PriorityQueue;

public class PQforObjects {
    static class Student implements Comparable<Student> { //overriding
        String name;
        int rank;

        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        // PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        System.out.println("Sorting on the basis of rank ");
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" -> "+pq.peek().rank);
            pq.remove();
        }
    }
}
// Output:
// Sorting on the basis of rank 
// C -> 2
// A -> 4
// B -> 5
// D -> 12

// Output:
// Using "Comparator.reverseOrder()"
// Sorting on the basis of rank 
// D -> 12
// B -> 5
// A -> 4
// C -> 2