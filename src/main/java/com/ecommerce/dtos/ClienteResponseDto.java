package com.ecommerce.dtos;

import com.ecommerce.models.Cliente;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClienteResponseDto {
	private String message;
	private Cliente data;

}
