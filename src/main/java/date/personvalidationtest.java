package date;

public class personvalidationtest {
	public class validatortest {
		@Test
	    public void testValidPerson() {
	        PersonValidator validator = new PersonValidator();
	        assertEquals("Valid Person", validator.validatePerson("ram", 3025));
	    }

	    @Test
	    public void testInvalidPerson() {
	        PersonValidator validator = new PersonValidator();
	        assertEquals("Invalid Person", validator.validatePerson("john", 1234));
	    }
	}
}
