package org.dimigo.oop;

public class Band {

	private String bandName;
	private String titleSong;
	private int memberCnt;
	private String[] memberName;

	public Band() {

	}

	public Band(String bandName, String titleSong, int memberCnt,
			String[] memberName) {
		super();
		this.bandName = bandName;
		this.titleSong = titleSong;
		this.memberCnt = memberCnt;
		this.memberName = memberName;
	}

	/**
	 * @return the bandName
	 */
	public String getBandName() {
		return bandName;
	}

	/**
	 * @param bandName
	 *            the bandName to set
	 */
	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	/**
	 * @return the titleSong
	 */
	public String getTitleSong() {
		return titleSong;
	}

	/**
	 * @param titleSong
	 *            the titleSong to set
	 */
	public void setTitleSong(String titleSong) {
		this.titleSong = titleSong;
	}

	/**
	 * @return the memberCnt
	 */
	public int getMemberCnt() {
		return memberCnt;
	}

	/**
	 * @param memberCnt
	 *            the memberCnt to set
	 */
	public void setMemberCnt(int memberCnt) {
		this.memberCnt = memberCnt;
	}

	/**
	 * @return the memberName
	 */
	public String[] getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName
	 *            the memberName to set
	 */
	public void setMemberName(String[] memberName) {
		this.memberName = memberName;
	}

	public void printBandInfo() {
		System.out.println("<< " + bandName + " >>");
		System.out.println("대표곡 : " + titleSong);
		System.out.println("멤버수 : " + memberCnt + "명");
		System.out.print("멤버명 : ");

		for (String member : memberName) {
			System.out.print(member + " ");
		}

		System.out.println();
		System.out.println();
	}

}
