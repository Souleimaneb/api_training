package fr.esiea.ex4A.Inscription;

import fr.esiea.ex4A.Api_inscription.InscriptionData;
import fr.esiea.ex4A.Api_inscription.InscriptionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class InscriptionControllerIT {

    private final MockMvc mockMvc;

    @MockBean
    private InscriptionRepository repository;

    InscriptionControllerIT(@Autowired MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    void inscription_to_repository_with_user_informations() throws Exception {
        when(repository.addUser(any(InscriptionData.class))).thenReturn(new InscriptionData());
        mockMvc
            .perform(MockMvcRequestBuilders.post("/api/inscription")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                {
                "userEmail": "machin@truc.com",
                "userName": "machin",
                "userTweeter": "machin45",
                "userCountry": "FR",
                "userSex": "M",
                "userSexPref": "M"
                }""")
                .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("Le User a bien ete ajoute")));
        verify(repository).addUser(new InscriptionData("machin", "machin@truc.com",
            "machin45", "FR", "M", "M"));
    }
}
