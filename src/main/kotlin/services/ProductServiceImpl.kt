package services

import communicators.ProductCommunicator
import pojos.Product
import javax.inject.Inject

class ProductServiceImpl @Inject internal constructor(
  private val productCommunicator: ProductCommunicator,
) : ProductService {
  override fun getProduct(): Product {
    return productCommunicator.getProduct()
  }
}