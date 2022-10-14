import static org.junit.Assert.*;
import java.util.NoSuchElementException;
import org.junit.*;

public class LinkedListTests{
    @Test 
	public void testPrependFirst() {
        LinkedList listone = new LinkedList();
        listone.prepend(1);
        listone.prepend(2);
        listone.prepend(3);
        assertEquals(3,listone.first());
	}
    @Test
    public void testPrependLast() {
        LinkedList listtwo = new LinkedList();
        listtwo.prepend(1);
        listtwo.prepend(2);
        listtwo.prepend(3);
        assertEquals(1,listtwo.last());
	}
    @Test
    public void TestAppendFirst() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(1,list.first());
    }
    @Test
    public void TestAppendLast() {
        LinkedList list2 = new LinkedList();
        list2.append(1);
        list2.append(2);
        list2.append(3);
        assertEquals(3,list2.last());
    }
}