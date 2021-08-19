open class ProductTest {
    @Test
    fun productShouldReturnContent_ok() {
        // setup
        val product = mock<IProduct>()
        // exec
        val content = product.getContent()
        // assert
        assertNotNull(content)
    }
}