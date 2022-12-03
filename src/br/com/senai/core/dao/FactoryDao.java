package br.com.senai.core.dao;

import br.com.senai.core.dao.postgresql.DaoPostgresqlCidade;
import br.com.senai.core.dao.postgresql.DaoPostgresqlEndereco;
import br.com.senai.core.dao.postgresql.DaoPostgresqlFrete;


public class FactoryDao  {

	private static FactoryDao instance;
	
	private FactoryDao() {}
	
	public DaoCidade getDaoCidade() {
		return new DaoPostgresqlCidade();
	}
	
	public DaoFrete getDaoFrete() {
		return new DaoPostgresqlFrete();
	}
	
	public DaoEndereco getDaoEndereco() {
		return new DaoPostgresqlEndereco();
	}
	
	public static FactoryDao getInstance() {
		if (instance == null) {
			instance = new FactoryDao();
		}
		return instance;
	}
	
	
	
}
