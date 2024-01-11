package main;

import model.Medico;
import model.Usuario;
import repository.MedicoRepository;
import repository.Repository;
import repository.UsuarioRepository;

public class Main {

    public static void main(String[] args) {

//        Medico juan = new Medico();
//        
//        juan.setId(2);
//        juan.setNombre("Juan");
//        juan.setApellido("Martinez");
//        juan.setDocumento("145545444");
//        juan.setCorreoElectronico("juan.martinez2@gmail.com");
//        
//        Repository<Medico> repository = new MedicoRepository();
//        
//        repository.findAll().forEach(System.out::print);
//        
//        System.out.println("");
//        
//        repository.save(juan);
//        
//        repository.findAll().forEach(System.out::print);
//        
        MedicoRepository repository = new MedicoRepository();

        System.out.println(repository.findAll());

    }
}
