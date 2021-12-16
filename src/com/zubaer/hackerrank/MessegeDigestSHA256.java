package com.zubaer.hackerrank;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MessegeDigestSHA256 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String needToDigest = sc.nextLine();
		byteToHexNumber(messegeDigest(needToDigest));
		//System.out.println(hex);
	}
	
	public static byte[] messegeDigest(String msg) throws NoSuchAlgorithmException {
		// get digest instance
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		
		// update md with messege array
		md.update(msg.getBytes());
		
		// get the digest
		byte[] hasedValue = md.digest();
		return hasedValue;
	}
	public static void byteToHexNumber(byte[] hashByte) {
		//StringBuilder hexNumber = new StringBuilder();
		for(int i= 0; i<hashByte.length; i++) {
			// 32 bit integer, and operation with the 255
			//hexNumber.append(Integer.toHexString(0xFF &hashByte[i]));
			System.out.print(String.format("%02x", hashByte[i]));
		}
	}
	
}
