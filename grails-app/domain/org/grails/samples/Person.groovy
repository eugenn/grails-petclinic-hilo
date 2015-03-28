package org.grails.samples

/**
 * Simple domain object representing a person.
 *
 * @author Graeme Rocher
 */
class Person {

	String firstName
	String lastName

    static mapping = {
        id type:Long, sqlType:'BIGINT', generator: 'hilo', params: [table: 'database_version', column: 'id_person']
    }

	static constraints = {
		firstName blank: false
		lastName blank: false
	}
}
