package br.com.rhinosistemas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.rhinosistemas.service.ResilienteService;

@Controller
@RequestMapping(value="/consumidor")
public class ResilienteController {
	
	@Autowired
	private ResilienteService consumidorService;
	
	@RequestMapping(value = "/chamadaNormal")
	@ResponseBody
	public String getChamadaNormal() {
		return consumidorService.getListaConsumidorSucesso();
	}
	
	
	@RequestMapping(value = "/chamadaQuebrada")
	@ResponseBody
	public String getChamadaQuebrada() {
		return consumidorService.getListaConsumidor();
	}
	
	@RequestMapping(value = "/chamadaSegundo")
	@ResponseBody
	public String getChamadaSegundo() {
		return consumidorService.getListaSegundo();
	}
}
