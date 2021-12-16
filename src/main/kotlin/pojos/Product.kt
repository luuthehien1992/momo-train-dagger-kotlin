package pojos

class Product(val id: String, val name: String) {
  override fun toString(): String {
    return "Product(id='$id', name='$name')"
  }
}