package org.grails.samples

/**
 * Models a {@link Vet Vet's} specialty (for example, dentistry).
 *
 * @author Graeme Rocher
 */
class Speciality {
	
	String name

    static mapping = {
        id type:Long, sqlType:'BIGINT', generator: 'hilo', params: [table: 'database_version', column: 'id_spec']
    }

	static constraints = {
		name blank: false, minSize: 3, maxSize: 20, unique: true
	}
}
