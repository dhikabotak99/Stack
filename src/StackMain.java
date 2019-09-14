/**
 *
 * @author Etem
 */
public class StackMain {
    public static void main(String[] args){
        Stack theStack = new Stack(10);//Membuat object Stack baru
        theStack.push(20);//Memasukkan item kedalam Stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        theStack.pop();
        theStack.push(100);
        
        while(!theStack.isEmpty()){//Mengulang hingga Stack Kosong
            long value = theStack.pop();//Menghapus nilai stack
            System.out.println(value);//Menampilkan Nilai
            System.out.println("");
        }
        System.out.println("");
    }
}
