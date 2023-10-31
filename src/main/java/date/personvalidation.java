package date;

public class personvalidation {
	public String validatePerson(String name, int id) {
        if ("ram".equalsIgnoreCase(name) && id == 3025) {
            return "Valid Person";
        } else {
            return "Invalid Person";
        }
    }
}
