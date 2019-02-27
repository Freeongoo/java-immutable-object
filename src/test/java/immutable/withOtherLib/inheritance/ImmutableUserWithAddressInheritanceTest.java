package immutable.withOtherLib.inheritance;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ImmutableUserWithAddressInheritanceTest {

    @Test
    public void create() {
        ChildAddress address = new ChildAddress("firstLine", "secondLine", "NYC");
        ImmutableUserWithAddressInheritance user = new ImmutableUserWithAddressInheritance(1, "John", address);

        assertThat(user.getId(), equalTo(1));
        assertThat(user.getName(), equalTo("John"));
        assertThat(user.getAddress(), equalTo(address));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void tryChangeAddress_ShouldThrowException() {
        ChildAddress address = new ChildAddress("firstLine", "secondLine", "NYC");
        ImmutableUserWithAddressInheritance user = new ImmutableUserWithAddressInheritance(1, "John", address);

        ChildAddress addressFrom = user.getAddress();
        addressFrom.setCity("New City");
    }
}