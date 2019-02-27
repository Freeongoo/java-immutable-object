package immutable.primitive;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ImmutableUserTest {

    @Test
    public void create() {
        ImmutableUser immutableUser = new ImmutableUser(1, "John");

        assertThat(immutableUser.getId(), equalTo(1));
        assertThat(immutableUser.getName(), equalTo("John"));
    }

    @Test(expected = NullPointerException.class)
    public void create_WhenNullId_ShouldThrowException() {
        ImmutableUser immutableUser = new ImmutableUser(null, "John");
    }

    @Test(expected = NullPointerException.class)
    public void create_WhenNullName_ShouldThrowException() {
        ImmutableUser immutableUser = new ImmutableUser(1, null);
    }

    @Test
    public void createByBuilder() {
        ImmutableUser immutableUser = new ImmutableUser.Builder()
                .setId(1)
                .setName("John")
                .build();

        assertThat(immutableUser.getId(), equalTo(1));
        assertThat(immutableUser.getName(), equalTo("John"));
    }

    @Test(expected = NullPointerException.class)
    public void createByBuilder_WhenNotAllRequiredFieldSet() {
        ImmutableUser immutableUser = new ImmutableUser.Builder()
                .setId(1)
                .build();
    }
}