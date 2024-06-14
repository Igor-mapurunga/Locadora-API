package concessionaria.api.Controller;

import concessionaria.api.Veiculos.DadosCadastroVeiculos;
import concessionaria.api.Veiculos.Veiculo;
import concessionaria.api.Veiculos.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {
    @Autowired
    private VeiculoRepository repository;

    @PostMapping
    public void cadastrar (@RequestBody DadosCadastroVeiculos veiculos) {
        repository.save(new Veiculo(veiculos));
    }

}
