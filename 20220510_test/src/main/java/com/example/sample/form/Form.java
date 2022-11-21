package com.example.sample.form;

import javax.validation.constraints.Size;

public class Form {
	//フィールド変数
	@Size(min=1, max=10, message="1～10文字以内にしてください")
	private String name1;
	
	//コンストラクタ
	public Form() { }
	
	//アクセサメソッド
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
}
