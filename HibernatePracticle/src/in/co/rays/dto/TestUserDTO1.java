package in.co.rays.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestUserDTO1 {
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testUpdate();
		//testDelete();
		// testGet();
		//testAuth();
		  testSearch();
		
		
	}

	private static void testSearch() {
		UserDTO dto = new UserDTO();

		dto.setFirstName("abc");

		UserModel model = new UserModel();

		List list = model.search(dto, 1, 10);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			dto = (UserDTO) it.next();

			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLogin());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());
		}

		
	}

	private static void testAuth() {
		UserModel model = new UserModel();
		UserDTO dto= model.authenticate("bansalmait168@gmail.com", "1234");
		 

			if (dto != null) {
				System.out.println(dto.getId());
				System.out.println(dto.getFirstName());
				System.out.println(dto.getLastName());
				System.out.println(dto.getLogin());
				System.out.println(dto.getPassword());
				System.out.println(dto.getDob());
				System.out.println(dto.getAddress());
			} else {
				System.out.println("Authentication failed..!!");
			}


	

		
		
	}

	private static void testGet() {
		
		UserModel model=new UserModel();
		UserDTO dto=model.findByPk(1);
		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPassword());
		System.out.println(dto.getDob());
		System.out.println(dto.getAddress());
		
	
		
		
	}

	private static void testDelete() {
		UserDTO dto=new UserDTO();
		dto.setId(5);
		UserModel model=new UserModel();
		model.delete(dto);
		
		
		
	}

	private static void testUpdate() {
		UserDTO dto=new UserDTO();
		dto.setFirstName("Goyal");
		dto.setLastName("Shubham");
		UserModel model=new UserModel();
		model.add(dto);
		
	}

	private static void testAdd() throws Exception {
		SimpleDateFormat sdf=new  SimpleDateFormat("yyyy-MM-dd");
		UserDTO dto=new UserDTO();
		//dto.setId(3);
		dto.setFirstName("Shubham");
		dto.setLastName("Goyal");
		dto.setLogin("Goyal@123");
		dto.setPassword("123");
		dto.setDob(sdf.parse("1998-10-09"));
		dto.setAddress("Gwalior");
		UserModel model=new UserModel();
		model.add(dto);
		
		
	}

}
