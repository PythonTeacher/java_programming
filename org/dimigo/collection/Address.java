/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ Address
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 20.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Address {
	private String sido;
	private String dong;
	private String detailAddress;
	/**
	 * @return the sido
	 */
	public String getSido() {
		return sido;
	}
	/**
	 * @param sido the sido to set
	 */
	public void setSido(String sido) {
		this.sido = sido;
	}
	/**
	 * @return the dong
	 */
	public String getDong() {
		return dong;
	}
	/**
	 * @param dong the dong to set
	 */
	public void setDong(String dong) {
		this.dong = dong;
	}
	/**
	 * @return the detailAddress
	 */
	public String getDetailAddress() {
		return detailAddress;
	}
	/**
	 * @param detailAddress the detailAddress to set
	 */
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	@Override
	public String toString() {
		return "Address [sido=" + sido + ", dong=" + dong + ", detailAddress="
				+ detailAddress + "]";
	}
	
}
