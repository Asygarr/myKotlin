package oop.annotations

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class NotBlank()
