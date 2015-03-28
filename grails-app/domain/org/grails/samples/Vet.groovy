package org.grails.samples;

/**
 * Simple domain object representing a veterinarian.
 *
 * @author Graeme Rocher
 */
class Vet extends Person {

    static mapping = {
        id type:Long, sqlType:'BIGINT', generator: 'hilo', params: [table: 'database_version', column: 'id_vet']
    }

	static hasMany = [specialities: Speciality]
}
