package services

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
interface ProductServiceModule {
  @Singleton
  @Binds
  fun bindProductService(productService: ProductServiceImpl): ProductService
}