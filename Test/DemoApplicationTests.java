package com.example.demo;

import com.example.demo.entities.OneToManyBiDirectional.AddressOneToManyBidirectional;
import com.example.demo.entities.OneToManyBiDirectional.AuthorOneToManyBiDirectional;
import com.example.demo.entities.OneToManyBiDirectional.BookOneToManyBiDirectional;
import com.example.demo.entities.OneToManyUnidirectional.AddressOneToManyUnidirectional;
import com.example.demo.entities.OneToManyUnidirectional.AuthorOneToManyUniDirectional;
import com.example.demo.entities.OneToManyUnidirectional.BookOneToManyUniDirectional;
import com.example.demo.entities.OnetoOne.Address;
import com.example.demo.entities.OnetoOne.Authoronemapping;
import com.example.demo.entities.OnetoOne.Bookonemapping;
import com.example.demo.entities.manytomany.AddressManyToMany;
import com.example.demo.entities.manytomany.Authormanymapping;
import com.example.demo.entities.manytomany.Bookmanymapping;
import com.example.demo.repo.AuthorManyToManyRepo;
import com.example.demo.repo.AuthorOneToManyBiDirectionalRepo;
import com.example.demo.repo.AuthorOneToManyRepo;
import com.example.demo.repo.AuthorRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	AuthorRepo repo;

	@Autowired
	AuthorOneToManyRepo repo2;


	@Autowired
	AuthorOneToManyBiDirectionalRepo repo3;

	@Autowired
	AuthorManyToManyRepo repo4;

	@Test
	void contextLoads() {
	}

	//One to One mapping
	@Test
	public void testAddDataInDatabase(){
		Bookonemapping b1 = new Bookonemapping();
		b1.setBookname("physics");
		Authoronemapping a1 = new Authoronemapping();
		a1.setName("dinesh");
		Address addr = new Address();
		addr.setState("delhi");
		addr.setLocation("muz");
		addr.setStreetnumber("bhagwanpur");
		a1.setAddress(addr);
		b1.setAuthor(a1);
		repo.save(b1);
	}

	//one to many uni directional
	@Test
	public void testOneToManyUniDirectional(){
		AuthorOneToManyUniDirectional a2 = new AuthorOneToManyUniDirectional();
		a2.setName("somesh");
		AddressOneToManyUnidirectional addr = new AddressOneToManyUnidirectional();
		addr.setLocation("uttamnagar");
		addr.setState("delhi");
		addr.setStreetnumber("east");
		a2.setAddress(addr);
		BookOneToManyUniDirectional book1 = new BookOneToManyUniDirectional();
		book1.setBookname("maths");

		BookOneToManyUniDirectional book2 = new BookOneToManyUniDirectional();
		book2.setBookname("english");
		a2.addBook(book1);
		a2.addBook(book2);
		repo2.save(a2);


	}

	@Test
	public void testOneToManyBiDirectional(){
		AuthorOneToManyBiDirectional a2 = new AuthorOneToManyBiDirectional();
		a2.setName("somesh");
		AddressOneToManyBidirectional addr = new AddressOneToManyBidirectional();
		addr.setLocation("uttamnagar");
		addr.setState("delhi");
		addr.setStreetnumber("east");
		a2.setAddress(addr);
		BookOneToManyBiDirectional book1 = new BookOneToManyBiDirectional();
		book1.setBookname("angular");

		BookOneToManyBiDirectional book2 = new BookOneToManyBiDirectional();
		book2.setBookname("react");
		a2.addBook(book1);
		a2.addBook(book2);
		repo3.save(a2);


	}

	@Test
	public void testManyToManyMapping(){
		Authormanymapping a1 = new Authormanymapping();
		a1.setName("somesh");
		AddressManyToMany addr = new AddressManyToMany();
		addr.setLocation("uttamnagar");
		addr.setState("delhi");
		addr.setStreetnumber("east");
		a1.setAddress(addr);

		Bookmanymapping b1 = new Bookmanymapping();
		b1.setBookname("chemestry");

		Bookmanymapping b2 = new Bookmanymapping();
		b1.setBookname("maths");

		a1.getBooks().add(b1);
		a1.getBooks().add(b2);

		b1.getAuthors().add(a1);
		b1.getAuthors().add(a1);
		repo4.save(a1);

	}
}
