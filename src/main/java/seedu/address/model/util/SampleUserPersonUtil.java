package seedu.address.model.util;

import java.util.HashSet;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.ReadOnlyPerson;
import seedu.address.model.person.Remark;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for creating sample UserPerson data.
 */
public class SampleUserPersonUtil {
    public static ReadOnlyPerson getDefaultSamplePerson() {
        try {
            return new Person (new Name("Default"), new Phone("00000000"), new Email("default@default.com"),
                            new Address("Default"), new Remark(""), new HashSet<Tag>());
        } catch (IllegalValueException e) {
            throw new AssertionError("sample data cannot be invalid", e);
        }
    }

    public static ReadOnlyPerson getDummySamplePerson() {
        try {
            return new Person (new Name("Dummy"), new Phone("11111111"), new Email("dummy@dummy.com"),
                    new Address("Dummy"), new Remark(""), new HashSet<Tag>());
        } catch (IllegalValueException e) {
            throw new AssertionError("sample data cannot be invalid", e);
        }
    }
}
