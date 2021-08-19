open class ProductTest {
    @Test
    fun productShouldReturnContent_ok() {
        // setup
        val product = Product(
            name = "Producto1",
            SKU = "1234",
            manufacturer = "empresa"
        )
        // exec
        val content = product.getContent()
        // assert
        assertNotNull(content)
    }
}