package com.example.demo.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class MessageForm {

	@NotBlank(message = "メッセージを入力してください")
	@Size(max = 255, message = "255文字以内で入力してください")
	private String content;
}
