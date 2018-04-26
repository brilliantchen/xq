package com.xq.weini.guanyi;

import com.xq.weini.guanyi.service.GyAddOrdService;
import com.xq.weini.guanyi.service.GyStockService;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class WeiGuanApplicationTests {

	//@Autowired
	//private GyAddOrdService gyAddOrdService;
	@Autowired
	private GyStockService gyStockService;

	@Test
	public void contextLoads() {
	}


	@Test
	public void guanyiAddOrd() {

		//gyAddOrdService.mockGyOrder();
	}

	@Test
	public void guanyiStock() {

		System.out.println(gyStockService.getStock());
	}

	public static void main(String args[]){
		String plainText= "13120921111";
		StringBuffer buf = new StringBuffer("");
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();
			int i;

			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
		System.out.println(Long.toHexString(Long.valueOf("13120920465")));
		System.out.println(UUID.randomUUID().toString());
		System.out.println( buf.toString());
		System.out.println(Long.toHexString(Long.valueOf("13120920465"))+ buf.toString());
	}

}
