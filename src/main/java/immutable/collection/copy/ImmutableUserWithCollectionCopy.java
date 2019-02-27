package immutable.collection.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ImmutableUserWithCollectionCopy {

    private final Integer id;
    private final String name;
    private final List<Integer> numbers;

    public ImmutableUserWithCollectionCopy(Integer id, String name, List<Integer> numbers) {
        validateParams(id, name, numbers);

        this.id = id;
        this.name = name;
        this.numbers = numbers;
    }

    private void validateParams(Integer id, String name, List<Integer> numbers) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(numbers);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }
}
