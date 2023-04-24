package oop.data

import oop.annotations.NotBlank

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Long
)

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
)