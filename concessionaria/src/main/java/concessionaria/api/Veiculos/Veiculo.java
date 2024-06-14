package concessionaria.api.Veiculos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


    @Table(name = "locadora")
    @Entity(name = "Veiculo")
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = "id")
    public class Veiculo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String marca;
        private String modelo;
        private String ano;
        private String cor;
        private int numeroDePortas;


        @Enumerated(EnumType.STRING)
        private Combustivel combustivel;


        public Veiculo(DadosCadastroVeiculos veiculos) {
            this.ano = veiculos.ano();
            this.marca = veiculos.marca();
            this.modelo = veiculos.modelo();
            this.cor = veiculos.cor();
            this.numeroDePortas = veiculos.numeroDePortas();
            this.combustivel = veiculos.combustivel();
        }
    }

