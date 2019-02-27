package immutable.withOtherLib.deepClone;

import lib.Address;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ImmutableUserWithAddressDeepCloneTest {

    @Test
    public void create() {
        Address address = new Address("first", "second", "NYC");
        ImmutableUserWithAddressDeepClone user = new ImmutableUserWithAddressDeepClone(1, "John", address);

        assertThat(user.getId(), equalTo(1));
        assertThat(user.getName(), equalTo("John"));
        assertThat(user.getAddress(), equalTo(address));
    }

    @Test
    public void tryChangeAddress_ShouldNothingChange() {
        Address address = new Address("first", "second", "NYC");
        ImmutableUserWithAddressDeepClone user = new ImmutableUserWithAddressDeepClone(1, "John", address);

        Address addressFrom = user.getAddress();
        addressFrom.setCity("My New City");

        assertThat(user.getAddress().getCity(), equalTo("NYC"));
    }
}