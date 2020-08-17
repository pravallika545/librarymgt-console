# ===============================
# = DATA SOURCE
# ===============================
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url =jdbc:mysql://localhost:3306/librarydb
spring.datasource.username =root
spring.datasource.password=Pravallika@45

# ===============================
# JPA / HIBERNATE / with hsql
# ===============================
spring.jpa.show-sql = false
spring.jpa.hibernate.ddl-auto = create
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
hibernate.format_sql=true;
# ===============================
