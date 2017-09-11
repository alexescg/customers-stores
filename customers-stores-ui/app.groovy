@EnableZuulProxy
@EnableDiscoveryClient
@Controller
@ComponentScan(basePackages = ["com.github.alexescg.component"])
class Application extends WebMvcConfigurerAdapter {
  void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/**").addResourceLocations('classpath:/', 'classpath:/dist/')
  }
  @RequestMapping("/")
  String home() { 
    return 'redirect:/index.html#/customers'
  }
}