package org.grails.samples

/**
 * Simple domain object representing a pet.
 *
 * @author Graeme Rocher
 */
class Pet {

	String name
	Date birthDate
	PetType type
	Owner owner

	static hasMany = [visits: Visit]

    static mapping = {
        id type:Long, sqlType:'BIGINT', generator: 'hilo', params: [table: 'database_version', column: 'id_pet']
    }

	static constraints = {
		name blank: false, validator: { name, pet ->
			if (!pet.id && pet.owner?.pets?.find { it.name == name })  {
				return 'pet.duplicate'
			}
		}
	}
}
