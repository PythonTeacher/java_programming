/**
 * 
 */
package org.dimigo.gui;

import javafx.beans.property.SimpleStringProperty;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ IdolGroup
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 3.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class IdolGroup {
	private SimpleStringProperty memberName;
	private SimpleStringProperty role;
	private SimpleStringProperty imageFileName;
	private SimpleStringProperty urlAddress;
	
	/**
	 * @param memberName
	 * @param imageFileName
	 * @param urlAddress
	 */
	public IdolGroup(String memberName, String role, String imageFileName, String urlAddress) {
		this.memberName = new SimpleStringProperty(memberName);
		this.role = new SimpleStringProperty(role);
		this.imageFileName = new SimpleStringProperty(imageFileName);
		this.urlAddress = new SimpleStringProperty(urlAddress);
	}

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName.get();
	}

	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName.set(memberName);
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role.get();
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role.set(role);
	}

	/**
	 * @return the imageFileName
	 */
	public String getImageFileName() {
		return imageFileName.get();
	}

	/**
	 * @param imageFileName the imageFileName to set
	 */
	public void setImageFileName(String imageFileName) {
		this.imageFileName.set(imageFileName);
	}

	/**
	 * @return the urlAddress
	 */
	public String getUrlAddress() {
		return urlAddress.get();
	}

	/**
	 * @param urlAddress the urlAddress to set
	 */
	public void setUrlAddress(String urlAddress) {
		this.urlAddress.set(urlAddress);
	}

	@Override
	public String toString() {
		return "IdolGroup [memberName=" + memberName + ", role=" + role
				+ ", imageFileName=" + imageFileName + ", urlAddress="
				+ urlAddress + "]";
	}
	
}
