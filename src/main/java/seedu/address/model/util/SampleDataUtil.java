package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.StudentId;
import seedu.address.model.person.Telegram;
import seedu.address.model.tag.Tag;
import seedu.address.model.tutorial.Tutorial;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(new Name("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                new Address("Blk 30 Geylang Street 29, #06-40"), getTagSet("friends"), new StudentId("A9999567X"),
                getTutorialSet("CS2103T-14F1"), new Telegram("alexy98")),
            new Person(new Name("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"), getTagSet("colleagues", "friends"),
                    new StudentId("A2345678Y"), getTutorialSet("CS2103T-14W1"), new Telegram("berniceewuuu")),
            new Person(new Name("Charlotte Oliveiro"), new Phone("93210283"), new Email("charlotte@example.com"),
                new Address("Blk 11 Ang Mo Kio Street 74, #11-04"), getTagSet("neighbours"),
                    new StudentId("A3456789Z"), getTutorialSet("CS2101-G20"), new Telegram("charchar123")),
            new Person(new Name("David Li"), new Phone("91031282"), new Email("lidavid@example.com"),
                new Address("Blk 436 Serangoon Gardens Street 26, #16-43"), getTagSet("family"),
                    new StudentId("A4567890X"), getTutorialSet("CS2101-G20"), new Telegram("lidavidd")),
            new Person(new Name("Irfan Ibrahim"), new Phone("92492021"), new Email("irfan@example.com"),
                new Address("Blk 47 Tampines Street 20, #17-35"), getTagSet("classmates"), new StudentId("A5678901Y"),
                getTutorialSet("CS1231"), new Telegram("irfanibrahim")),
            new Person(new Name("Roy Balakrishnan"), new Phone("92624417"), new Email("royb@example.com"),
                new Address("Blk 45 Aljunied Street 85, #11-31"), getTagSet("colleagues"), new StudentId("A6789012Z"),
                getTutorialSet("CS2040S"), new Telegram("roybalak"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

    /**
     * Returns a tutorial set containing the list of strings given.
     */
    public static Set<Tutorial> getTutorialSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tutorial::new)
                .collect(Collectors.toSet());
    }
}
