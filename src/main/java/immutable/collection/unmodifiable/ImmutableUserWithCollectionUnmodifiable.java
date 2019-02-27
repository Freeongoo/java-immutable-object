package immutable.collection.unmodifiable;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ImmutableUserWithCollectionUnmodifiable {

    private final Integer id;
    private final String name;
    private final List<Integer> numbers;

    public ImmutableUserWithCollectionUnmodifiable(Integer id, String name, List<Integer> numbers) {
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
        return Collections.unmodifiableList(numbers);
    }
}
