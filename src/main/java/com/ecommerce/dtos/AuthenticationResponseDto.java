package com.ecommerce.dtos;

import com.ecommerce.models.Cliente;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthenticationResponseDto {
	
	private String message;
	private String accessToken;
	private Cliente data;
	

}
