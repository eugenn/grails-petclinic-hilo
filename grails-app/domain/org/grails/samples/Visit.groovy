package org.grails.samples

/**
 * Simple domain object representing a visit.
 *
 * @author Graeme Rocher
 */
class Visit {

	Date date = new Date()
	String description
	Pet pet

    static mapping = {
        id type:Long, sqlType:'BIGINT', generator: 'hilo', params: [table: 'database_version', column: 'id_visit']
    }

	static constraints = {
		description blank:false
	}
}
