package com.app.model;

public class Moter {
	private int moterId;
	private String moderName;
	private String moterModel;
	/**
	 * @return the moterId
	 */
	public int getMoterId() {
		return moterId;
	}
	/**
	 * @param moterId the moterId to set
	 */
	public void setMoterId(int moterId) {
		this.moterId = moterId;
	}
	/**
	 * @return the moderName
	 */
	public String getModerName() {
		return moderName;
	}
	/**
	 * @param moderName the moderName to set
	 */
	public void setModerName(String moderName) {
		this.moderName = moderName;
	}
	/**
	 * @return the moterModel
	 */
	public String getMoterModel() {
		return moterModel;
	}
	/**
	 * @param moterModel the moterModel to set
	 */
	public void setMoterModel(String moterModel) {
		this.moterModel = moterModel;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Moter [moterId=" + moterId + ", moderName=" + moderName
				+ ", moterModel=" + moterModel + "]";
	}
	
}
