package communicators

import pojos.Product

interface ProductCommunicator {
  fun getProduct(): Product
}
