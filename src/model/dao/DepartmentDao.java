package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	//Operação que insere, atualiza e deleta no Banco de Dados o objeto obj parametrizado
	void insert (Department obj);
	void update (Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	
}
