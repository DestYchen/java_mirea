package Practice14;
import java.util.Collection;
public interface IWaitList<E> {
    void add(E element);
    E remove();
    boolean containsAll(Collection<E> collection);
    boolean isEmpty();
}
