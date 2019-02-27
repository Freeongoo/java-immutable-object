package immutable.withOtherLib.deepClone;

import lib.Address;
import org.apache.commons.lang3.SerializationUtils;

import java.util.Objects;

public final class ImmutableUserWithAddressDeepClone {

    private final Integer id;
    private final String name;
    private final Address address;

    public ImmutableUserWithAddressDeepClone(Integer id, String name, Address address) {
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

    public Address getAddress() {
        return SerializationUtils.clone(address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableUserWithAddressDeepClone that = (ImmutableUserWithAddressDeepClone) o;
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
        final StringBuilder sb = new StringBuilder("ImmutableUserWithAddressDeepClone{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
