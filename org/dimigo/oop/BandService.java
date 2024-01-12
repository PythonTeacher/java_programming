/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ BandService
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 13.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class BandService {
	private Band[] bands;
	private int bandCnt;
	private static final int CNT = 3;
	
	/**
	 * @param bands
	 * @param bandCnt
	 */
	public BandService() {
		this.bands = new Band[CNT];
	}	
	
	public void addBand(Band band) {
		if(bands.length == bandCnt) {
			Band[] newBands = new Band[bands.length + CNT];
			System.arraycopy(bands, 0, newBands, 0, bands.length);
			bands = newBands;
		}
		bands[bandCnt++] = band;
	}
	
	public Band searchBand(String bandName) {
		for(int i=0; i<bandCnt; i++) {
			if(bands[i].getBandName().equals(bandName)) {
				return bands[i];
			}
		}
		return null;
	}
	
	public void updateBand(Band band) {
		for(int i=0; i<bandCnt; i++) {
			if(bands[i].getBandName().equals(band.getBandName())) {
				bands[i] = band;
				return;
			}
		}
	}
	
	public void deleteBand(String bandName) {
		int idx = searchIndex(bandName);
		
		if(idx >= 0) {
			for(int i=idx; i<bandCnt-1; i++) {
				bands[i] = bands[i+1];
			}
			bands[bandCnt-1] = null;
			bandCnt--;
		}
	}
	
	private int searchIndex(String bandName) {
		for(int i=0; i<bandCnt; i++) {
			if(bands[i].getBandName().equals(bandName)) {
				return i;
			}
		}
		return -1;
	}
	
	public void printAllBandsInfo() {
		for(int i=0; i<bandCnt; i++) {
			bands[i].printBandInfo();
		}
	}
}
