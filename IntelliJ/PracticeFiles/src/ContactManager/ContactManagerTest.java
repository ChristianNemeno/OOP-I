package ContactManager;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.util.List;

public class ContactManagerTest {
    private static final String CONTACTS_FILE = "contacts.txt";
    private ContactManager manager;

    @BeforeEach
    void setUp() {
        manager = new ContactManager(CONTACTS_FILE);
    }

    @AfterEach
    void cleanUp() {
        new File(CONTACTS_FILE).delete();
    }

    @Test
    void testAddContact() {
        Contact contact = new Contact("John Doe", "123-456-7890", "john@email.com");
        assertTrue(manager.addContact(contact));

        List<Contact> contacts = manager.getAllContacts();
        assertEquals(1, contacts.size());
        assertEquals("John Doe", contacts.get(0).getName());
    }

    @Test
    void testFindContact() {
        Contact contact = new Contact("Jane Smith", "987-654-3210", "jane@email.com");
        manager.addContact(contact);

        Contact found = manager.findContactByName("Jane Smith");
        assertNotNull(found);
        assertEquals("987-654-3210", found.getPhone());
    }

    @Test
    void testDeleteContact() {
        Contact contact = new Contact("Alice Brown", "555-555-5555", "alice@email.com");
        manager.addContact(contact);

        assertTrue(manager.deleteContact("Alice Brown"));
        assertEquals(0, manager.getAllContacts().size());
    }
}