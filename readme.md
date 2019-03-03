# Immutable Objects in Java

Examples of the implementation of immutable objects in Java

## Primitive fields

`/src/main/java/immutable/primitive/ImmutableUser.java`

## Collections

`/src/main/java/immutable/collection/unmodifiable`

### Solutions

#### Copy collections

`/src/main/java/immutable/collection/copy/ImmutableUserWithCollectionCopy.java`

#### Unmodifiable collections

`/src/main/java/immutable/collection/unmodifiable/ImmutableUserWithCollectionUnmodifiable.java`

## Third-party library objects are used

`/src/main/java/immutable/withOtherLib`

### Solutions

#### Inheritance

`/src/main/java/immutable/withOtherLib/inheritance/ImmutableUserWithAddressInheritance.java`

Bad solution - works well if a third-party object contains only primitive fields.
If a third-party library has objects in field roles, then it is more difficult to perform inheritance.

#### Deep clone

`/src/main/java/immutable/withOtherLib/deepClone/ImmutableUserWithAddressDeepClone.java`