package org.dimigo.oop;

public class BandTest {

	public static void main(String[] args) {
		
		BandService bs = new BandService();
		
		bs.addBand(new Band("YB", "너를 보내고", 5, new String[] {"윤도현", "박태희", "김진원", "허준", "유병열"}));
		bs.addBand(new Band("씨엔블루", "외톨이야", 5, new String[] {"정용화", "이종현", "강민혁", "이정신", "권광진"}));
		bs.addBand(new Band("한스밴드", "오락실", 4, new String[] {"김한나", "김한별", "김한샘", "김한집"}));
		bs.addBand(new Band("들국화", "행진", 5, new String[] {"전인권", "최성원", "허성욱", "조덕환", "권인하"}));
		
		System.out.println("1. 전체 조회");
		bs.printAllBandsInfo();
		
		System.out.println("2. [들국화] 조회");
		Band band = bs.searchBand("들국화");
		band.printBandInfo();
		
		System.out.println("3. [들국화] 변경\n");
		bs.updateBand(new Band("들국화", "그것만이 내세상", 4, new String[] {"전인권", "최성원", "허성욱", "조덕환"}));
		
		System.out.println("4. [들국화] 조회");
		band = bs.searchBand("들국화");
		band.printBandInfo();
		
		System.out.println("5. [YB] 삭제\n");
		bs.deleteBand("YB");
		
		System.out.println("6. 전체 조회");
		bs.printAllBandsInfo();
		
	}

}
