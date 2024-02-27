package br.com.gustavom.crudredis.service;

import br.com.gustavom.crudredis.domain.Usuario;
import br.com.gustavom.crudredis.repository.RedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RedisService {

    private final RedisRepository repository;

    @Autowired
    public RedisService(RedisRepository repository) {
        this.repository = repository;
    }

    public void gravaUsuario(Usuario usuario){
        repository.save(usuario);
    }

    public Usuario getUsuario(UUID id){
        return repository.findByid(id);
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

    public boolean updateByid(UUID id, Usuario usuario){
        return repository.updateById(id,usuario);
    }

}
