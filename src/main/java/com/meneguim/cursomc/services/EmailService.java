package com.meneguim.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.meneguim.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
