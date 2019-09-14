/**
 *
 * @author Etem
 */
public class Stack {
    private int max; //Ukuran dari array stack private long[] stackArray;
    private int top; //Stack Paling atas
    private long stackArray[]= new long[10];
    //Constructor
    public Stack(int s){
        max=s;//Menentukan ukuran array
        top = -1;
    }
    public void push(long j){
        stackArray[++top]=j;
    }
    public long pop(){
        return stackArray[top--];
    }
    public Boolean isEmpty(){
        return(top==-1);
    }
}
