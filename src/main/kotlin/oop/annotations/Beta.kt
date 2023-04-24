package oop.annotations

@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()

class ExampleTarget(
    @field:Beta val firstNAme: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String
)
