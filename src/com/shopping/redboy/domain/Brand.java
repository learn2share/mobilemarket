package com.shopping.redboy.domain;

import com.shopping.redboy.annotation.JSON;

import android.graphics.Bitmap;

public class Brand {
	@JSON(name = "id", type = String.class)
	private String id;
	@JSON(name = "name", type = String.class)
	private String name;
	@JSON(name = "pic", type = String.class)
	private String pic;
	private Bitmap bitmap;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Bitmap getBitmap() {
		return bitmap;
	}

	public void setBitmap(Bitmap bitmap) {
		this.bitmap = bitmap;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", pic=" + pic
				+ ", bitmap=" + bitmap + "]";
	}

}
