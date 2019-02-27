# Immutable Objects in Java

## Primitive fields

`/src/main/java/immutable/primitive/ImmutableUser.java`

## When third-party library objects are used

`/src/main/java/immutable/withOtherLib`

### Solutions

#### Inheritance

`/src/main/java/immutable/withOtherLib/inheritance/ImmutableUserWithAddressInheritance.java`

Bad solution - works well if a third-party object contains only primitive fields

#### Deep clone

`/src/main/java/immutable/withOtherLib/deepClone/ImmutableUserWithAddressDeepClone.java`