package bo.edu.ucb.quickjobs.quickjobs;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;


@SpringBootApplication
@MapperScan("bo.edu.ucb.quickjobs.quickjobs.dao")
public class QuickjobsApplication {
	@Bean

	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws  Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource((javax.sql.DataSource) dataSource);
		SqlSessionFactory sqlSessionFactory = factoryBean.getObject();
		sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);
		return sqlSessionFactory;
	}

	public static void main(String[] args) {
		SpringApplication.run(QuickjobsApplication.class, args);
	}

}
