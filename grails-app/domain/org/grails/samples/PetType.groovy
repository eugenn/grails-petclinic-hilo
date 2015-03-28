package org.grails.samples

/**
 * @author Graeme Rocher
 */
class PetType {
	
	String name

    static mapping = {
        id type:Long, sqlType:'BIGINT', generator: 'hilo', params: [table: 'database_version', column: 'id_value']
    }

	static constraints = {
		name blank: false, minSize: 3, maxSize: 20, unique: true
	}
}
