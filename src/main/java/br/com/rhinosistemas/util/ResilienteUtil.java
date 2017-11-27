package br.com.rhinosistemas.util;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import br.com.rhinosistemas.bean.ResilienteBean;

public class ResilienteUtil {
	
	public static String getListaTotalConsumidor() {
		List<ResilienteBean> listaRetorno = new ArrayList<>();
		
		for (int i = 0; i <= 10; i++) {
			ResilienteBean bean = new ResilienteBean();
			bean.setNomeConsumidor("Nome Total " + i);
			bean.setProdutoConsumido("Produto Total " + i);
			
			listaRetorno.add(bean);
		}
		
		Gson gson = new Gson();
		return gson.toJson(listaRetorno);
	}

	public static String getListaReduzidaConsumidor(Throwable t) {
		List<ResilienteBean> listaRetorno = new ArrayList<>();
		
		ResilienteBean beanExtra = new ResilienteBean();
		beanExtra.setNomeConsumidor("Nome Caiu no FallBack");
		beanExtra.setProdutoConsumido("Produto Caiu no FallBack");
		
		listaRetorno.add(beanExtra);
		
		Gson gson = new Gson();
		return gson.toJson(listaRetorno);
	}
	
}
