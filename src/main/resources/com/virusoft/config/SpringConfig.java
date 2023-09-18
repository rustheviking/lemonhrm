@Configuration
@EnableJpaRepositories(basePackages = "com.virusoft.lemonhrm")
@EnableTransactionManagement
public class SpringConfig {
    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean factoryBean = LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("LHRMPersistenceUnit");
        return factoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
}







