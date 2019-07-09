package com.everis.academia.java.agenda.digital.web.soap;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;

@WebService()
public class CidadeSOAP {

	private ICidadeBusiness business = new CidadeBusiness();

	@WebMethod(operationName = "create")
	@WebResult(name = "cidade")
	public Cidade create(
			@WebParam(name = "cidade", mode = Mode.IN) Cidade cidade)
			throws BusinessException {

		business.create(cidade);
		return cidade;
	}
	
	@WebMethod(operationName="read")
	@WebResult(name="cidade")
	public List<Cidade> read (
			@WebParam(name = "cidade", mode = Mode.IN) Cidade cidade)
			throws BusinessException {
		
				business.read();
				return business.read();
	
	}
	
	
	
	@WebMethod(operationName="delete")
	@WebResult(name="cidade")
	public void delete(
			@WebParam(name="cidade", mode= Mode.IN)Cidade cidade)
			throws BusinessException {
			
		business.delete(cidade);
		
}

	@WebMethod(operationName="update")
	@WebResult(name="cidade")
	public void update(
			@WebParam(name="cidade",mode=Mode.IN)Cidade cidade)
			throws Exception{
	
		
		business.update(cidade);
		
		

}	
}
