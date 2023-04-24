package oop.app

import oop.annotations.NotBlank
import oop.data.CreateCategoryRequest
import oop.data.CreateProductRequest
import oop.exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun validateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    // itarate satu satu dan cek
    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when (value) {
                is String -> {
                    if ("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val req = CreateProductRequest("1", "Indomie", 2500)
    validateRequest(req)

    val req2 = CreateCategoryRequest("1", "Makanan")
    validateRequest(req2)
}