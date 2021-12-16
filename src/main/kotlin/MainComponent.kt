import communicators.ProductCommunicatorModule
import dagger.BindsInstance
import dagger.Component
import services.ProductService
import services.ProductServiceModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
  ProductCommunicatorModule::class,
  ProductServiceModule::class,
])
interface MainComponent {
  @Component.Builder
  interface Builder {
    @BindsInstance
    fun serviceName(serviceName: String): Builder
    fun build(): MainComponent
  }

  fun getService(): ProductService
}