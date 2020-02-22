import static org.junit.Assert.*;

import org.junit.Test;

public class PersonNewTest {

	
	@Test
	public void getFirstName()
	{
		PersonNew p=new PersonNew("kishore","kumar",'m',9949576662L);
		assertEquals(p.getFirstname(),"kishore");
	}
	@Test
	public void getLastName()
	{
		PersonNew p=new PersonNew("kishore","kumar",'m',9949576662L);
		assertEquals(p.getLastname(),"kumar");
	}
	@Test
	public void getGender()
	{
		PersonNew p=new PersonNew("kishore","kumar",'m',9949576662L);
		assertEquals(p.getGender(),'m');
	}
	@Test
	public void getno()
	{
		PersonNew p=new PersonNew("kishore","kumar",'m',9949576662L);
		assertEquals(p.getnumber(),9949576662L);
	}
	@Test
	public void display()
	{
		PersonNew p=new PersonNew("kishore","kumar",'m',9949576662L);
		assertEquals("kishore",p.getFirstname());
		assertEquals("kumar",p.getLastname());
		assertEquals('m',p.getGender());
		assertEquals(9949576662L,p.getnumber());
	}

}
