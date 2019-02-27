package immutable.primitive;

import java.util.Objects;

public final class ImmutableUser {

    private final Integer id;
    private final String name;

    public ImmutableUser(Integer id, String name) {
        // to prevent an object from invalid state
        validateParams(id, name);

        this.id = id;
        this.name = name;
    }

    private void validateParams(Integer id, String name) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private Integer id;
        private String name;

        public Builder() {
        }

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public ImmutableUser build() {
            return new ImmutableUser(id, name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableUser immutableUser = (ImmutableUser) o;
        return Objects.equals(id, immutableUser.id) &&
                Objects.equals(name, immutableUser.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ImmutableUser{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
