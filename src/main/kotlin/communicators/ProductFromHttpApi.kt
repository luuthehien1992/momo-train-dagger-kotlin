package communicators

import pojos.Product

class ProductFromHttpApi : ProductCommunicator {
  override fun getProduct(): Product {
    return Product("1", "Test")
  }
}