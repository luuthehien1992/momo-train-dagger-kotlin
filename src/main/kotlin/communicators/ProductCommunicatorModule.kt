package communicators


import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ProductCommunicatorModule {
  @Provides
  @Singleton
  fun provideProductFromHttpApi(): ProductCommunicator {
    return ProductFromHttpApi()
  }
}