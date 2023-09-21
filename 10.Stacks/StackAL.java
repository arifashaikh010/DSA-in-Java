//Implement Stack using ArrayList

import java.util.*;
public class StackAL{
    public static class Stack{
        static ArrayList<Integer> list= new ArrayList<>();

        //isEmpty function
        public static boolean isEmpty(){
            return list.size()==0;          //  0==0 => true     n=0 => false
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            //corner case: if stack is empty return -1
            if(isEmpty()){
                return -1;
            }

            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            //corner case: if stack is empty return -1 coz 'no top exists'
            if(isEmpty()){
                return -1;
            }
            
            int top=list.get(list.size()-1);
            return top;
            //or
            //return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.print("Stack elemens are : ");
        while(!s.isEmpty()){                    //empty nhi h to return hoga false and while mai hojayega 'true'
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}

//Output:
//Stack elemens are : 3 2 1 