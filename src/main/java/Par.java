/**
 * Created by damian on 02/09/16.
 */



public class Par<T, I> {

    private T first;
    private I second;

    public Par(T i, I i1) {
        this.first = i;
        this.second = i1;
    }

    public T first() {
        return this.first;
    }

    public I second() {
        return this.second;
    }
}
