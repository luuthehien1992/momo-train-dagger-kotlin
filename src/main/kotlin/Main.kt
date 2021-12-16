fun main(args: Array<String>) {
  val productService = DaggerMainComponent.builder()
    .serviceName("Momo Dagger training")
    .build()
    .getService()

  println(productService.getProduct())
}