package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Message;
import com.example.demo.form.MessageForm;
import com.example.demo.mapper.MessageMapper;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {

	private final MessageMapper messageMapper;

	@GetMapping
	public String list(@ModelAttribute("messageForm") MessageForm messageForm, Model model) {
		model.addAttribute("messages", messageMapper.findAll());
		return "messages/lst";
	}

	@PostMapping
	public String create(@Valid @ModelAttribute("messageForm") MessageForm messageForm,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("messages", messageMapper.findAll());
			return "messages/lst";
		}
		Message message = new Message();
		message.setContent(messageForm.getContent());
		messageMapper.insert(message);
		return "redirect:/messages";
	}
}
