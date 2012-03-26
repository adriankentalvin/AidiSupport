package com.android.aidiapplication.db.models;

import java.util.ArrayList;
import java.util.List;

public class BodyPartsGroup {

	private int bodyPartsGroupId;
	private String bodyPartsName;
	private List<BodyParts> bodyPartList = new ArrayList<BodyParts>();

	public BodyPartsGroup(int bodyPartsGroupId, String bodyPartsName,
			List<BodyParts> bodyPartList) {
		super();
		this.bodyPartsGroupId = bodyPartsGroupId;
		this.bodyPartsName = bodyPartsName;
		this.bodyPartList = bodyPartList;
	}

	public int getBodyPartsGroupId() {
		return bodyPartsGroupId;
	}

	public void setBodyPartsGroupId(int bodyPartsGroupId) {
		this.bodyPartsGroupId = bodyPartsGroupId;
	}

	public String getBodyPartsName() {
		return bodyPartsName;
	}

	public void setBodyPartsName(String bodyPartsName) {
		this.bodyPartsName = bodyPartsName;
	}

	public List<BodyParts> getBodyPartList() {
		return bodyPartList;
	}

	public void setBodyPartList(List<BodyParts> bodyPartList) {
		this.bodyPartList = bodyPartList;
	}

}
