package services

import pojos.Product

interface ProductService {
  fun getProduct(): Product
}