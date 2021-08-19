interface IProduct {
    val name: String
    val manufacturer: String
    val SKU: String
    val feature: List<Feature>

    open fun getContent(): String
}
