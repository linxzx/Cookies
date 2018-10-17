package test;


import org.junit.Test;

import com.etc.entity.User;
import com.etc.service.IAddressService;
import com.etc.service.impl.AddressServletImpl;

public class mytest {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IAddressService iadd = new AddressServletImpl();
		
		User u = new User();
		u.setUsername("你爸爸");
		
		
		
		System.out.println(iadd.findAddressByUserName(u));
		
	}

}
