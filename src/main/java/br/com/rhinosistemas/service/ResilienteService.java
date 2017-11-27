package br.com.rhinosistemas.service;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.rhinosistemas.util.ResilienteUtil;

@Service
public class ResilienteService {
	
	public String getListaConsumidorSucesso() {
		return ResilienteUtil.getListaTotalConsumidor();
	}

	@HystrixCommand(fallbackMethod = "fallbackGetListaConsumidor")
	public String getListaConsumidor() {
		for (int i = 0 ; i <= 5;) {
			if (i % 2 == 0) {
				return ResilienteUtil.getListaTotalConsumidor();
			}
		}
		return ResilienteUtil.getListaTotalConsumidor();
	}
	
	public String fallbackGetListaConsumidor(Throwable t) {
		return ResilienteUtil.getListaReduzidaConsumidor(t);
	}
	
	@HystrixCommand(fallbackMethod = "fallbackGetListaSegundo")
	public String getListaSegundo() {
		for (int i = 0 ; i <= 5;) {
			if (i % 2 == 0) {
				return ResilienteUtil.getListaTotalConsumidor();
			}
		}
		return ResilienteUtil.getListaTotalConsumidor();
	}
	
	public String fallbackGetListaSegundo(Throwable t) {
		return ResilienteUtil.getListaReduzidaConsumidor(t);
	}
	
}
