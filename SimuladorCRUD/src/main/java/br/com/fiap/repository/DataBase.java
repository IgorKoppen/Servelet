package br.com.fiap.repository;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import br.com.fiap.model.Usuario;

public class DataBase {
private static List<Usuario> lista = new ArrayList<>();
private static int id = 1;

public static void adiciona(Usuario usuario) {
	usuario.setId(id++);
	lista.add(usuario);
}
public static void remove(int id) {
	Iterator<Usuario> it = lista.iterator();
	while(it.hasNext()) {
		Usuario usuario = it.next();
		if(usuario.getId() == id) {
			it.remove();
		}
	}
}

public static List<Usuario> buscaTodos(){
	return lista;
}

public static Usuario buscaUsuarioID(int id) {
	for(Usuario usuario : lista) {
		if(usuario.getId() == id) {
			return usuario;
		}
	}
	return null;
}
}

