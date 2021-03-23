package fr.esiea.ex4A.Api_inscription;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class InscriptionController {

    private final InscriptionRepository InscriptionRepository;

    InscriptionController(InscriptionRepository InscriptionRepository) {
        this.InscriptionRepository = InscriptionRepository;
    }

    @GetMapping(path = "/api/inscription", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> inscription(@RequestBody InscriptionData user) {
        if ( !InscriptionRepository.utilisateurAdd(user) ) {
            InscriptionRepository.addUser(user);
            return ResponseEntity.ok("Le User a bien été ajouté");
        }
        return ResponseEntity.ok("Le user demandé existe déjà");
    }
}
