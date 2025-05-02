package queues;

public class Nod {
    int info;
    Nod nod = null ;


    public Nod(int info){
        this.info = info;
    }

    public Nod(int info,Nod nod){
        this.info=info;
        this.nod=nod;
    }
}
