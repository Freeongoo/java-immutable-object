package immutable.collection.copy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

public class ImmutableUserWithCollectionCopyTest {

    @Test
    public void create() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        ImmutableUserWithCollectionCopy user = new ImmutableUserWithCollectionCopy(1, "John", numbers);

        assertThat(user.getId(), equalTo(1));
        assertThat(user.getName(), equalTo("John"));
        assertThat(user.getNumbers(), containsInAnyOrder(1, 10));
    }

    @Test
    public void tryChangeList_ShouldNothingChange() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        ImmutableUserWithCollectionCopy user = new ImmutableUserWithCollectionCopy(1, "John", numbers);

        List<Integer> numbersFrom = user.getNumbers();
        numbersFrom.add(11);

        assertThat(user.getNumbers(), containsInAnyOrder(1, 10));
    }
}