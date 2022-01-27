package Queue;
public class QueueDriver {
    public static void main(String[] args) {
        Queue qu=new Queue(5);
    qu.masuk(9);
    qu.masuk(8);
    qu.masuk(7);
    qu.masuk(6);
    qu.masuk(5);
    qu.keluar();
    while(!qu.isEmpty()){
        long n=qu.keluar();
        System.out.print(n+" ");
    }
    System.out.println();
    }
    }
    
