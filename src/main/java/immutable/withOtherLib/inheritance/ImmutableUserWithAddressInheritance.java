package immutable.withOtherLib.inheritance;

import java.util.Objects;

/**
 * Bad solution - works well if a third-party object contains only primitive fields
 */
public final class ImmutableUserWithAddressInheritance {

    private final Integer id;
    private final String name;
    private final ChildAddress address;

    public ImmutableUserWithAddressInheritance(Integer id, String name, ChildAddress address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ChildAddress getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableUserWithAddressInheritance that = (ImmutableUserWithAddressInheritance) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ImmutableUserWithAddressInheritance{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
