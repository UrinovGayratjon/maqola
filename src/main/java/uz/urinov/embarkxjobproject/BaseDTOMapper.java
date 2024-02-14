package uz.urinov.embarkxjobproject;

public interface BaseDTOMapper<A, B> {
    B mapTo(A a);

    A mapFrom(B b);

}
