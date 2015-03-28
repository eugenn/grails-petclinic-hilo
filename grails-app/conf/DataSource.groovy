/*dataSource {
	pooled = true
    jmxExport = true
	driverClassName = 'org.h2.Driver'
	username = 'sa'
	password = ''
} */

dataSource {
    dbCreate = 'update'
    url = "jdbc:sqlserver://localhost:1433;databaseName=petclinic" // oprate == Database Name
    driverClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
    username = "petuser" // oprate == User name & Schema name
    password = "pet"
}
/*hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context

	format_sql = true
	use_sql_comments = true
} */

hibernate {
    dialect="org.hibernate.dialect.SQLServerDialect"
    cache.use_second_level_cache=true
    cache.use_query_cache=true
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual'
}



