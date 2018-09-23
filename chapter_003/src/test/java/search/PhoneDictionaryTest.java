package search;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.List;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Lera", "Frolova", "555", "Moscow"));
        List<Person> persons = phones.find("era");
        assertThat(persons.iterator().next().getName(), is("Lera"));
    }


}
