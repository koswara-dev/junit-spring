package com.juaracoding.junit2.ganjilgenap;

public class JalurGanjilGenap {

	//jalurGanjilGenap
		//cek tgl
		//cek platNomor
		//kondisi izinkan : tgl genap, platNomor genap
		//kondisi izinkan : tgl ganjil, platNomor ganjil
		
		public String cekJalurGanjilGenap(int tgl, int platNomor) {
		
			String statement = "";
			
			if(tgl%2==0) {
				if(platNomor%2==0) {
					statement = "Diizinkan";
				} else {
					statement = "Dilarang";
				}
			} else if((tgl%2==1)) {
				if(platNomor%2==1) {
					statement = "Diizinkan";
				} else {
					statement = "Dilarang";
				}
			}
			
			return statement;
		}
		
}
