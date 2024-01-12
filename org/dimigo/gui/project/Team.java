/**
 * 
 */
package org.dimigo.gui.project;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * <pre>
 * org.dimigo.gui.selection
 *   |_ Team
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Team {
	
	private SimpleStringProperty number;
	private SimpleStringProperty member;
	
	/**
	 * @param number
	 * @param member
	 */
	public Team(String number, String member) {
		this.number = new SimpleStringProperty(number);
		this.member = new SimpleStringProperty(member);
	}
	
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number.get();
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number.set(number);
	}
	/**
	 * @return the member
	 */
	public String getMember() {
		return member.get();
	}
	/**
	 * @param member the member to set
	 */
	public void setMember(String member) {
		this.member.set(member);
	}
	
	@Override
	public String toString() {
		return number.get() + "|" + member.get();
	}	
	
}
